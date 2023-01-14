package class2;

import java.util.Scanner;

public class StringBufferTest {
	private int dan;

	public StringBufferTest() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		dan = scan.nextInt();

	};

	public void display() {
//		StringBuffer buffer = ""; //에러가 떨어진다 오로지 리터럴을 만들수있는건 String뿐
		StringBuffer buffer = new StringBuffer();//버퍼의 문자열이 생성

		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan * i));
			
			buffer.append(dan); //추가하겠다
			buffer.append("*"); 
			buffer.append(i); 
			buffer.append("="); 
			buffer.append(dan*i); 
			
			System.out.println(buffer.toString());//StringBuffer  ---> String 변환
			
			buffer.delete(0,buffer.length()) ;
		}; // for
	};

	public static void main(String[] args) {
		StringBufferTest sbt = new StringBufferTest();
		sbt.display();
	};
};
/*
 * 원하는 단을 입력 : 7 생성자 ----------------------------- 7*1=7 display() 7*2=14 ...
 * 
 * 7*9=63
 */