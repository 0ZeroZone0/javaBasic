package basic;

public class CalcTest {

	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		
		int sum = a + b;
		//short sum = (short)(a + b);
		int sub = a - b;
		int mul = a * b;
		double div = (double)a/b;
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " +  String.format("%.2f",div));

	};

};


/*
320, 258의 합 , 차 , 곱 , 몫을 구하시오

[실행결과]
320 + 258 = sum
320 - 258 = sub
320 * 258 = mul
320 / 258 = div 1.24
*/