package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("월 입력 : ");
			int month = Integer.parseInt(br.readLine());
			int days = 0; //쓰레기값 가비지값이 안생겨서 초기값줘야한다.
			
			
			switch(month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 : days=31; break; // 브레이크 안쓰면 밑으로 내려가서 맨마지막값을 가지고 나감
		 	
			case 2 : days=28; break;
			
			case 4 : 
			case 6 :  
			case 9 :  
			case 11 : days=30;
			
			}; //switch

			System.out.println(month+ "월은 " + days + "일 입니다");
	};

};



//월 입력 : 3
//3월은 31일 입니다
//
//월 입력 : 2
//2월은 28일 입니다