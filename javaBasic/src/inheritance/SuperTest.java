package inheritance;

//아빠
public class SuperTest {
	protected double weight, height;//자신과 자식에게 공유
	
	public SuperTest() { //기본생성자
		System.out.println("SuperTest 기본생성자");
	};
	
	////생성자를 통해 외부로부터 받은 데이터 전달
	public SuperTest(double weight, double height){
		System.out.println("SuperTest 생성자");
		this.weight = weight;
		this.height = height;
	};
	
	public void disp() {
		System.out.println("SuperTest클래스의 disp()");
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	};
	
};