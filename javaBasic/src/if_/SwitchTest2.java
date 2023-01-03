package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("a값 입력 : ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("b값 입력 : ");
			int b = Integer.parseInt(br.readLine());
			
			System.out.print("연산자(+,-,*,/)를 입력 : ");
//			String op =br.readLine(); // case " " 로 해야함
//			int op = br.read();  //case '' 로 해야함
			int op = System.in.read();
//			char op = (char) Integer.parseInt(br.readLine());
			
			switch(op) {
			case '+' : System.out.println(a + "+" + b + "=" + (a+b)); break;
			case '-' : System.out.println(a + "-" + b + "=" + (a-b)); break;	
			case '*' : System.out.println(a + "*" + b + "=" + (a*b)); break;
			case '/' : System.out.println(a + "/" + b + "=" + String.format("%.2f",(double)a/b)); break;
			default : System.out.println("연사자 error");
			
			};
	};
	
};

			
			
			
/*
2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오

[실행결과]
a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/) 입력 : +
25 + 36 = xx

a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/) 입력 : /
25 / 36 = 0.xxx

a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/) 입력 : #
연산자 error
*/