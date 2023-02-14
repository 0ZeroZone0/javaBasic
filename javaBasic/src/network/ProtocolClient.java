package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyboard;

	public ProtocolClient() {
		try {								//9500 , 9600, 9700 등등...잡아서 해도 된다
			socket = new Socket("192.168.0.17" ,9500); //서버 IP, port
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			keyboard =  new BufferedReader(new InputStreamReader(System.in));
			
		} catch (UnknownHostException e) { //호스트를 모르겠다
			System.out.println("서버를 찾을 수 없습니다");
			e.printStackTrace();
			System.exit(0); //호스트를 모르니까 꺼야한다
		} catch (IOException e) {
			System.out.println("서버와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		};
		
		String msg = null;
		String line = null;
		while (true) {
			try {
				// 서버로 보내는 쪽											
				msg = keyboard.readLine(); //
				bw.write(msg+"\n");
				bw.flush();
				
				// 서버로 부터 온 메시지를 받는 쪽
				line = br.readLine();
				System.out.println(line);
				
				String[] ar = msg.split(":");
				if(ar[0].equals("200")) {
					br.close();
					bw.close();
					socket.close();
					
					keyboard.close();
					System.exit(0);
				};
				

			} catch (IOException e) {
				e.printStackTrace();
			};
		} // while
	};// ProtocolClient()
	
	
	public static void main(String[] args) {
		new ProtocolClient();
		
	};

};