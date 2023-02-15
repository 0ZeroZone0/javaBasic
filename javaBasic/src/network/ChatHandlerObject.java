package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

//			클라이언트와 직접 교류하는 handler
public class ChatHandlerObject extends Thread {
	private Socket socket;
	private List<ChatHandlerObject> list;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public ChatHandlerObject(Socket socket,List<ChatHandlerObject> list) throws IOException {
		this.socket = socket;
		this.list = list;
		
		//클라이언트에서 데이터를 보내주니까 서버에서는 클라이언트 데이터를 먼저 받기위해 IO 생성
		
		//IO 생성
		//ois보다 먼저 생성 해줘야 한다. //출력스트림을 먼저 생성해야 한다. (안그러면 입장 메세지가 안뜬다)
		//서브측에서 무조건 출력스트림이 떠야지 받을수 있다.
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
	};
	
	
	@Override
	public void run() {
		String nickName = null;
		//받는 InfoDTO
		InfoDTO infoDTO = null; //EX ) 딸기를 저장해둔다

		while (true) {
			try {

				//클라이언트에게서 dto 갖고오기
				                //ois는infoDTO를 줘서 굳이 new를 안해줘도 된다. 근데 new 해도되고 안해도 된다.
				infoDTO = (InfoDTO)ois.readObject();
				
				if(infoDTO.getCommand()==Info.JOIN) {
					nickName = infoDTO.getNickName(); //닉네임 보관 //SEND할때 닉넴도 함께보내줘야하니까 미리 보관해주자.
					
					//나를 포함한 모든클라이언트한테 입장메세지 보내주기.
					InfoDTO sendDTO = new InfoDTO();// 보내는 infoDTO
					// 저장된 딸기(위에 받는 infoDTO)를 sendDTO는 딸기님이 입장했습니다 라고 보내주면된다.
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage(nickName + "님이 입장하였습니다");
					broadcast(sendDTO);//모두에게 뿌려주기
					
				}else if(infoDTO.getCommand()==Info.EXIT) {
					InfoDTO sendDTO = new InfoDTO();
					
					//나간 클라이언트에게 quit를 답장 보내고 close()를 한다
					sendDTO.setCommand(Info.EXIT); //나가요~
					oos.writeObject(sendDTO);
					oos.flush();
					
					ois.close();
					oos.close();
					socket.close();
					//나한테만 보내주는거니까 broadcast는 할 필요가없다.
					
					
					//남은 나머지 클라이언트에게 퇴장 메세지를 보내주기
					list.remove(this);
					
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage(nickName +"님이 퇴장하였습니다.");
					
					broadcast(sendDTO);//이건 나머지 클라이언트에게만 뿌려야해서
					break;//이제 while문 빠져나와야한다.
					
				} else if (infoDTO.getCommand() == Info.SEND) {
					InfoDTO sendDTO = new InfoDTO(); //보내는 infoDTO
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage("[" + nickName + "]" + infoDTO.getMessage());
					broadcast(sendDTO);

				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} // while

	};// run()

	private void broadcast(InfoDTO sendDTO) {
		for( ChatHandlerObject handler  :list) {
	
			try {
				handler.oos.writeObject(sendDTO); //지금 메세지 보내주기
				handler.oos.flush(); 
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		};//for
		
	};//broadcast(InfoDTO sendDTO)
};