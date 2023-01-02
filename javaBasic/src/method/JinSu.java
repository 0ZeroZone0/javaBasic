package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JinSu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("10진수 입력 : ");
		int dec = Integer.parseInt(br.readLine());
		
		String binary = Integer.toBinaryString(dec);  //String인 이유는 api에서 정해준거라서 못바꿈
		String octal = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);
		
		System.out.println ("2진수 = "  + binary);
		System.out.println ("8진수 = "  + octal);
		System.out.println ("16진수 = " + hexa);
		
	};

};

/*
10진수(dec)를 입력받아서 2진수(binary), 8진수(octal), 16진수(hexa)로 변환하여 출력하시오
(Integer 클래스의 메소드 이용하시오)

[실행결과]
10진수 입력: 250
2진수 = 11111010
8진수 = 372
16진수 = fa
*/