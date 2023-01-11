package constructor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputTest {
	private int a;
	private double b;
	
	public InputTest() throws FileNotFoundException {
		System.out.println("default 생성자");
		
		//Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("result.txt"));
		
		File myFile = new File("result.txt");
		Scanner scan = new Scanner(myFile);
		
		System.out.print("정수 입력 : ");
		a = scan.nextInt();
		System.out.print("실수 입력 : ");
		b = scan.nextDouble();
		
		try {
			System.out.println("파일의 위치: "+myFile.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		};
		
	};
	
	public void output() {
		System.out.println("a = " + this.a + "\t b = " + this.b);
	};

	public static void main(String[] args) throws FileNotFoundException {
		InputTest it = new InputTest();
		it.output();

	};

};