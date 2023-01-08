package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] binary = new int[32];
		int i;
		while(true) {
			System.out.print("10진수 입력 : ");
			int dec = Integer.parseInt(br.readLine());
			if(dec<0) continue;
			if(dec==0) break;
			
			for(i=0; dec!=0; i++) {
				binary[i] = dec%2;
				dec /= 2; //dec=dec/2;
			};//for
			System.out.println("i = " + i);
			
			//거꾸로 출력
			//for(int k=binary.length-1; k>=0; k--) {
			for(int k=i-1; k>=0; k--) {
				System.out.print(binary[k]);
				if(k%4==0) System.out.print(" ");
			};
			System.out.println("\n");
		};//while
		System.out.println("프로그램을 종료합니다");
		
	};
};

/*
10진수를 입력하여 2진수로 변환하시오
0이 입력되면 프로그램을 종료하세요
음수가 입력되면 재입력하세요
4개씩 끊어서 보여주기

Integer.toBinaryString() 사용 X

10진수 입력 : -5

10진수 입력 : 12
1100

10진수 입력 : 250
1111 1010

10진수 입력 : -8

10진수 입력 : 0
프로그램을 종료합니다
*/