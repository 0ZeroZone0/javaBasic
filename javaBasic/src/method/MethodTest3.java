package method;

import java.text.DecimalFormat;
import java.util.Random;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("최대값 = " + Math.max(25,36));
		
		
//		int a = (int)(Math.random() * 100) + 1; //1~100
		int a =(int)(Math.random() * 26) + 65; //65~90
		System.out.println((char)a);
		
		Random r = new Random();
		System.out.println(r.nextDouble());
		
		System.out.println("문자열로 정수로 변환 " + Integer.parseInt("25"));
		System.out.println("문자열로 실수로 변환 " + Double.parseDouble("43.8"));
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("3자리마다 , 를 출력 \t " +df.format(1234567));
 	};
 
};


/*
random(난수)
-컴퓨터가 불규칙하게 발생하는 수
- 0 <= 난수 < 1
- x에서 y 사이의 난수 발생
  (int)(Math.random() * (y-x+1) + x
*/