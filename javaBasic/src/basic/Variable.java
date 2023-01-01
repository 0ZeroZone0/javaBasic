package basic;

public class Variable {
	public static void main(String[] args) {
		
		boolean a;
		a = 26>32; // 대입문
		System.out.println("a = " + a);
		
		char b = 'A';
		System.out.println("b = " + b);
		
		char c = 65;
		System.out.println("c = " + c);  //A
		
		int d = 65;
		System.out.println("d = " + d);  //65
		
		int e = 'A';
		System.out.println("e = " + e); //65
		
		byte ff = 127;
		System.out.println("ff = " + ff);
		
	//	byte f= 128; - error (128 상수는 int형으로 인식)
	//	System.out.println("f = " + f);
		
	//	float f = 45.8;  -error (45.8 상수는 double 형으로 인식)
	//	float g =(float)45.8; //double형 상수
		float f = 45.8f;  //float형 상수
		System.out.println("f = " + f);
		
	};
};