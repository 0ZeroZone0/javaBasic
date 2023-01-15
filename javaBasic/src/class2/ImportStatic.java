package class2;

import java.util.Arrays;
import java.util.Random;

public class ImportStatic {

	public static void main(String[] args) {
		// Math.random() class 로 잡힌건 static 이라는거 java.lang이라는 패키지 안에 Math라는 클래스가 있다.
		// java.lang 을 기본 디폴트 패키지 그래서 없어도 먹혀 들어간다.
		System.out.println("난수 = " +Math.random());// 0<= 난수 <1

		// static이아니라서 객체가 따라온거다
		Random r = new Random(); // java.lang이 아니라 오류가 뜬다 java.util에 있는거다
		System.out.println("난수 = " + r.nextDouble());// 0<= 난수 <1
		System.out.println("난수 = " + r.nextInt());// 정수형(양수,음수)
		System.out.println("난수 = " + r.nextInt(100)); // 0~99

		int[] ar = { 78, 56, 48, 30, 60 };
		for(int data : ar) {
			System.out.print(data+"  ");
		};
		System.out.println();

		//정렬
		Arrays.sort(ar);//SelectionSort에서 했던거 정렬하는거를 자바에서 만든거다.
		
		for(int data : ar) {
			System.out.print(data+"  ");
		};
		
		System.out.println();
	};
};