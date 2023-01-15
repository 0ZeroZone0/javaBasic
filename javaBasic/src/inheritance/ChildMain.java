package inheritance;

public class ChildMain extends SuperTest{

	private String name;
	private int age;
	
	public ChildMain() {
		System.out.println("SubMaind의 기본 생성자");
	};
	
	public ChildMain(String name, int age, double weight, double height) {
//		this();//오버로드된 다른생성자를 부를 수 있다
		super(weight,height);//부모생성자 호출
		
		System.out.println("SubMaind 생성자");
		this.name = name;
		this.age= age;
//		super.weight =weight;
//		super.height = height;
	};
	
	public void disp() {
		System.out.println("ChildMain 클래스의 disp()" );
		System.out.println("이름 = " +  name );
		System.out.println("나이 = " +  age );
//		System.out.println("몸무게 = " +  weight );
//		System.out.println("키 = " +  height );
		
		super.disp();
		
	};
	public static void main(String[] args) {
		ChildMain aa= new ChildMain(); // 자기꺼 부모꺼 기본생성자를 부름
		aa.disp();
		System.out.println("----------------");
		
		ChildMain bb= new ChildMain("홍길동" ,25,72.5,183.6);
		bb.disp();
		System.out.println("----------------");
		
		SuperTest cc = new ChildMain("코난",13,32.5,145.8); //SuperTest를 참조하지만  우선권은 자식한테있음
		cc.disp();//cc가 SuperTest를 참조할지라도 무조건 ChildMain(자식클래스)의 메소드를 호출한다
	};

};