package constructor;

class ConstructorTest {
	private String name;
	private int age;
	
	public ConstructorTest() { //()괄호 안에 아무것도 없는 생성자를 기본생성자
		System.out.println("this = " +this);
		System.out.println("default 생성자");
	};
	
	public ConstructorTest(String name) {
		this();
		System.out.println("생성자-name");
		this.name = name;
	};
	
	public ConstructorTest(int age) {
		this("이순신");
		System.out.println("생성자-name");
		this.age = age;
	};
	
	public String getName() {
		return name;
	};
	
	public int getAge() {
		return age;
	};
};

public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest ct = new ConstructorTest();
		System.out.println("이름 = " + ct.getName());
		System.out.println("나이 = " + ct.getAge());
		
		
		ConstructorTest ct2 = new ConstructorTest("윤해랑");
		System.out.println("이름 = " + ct2.getName());
		System.out.println("나이 = " + ct2.getAge());
		System.out.println();
		
		ConstructorTest ct3 = new ConstructorTest(25);
		System.out.println("이름 = " + ct3.getName());
		System.out.println("나이 = " + ct3.getAge());
		System.out.println();
		
	};

};