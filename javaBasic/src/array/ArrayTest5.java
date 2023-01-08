package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열 크기 입력 : ");
		int size = Integer.parseInt(br.readLine());
		
		int[] ar = new int[size];
		int sum = 0;
		int max, min;
		
		for(int i=0; i<size; i++){
			System.out.print("ar["+i+"] : ");
			ar[i] = Integer.parseInt(br.readLine());
			
			sum += ar[i];					
		};//for i
		
		//최대값, 최소값
		max = min = ar[0]; //초기값은 데이터중에서 하나를 갖는다.
		for(int i=1; i<size; i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min) min = ar[i];
		};
		
		//출력
		for(int data : ar){
			System.out.print(data+"  ");
		};
		
		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
	};

};

/*
배열 크기 입력 : 7

ar[0] : 25
ar[1] : 36
ar[2] : -12
ar[3] : 100
ar[4] : 72
ar[5] : 55
ar[6] : 23

25 36 -12 100 72 55 23
합 = xxx
최대값 = 
최소값=
*/