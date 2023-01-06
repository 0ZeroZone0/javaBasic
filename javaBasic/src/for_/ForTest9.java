package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 int x, mul;
	      
	      while(true) {
	    	  mul=1; //초기화
	         
	         System.out.print("숫자 입력 : ");
	         x = br.read()-48;//입력되는건 문자다 //1개의문자//그래서 숫자로 만들려고 -48
	         br.read();//13
	         br.read();//10
	         
	         if(x==0) break;
		
	         for(int i=1; i<=x; i++) {
	            mul *= i;
	         };
	         
	         System.out.println(x+"! = " + mul);
	      };//while
	      
	      System.out.println("프로그램을 종료합니다");
		
	};//main

};

/*
 * 팩토리얼 계산 x의 값이 0이 들어오면 종료 (무한루프) for, while
 * 
 * [실행계산] 
 * 
 * 숫자 입력 : 3 <- br.read() - 1개 문자 3! = 6 (1*2*3)
 * 
 * 숫자 입력 : 9 9! = 362880 (1*2*3*...*9)
 * 
 * 숫자 입력 : 0 프로그램을 종료합니다
 * 
 */