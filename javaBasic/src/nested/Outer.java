package nested;

public class Outer {
	private String name;//클래스를 밖으로 빼지않는이상 setter getter 만들필요없다
	
	public Outer() {
		System.out.println("Outer this = " + Outer.this);
		
	};
	
	public void output() {
		//같은 Inner클래스안에서는 setter getter가필요없다
//		Inner in =new Inner(); //객체생성 
//		System.out.println("이름 = " + name + "\t 나이 =" + in.age);

	};
	
	class Inner {
		private int age;
		
		public Inner() {
			System.out.println("Inner this = " + this);
		};
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t 나이 = " + this.age);
			//상속은 내껏도 내꺼 부모껏도 내꺼라서 this 써도 되지만
			//이거는 상속관계가 아니라서 name 앞에 this를 못붙인다
			//Outer.this.name 이렇게 써줘야한다. 이건 this를 생략못한다 꼭 써줘야한다.
		};
	};

	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "이순신";
		ou.output();
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner() ;
		in2.age =30;
		in2.disp();
		System.out.println();
		
		Outer.Inner in3 = new Outer().new Inner();
		//in3.name = "윤해랑"; -error
		in3.age = 33;
		in3.disp();
		System.out.println();
	};

};