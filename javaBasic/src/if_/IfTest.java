package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("데이터 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		if(a>=50) System.out.println(a+"는 50보다 크거나 같다");
		else System.out.println(a+"는 50보다 작다");
		System.out.println();
	
		System.out.println("C");
		System.out.println();
		
		//if(a%2 == 1) 밑에  if(a%2 != 0) 이거랑 같다 / 같이 홀수인가 묻는 if문
		if(a%2 != 0) System.out.println(a + "는 홀수");
		else System.out.println(a + "는 짝수");
		
		//if(a의 값이 대문자? 'A' 65 ~ 'Z' 90)
		//if(a >= 65 && (a <= 65)  이거랑  if(a >= 'A' && a <= 'Z') 같다
		if(a >='A' && a <='Z') System.out.println((char)a + "는 대문자"); //65~99
		else if (a >='a' && a <='z') System.out.println((char)a + "는 소문자"); //97~122
		else System.out.println((char)a + "는 숫자이거나 특수문자");
		
		
			
	}

}