package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a , b , c ;
		
		System.out.print("첫번째 수 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 수 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("세번째 수 : ");
		c = Integer.parseInt(br.readLine());
		
		if(a<b && a<c) { //a가 제일 작을 때
			
			if(b<c) System.out.println(a+ "," +b +"," + c);
			else System.out.println(a+ "," +c +"," + b);
				
		}else if(b<c) { //b가 제일 작을 때
			if(a<c) System.out.println(b+ "," +a +"," + c);
			else System.out.println(b+ "," +c +"," + a);
			
		
		}else {//c가 제일 작을 때
			if(a<b) System.out.println(c+ "," +a +"," + b);
			else System.out.println(c+ "," +b +"," + a);
			
		};
    };
};

/*
 * 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 단) if만 쓰세요
 * 
 * [실행결과] 
 * 첫번째 과목 점수 : 85 
 * 두번째 과목 점수 : 80 
 * 세번째 과목 점수 : 65 
 * 65 80 85
 * 
 * 첫번째 과목 점수 : 62 
 * 두번째 과목 점수 : 60 
 * 세번째 과목 점수 : 80 
 * 60 62 80
 */