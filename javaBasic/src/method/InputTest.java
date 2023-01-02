package method;

import java.io.IOException;

public class InputTest {
	

	public static void main(String[] args) throws IOException {
		System.out.print("데이터 : ");
		int a = System.in.read();//1개 문자 > 딱히 써먹을데가 없다.
		
		System.out.println("결과 = " + a);

	};

};


/*
IO Stream (Input Output 입출력)

- Console (System)
입력 : System.in
출력 : System.out
*/