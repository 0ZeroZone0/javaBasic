package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//ServerSocket - 클라이언트를 계속 기다린다.
//			   - 클라이언트가 접속을 하면 낚아채서
//               클라이언트와 대화 할 소켓을 만들어 준다(accept()).
//               만들어진 socket은 Handler에게 줘야한다

public class ChatServerObject {
	private ServerSocket serverSocket;
	private List<ChatHandlerObject> list;
	
	public ChatServerObject() {
		try {
			//소켓 생성
			serverSocket = new ServerSocket(9500);
			System.out.println("서버 준비 완료...");
			
			//리스트 생성
			list = new ArrayList<ChatHandlerObject>();
			
			//다중채팅이라 들어올 수만큼 낚아채야한다
			while(true) {
				
				//낚아채서 소켓 만들기
				Socket socket = serverSocket.accept();
				
				//ChatHandler 생성해서 생성자로 소켓과 list 보내기
				ChatHandlerObject chatHandler = new ChatHandlerObject (socket, list); //스레드 생성
				//스레드 시작 - 스레드 실행(run())
				chatHandler.start();
				
				//리스트에 담기
				list.add(chatHandler);//각각의 대화를 처리하기위해 리스트에 담기
				
			}//while
			
		} catch (IOException e) {
			e.printStackTrace();
		};
	};

	public static void main(String[] args) {
		new ChatServerObject();
	};
	
};