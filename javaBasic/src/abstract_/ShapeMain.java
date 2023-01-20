package abstract_;

import java.util.Scanner;
abstract class ShapeTest {//자식들에게 오버라이딩시켜준다 ..만능리모컨의 역할도한다
	protected double area; //상속을 받을수있게 protected로 씀
	protected Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");//불리는지 확인
	};
	public abstract void calcArea();
	public abstract void dispArea(); 
};
//아들들
//-----------------------------
class SamTest extends ShapeTest {
	private int base,height;
	
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.print("밑변  : ");
		base = scan.nextInt();
		System.out.print("높이  : ");
		height = scan.nextInt();
	};
	
	@Override //오버라이드 체크를 컴퓨터가 확인 시켜주는거 잘못썻으면 에러로 뜬다
	public void calcArea() {
		area = base*height/2.0;
	};
	
	@Override //자식한테 붙여서 부모꺼와 함께 확인하는것
	public void dispArea() {
		System.out.println("삼각형 넓이 = " +area);
	};
};
//-----------------------------
class SaTest extends ShapeTest {
	private int width,height;
	
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로  : ");
		width = scan.nextInt();
		System.out.print("세로  : ");
		height = scan.nextInt();
	};
	
	public void calcArea() {
		area = width*height;
	};
	
	public void dispArea() {
		System.out.println("사각형 넓이 = " +area);
	};	
};
//-----------------------------
class SadariTest extends ShapeTest {
	private int top,bottom,height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.print("윗변  : ");
		top = scan.nextInt();
		System.out.print("밑변  : ");
		bottom = scan.nextInt();
		System.out.print("높이  : ");
		height = scan.nextInt();
	};
	
	public void calcArea() {
		area = (top+bottom)*height/2.0;
	};
	
	public void dispArea() {
		System.out.println("사다리 넓이 = " +area);
	};
	
};
//-----------------------------
public class ShapeMain {

	public static void main(String[] args) {
		
		ShapeTest shape; //리모컨만 원한다
		shape = new SamTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SamTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
	
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
	};
};