package network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClientObject extends JFrame implements ActionListener, Runnable {
	private JTextArea output;
	private JTextField input;
	private JButton sendBtn;
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	public ChatClientObject() {
		
		output = new JTextArea();
		output.setFont(new Font("나눔고딕",Font.BOLD,20));
		JScrollPane scroll =new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		output.setEditable(false); //입력못하게 원천봉쇄		
		
		input = new JTextField();
		sendBtn = new JButton("보내기");
		
		JPanel southP = new JPanel();
		southP.setLayout(new BorderLayout());
		southP.add("Center",input);
		southP.add("East",sendBtn);
		
		Container con = this.getContentPane();
		con.add("Center",scroll);
		con.add("South",southP);
		
		setTitle("채팅창");
		setBounds(500,500,300,300);
		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() { //추상메소드X 추상클래스라서 익명inner
		
			@Override
			public void windowClosing(WindowEvent e) { //창을 종료하겠다
				
				InfoDTO infoDTO  = new InfoDTO();
				infoDTO.setCommand(Info.EXIT);// 나갈거얌~
				try {
					oos.writeObject(infoDTO);//서버에 나갈거라고 보내주고 기다리기
					oos.flush();
				}catch(IOException io) {
					io.printStackTrace();
				}
			};
		});
	};//ChatClientObject()
	
	public void service() {

		String serverIP =
				JOptionPane.showInputDialog(this, "서버 IP를 입력하세요", "192.168.0.");//디폴트로 잡아주고
	
		if(serverIP ==null || serverIP.length()==0) {//위에 취소누르면 바로 null값 떨어지니까 그럼에러나서 막아줘야한다.
			System.out.println("서버IP가 입력되지 않았습니다");
			System.exit(0);
		};
		
		String nickName = 
				JOptionPane.showInputDialog(this,"닉네임을 입력하세요","닉네임",JOptionPane.INFORMATION_MESSAGE);
		
		//닉네임 입력이 없을 때
		if(nickName ==null || nickName.length()==0) {//닉네임을 안정해주면 게스트로 지정해주자~
			nickName ="guest";
		};
		
		 try {
			 //소켓 생성
			socket = new Socket(serverIP,9500); //EX)핸드폰을 삼~
			
			//IO 생성
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			//닉네임을 서버로 보내기 --> 서버가 열리면 가장 먼저해줘야할거
			InfoDTO infoDTO = new InfoDTO();//DTO를 받고 DTO로 정리할거라서
			infoDTO.setCommand(Info.JOIN);//입장
			infoDTO.setNickName(nickName);//닉네임 보내기
			oos.writeObject(infoDTO);//DTO를 보내주기
			oos.flush();
		 
		 } catch (UnknownHostException e) {//없는 번호다
				System.out.println("서버를 찾을 수 없습니다");
				e.printStackTrace();
				System.exit(0); //호스트를 모르니까 꺼야한다
		} catch (IOException e) {//통화중이다~
				System.out.println("서버와 연결이 안되었습니다");
				e.printStackTrace();
				System.exit(0);//호스트와 연결이 안되니까 꺼줘야한다.
		 
		}
		 
		 //스레드 생성
		 Thread t = new Thread(this);
		 
		 //스레드 시작 - 스레드 실행 (run()를 찾아서 수행)
		 t.start();
		 
		 
		 //이벤트발생
		 input.addActionListener(this);//엔터누르면 보내지기
		 sendBtn.addActionListener(this);//버튼누르면 보내지기
		 
	};//service()
	
	@Override
	public void run() {//서버로 부터 오는 메세지
		//서버에서 온걸 받는 쪽
		InfoDTO infoDTO = null;
		
		while(true) {
			try {
				//infoDTO가 받아야하니까 형변환 시켜주자!
				infoDTO = (InfoDTO)ois.readObject(); // 자식 = (자식)부모
				
				if(infoDTO.getCommand()==Info.EXIT) {//서버에서 온 응답도 끊자~이면
					ois.close();
					oos.close();
					socket.close();
					
					System.exit(0);
					
				}else if(infoDTO.getCommand()==Info.SEND) {//서버에서 서로 메세지를 주고받자고 올때
					output.append(infoDTO.getMessage()+"\n");
					int pos = output.getText().length();
					output.setCaretPosition(pos);//output에 입력된 글자수에 따라 스크롤이 자동으로 밑으로 맞춰진다.
				}
			}catch(IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}//while
		
	};//run()
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//보내는 쪽
		//메세지 보내줘야한다.
		String msg = input.getText(); //JTextField값 얻어오기
		
		InfoDTO infoDTO = new InfoDTO();
		
		//메세지에 quit를 친거랑 안녕이라고 친거랑 구분해줘야한다. 우린 quit를 close로 정했으니까.
		if(msg.toLowerCase().equals("quit")) {
			infoDTO.setCommand(Info.EXIT);//퇴장메세지 보내주기
		}else {
			infoDTO.setCommand(Info.SEND);//메세지에요~
			infoDTO.setMessage(msg);//메세지 보내주기
		};
		
		try {
			oos.writeObject(infoDTO);//dto보내주고
			oos.flush();
		}catch (IOException ee) {
			ee.printStackTrace();
		}
		input.setText("");//JTextField값 초기화 //대화창 비워주기
	};
	
	public static void main(String[] args) {
		new ChatClientObject().service();//생성자 생성//생성자 호출//서비스 호출
	};


	
};