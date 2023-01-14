package class2;

public class StaticTest {
	private int a; // 필드, 인스턴스 변수
	private static int b; // 필드, 클래스 변수 //클래스안에 있지만 소속은 아니다. 먼친척같은느낌.
	
	
	static{
		System.out.println("초기화 영역"); //딱한번부름
		b=3;
	};
	
	public StaticTest() {
		System.out.println("기본 생성자");//클래스가 new할때마다 부름
		a = 3;
	};

	public void calc() {
		a++;
		b++;
	};

	public void disp() {
		System.out.println("a=" + this.a + "\t b=" +StaticTest.b);
	};
	
	public static void output() {
		System.out.println("static 메소드...");
//		System.out.println("a=" + this.a + "\t b=" +StaticTest.b); //error static에는 this을 사용할수없다.
	};

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();// 4 1
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();//4 2
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();// 4 3
		
		StaticTest.output();//클래스명.메소드 - 호충 가능
		output();//어차피 클래스영역이라서 앞에 굳이 스테틱테스트 안써도된다
		st.output();//객체명.메소드 - 호출 가능
	};
};//class StaticTest