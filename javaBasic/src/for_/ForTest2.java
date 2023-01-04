package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 단을 입력 : ");
//		int dan = Integer.parseInt(br.readLine());
//		int dan = br.read()-48;  ///1개 문자
		int dan = br.read()-'0'; ///1개 문자
		
		for(int i=1; i<=9; ++i) {
			System.out.println(dan + " * " + i +" = " + dan*i);
			
		};
	
	};

};

/*
원하는 단을 입력 : 2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6


2 * 9 =18
*/