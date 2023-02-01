package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain {

	public static void main(String[] args) {
		if(args.length == 1)System.out.println("args[0] = " + args[0]);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=0, b=0;
		
		try {
		System.out.print("정수 입력 : ");
		a = Integer.parseInt(br.readLine());//엔터를 치기전까지 한줄로본다.
		
		System.out.print("정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.println(a + " / " + b + " = " + a/b );
		
		}catch(IOException io) {
			io.printStackTrace();//IOException에 대한 에러가 나면 그에 대한 메세지를 뿌려준다
		}catch(NumberFormatException e) {//에러형식을 바꾼다
			System.out.println("숫자만 입력하세요");
			 e.printStackTrace();
//			System.exit(0);//이렇게 해야지 밑으로 안내려간다
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누시면 안됩니다");
//			e.printStackTrace();     //머야 에러얌? 수정해
//			System.exit(0);
		}finally {
			System.out.println("error가 있건 없건 무조건 실행!!");
		};
	};
};