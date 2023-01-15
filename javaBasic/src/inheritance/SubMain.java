package inheritance;
//아들
public class SubMain extends SuperTest {
	
	private String name;
	private int age;
	
	public SubMain() {
		System.out.println("SubMaind의 기본 생성자");
	};
	
	public SubMain(String name, int age, double weight, double height) {
//		this();//오버로드된 다른생성자를 부를 수 있다
		super(weight,height);//부모생성자 호출
		
		System.out.println("SubMaind 생성자");
		this.name = name;
		this.age= age;
//		super.weight =weight;
//		super.height = height;
	};
	
	public void output() {
		System.out.println("SubMain 클래스의 output()" );
		System.out.println("이름 = " +  name );
		System.out.println("나이 = " +  age );
		System.out.println("몸무게 = " +  weight );
		System.out.println("키 = " +  height );
	
	};

	public static void main(String[] args) {
		SubMain aa=new SubMain(); //생성자 2번 호출 // 지꺼 부모꺼
		aa.output();
		System.out.println("------------------");
		
		SubMain bb = new SubMain ("윤해랑" ,25,72.5,183.6);
		bb.output();
		System.out.println("------------------");
		
		SuperTest cc = new SubMain("이순신",13,32.5,145.8);
//		cc.output(); //cc라는 객체로는 output을 부를수가없다 /창조할수가없다 cc라는 객체는 슈퍼만 참조하겠다 라는뜻임
//		SunMain 갔다가 disp가없으니까 SuperTest에 가서 dsip찾아서 부른거다.
		cc.disp();
	};
};