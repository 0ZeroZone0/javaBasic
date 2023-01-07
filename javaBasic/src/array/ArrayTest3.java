package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열 크기 입력 : ");
		int size = Integer.parseInt(br.readLine());
				
		int[] ar;				
		ar = new int[size];
			
		for(int i=0; i<size; i++) {
			System.out.print("ar["+i+"]값 입력 : ");
			ar[i] = Integer.parseInt(br.readLine());
		};
		
		for(int d : ar) {
			System.out.print(d+"  ");
		};
	};
};

/*
배열의 크기를 입력받아서 정수형 배열을 생성하고 데이터 입력후 출력하시오

[실행결과]
배열 크기 입력 : 3

ar[0]값 입력 : 87
ar[1]값 입력 : -15
ar[2]값 입력 : 20

87  -15  20
 */