package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest8 {

	   public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int x, y, mul;
	      
	      while(true) {
	         mul=1; //초기화
	         
	         System.out.print("x값 입력 : ");
	         x = Integer.parseInt(br.readLine());
	         if(x==0) break;
	         
	         System.out.print("y값 입력 : ");
	         y = Integer.parseInt(br.readLine());
	                  
	         for(int i=1; i<=y; i++) {
	            mul *= x;
	         };
	         
	         System.out.println(x+"의 "+y+"승 "+mul);
	      };//while
	      
	      System.out.println("프로그램을 종료합니다");
	   };

	};
		

/*
 * 
 * x의 y승을 구하시오 x의 값이 0이 들어오면 종료 (무한루프) for, while
 * 
 * [실행결과] x값 입력 : 2 y값 입력 : 5 2의 5승 xx (2*2*2*2*2)
 * 
 * x값 입력 : 0 프로그램을 종료합니다
 * 
 */