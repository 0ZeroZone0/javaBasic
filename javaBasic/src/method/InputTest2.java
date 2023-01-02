package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		double b;
		
		System.out.print("정수 입력하세요 ");
		a = Integer.parseInt(br.readLine()); //문자열로 가지고온다
		// 자바에서 말하는 한줄은 Enter를 칠 때 까지를 한줄로 친다.
		
		System.out.print("실수 입력하세요 ");
		b = Double.parseDouble(br.readLine());
	
		System.out.println(a + " + " + b + " = " + (a+b));
		
	};

};

/*
IO Stream (Input Output 입출력)

입력 : Reader
- BufferedeReader   //버퍼를 통해서 읽고싶다
- FileReader        //파일로 읽고싶다
- InputStreamReader //키보드를통해서 읽고싶다

출력 : Writer
- BufferedWriter
- FileWriter
*/