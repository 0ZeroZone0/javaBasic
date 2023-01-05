package while_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		
		System.out.print("a 입력 : ");
		a = br.read();
		br.read(); //enter 값 13을 읽어준다
		br.read(); //enter 값 1을 읽어준다
		
		System.out.print("b 입력 : ");
		b = br.read();

		System.out.print(a + " , " + b);

	};

};