package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	
	public ProtocolServer() {
		try {
			serverSocket = new ServerSocket(9500);//9500번에서 손님이 오는지 기다리는거다 ~! 들어오라고!
			System.out.println("서버준비완료..");
			
			socket = serverSocket.accept(); //낚아채서 클라이언트와 연결할 소켓을 생성해준다
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		};
		//-----------------------------------------
		String line = null;
		
		while(true) {
			
			try {
				//클라이언트로 부터 온 메세지를 받는 쪽
				line = br.readLine();
								
				//클라이언트로 보내는 쪽 
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)) { 					//엔터앞까지만 읽어줌 
					bw.write(ar[1]+"님이 입장하였습니다\n"); //반드시 \n 해야지 readLine이 읽는데 엔터값을 기준으로 해서 읽기때문에
					
					bw.flush();//다음데이터가 들어가기 위해 비어줘야한다.
				}else if(ar[0].equals(Protocol.EXIT)) {
					bw.write(ar[1]+"님이 퇴장하였습니다\n");
					bw.flush();
					
					br.close();
					bw.close();
					socket.close();	
					
					System.exit(0);
					
				}else if (ar[0].equals(Protocol.SEND_MESSAGE)) {
					bw.write("["+ar[1]+"] "+ar[2]+"\n");
					bw.flush();
					
				};
				
				
			} catch (IOException e) {
				e.printStackTrace();
			};
			
			
			
			
		}//while
	};//ProtocolServer()
	
	public static void main(String[] args) {
		new ProtocolServer();
		
	};

};