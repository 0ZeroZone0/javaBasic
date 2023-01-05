package while_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user, count = 0;
		
		while(true)  {
			count = 0;
			com = (int)(Math.random()*100)+1;
			//System.out.println(com);
			
			while(true) { //무한루프
				System.out.print("숫자 입력 : ");
				user = Integer.parseInt(br.readLine());
				count++;
				
				if(com == user) break; //while문을 벗어나라
				if(com > user) System.out.println(user+"보다 큽니다");
				else if(com < user) System.out.println(user+"보다 작습니다");
				
				
			};//while
			
			System.out.println("\n "+ count + "번만에 맞추셨습니다. ");
			
			int yn;
			while(true) {
				System.out.print(" 또 할래 (Y/N) :");  //'y' "y"
		//		String 으로도 가능
		//		char yn = br.read();  // 2바이트를 4바이트가 받을수없으니 int로 변경
				yn = br.read();
				br.read();
				br.read();
				if(yn=='Y' || yn=='y' || yn=='N' || yn=='n') break;
			};
			
			if(yn=='N' || yn =='n') break;
		};//while
		
		System.out.println("프로그램을 종료합니다");
	};

};

/*
숫자맞추기 게임 - 컴퓨터 1~100 사이의 난수를 발생하면 사용자가 맞추는 게임
*/