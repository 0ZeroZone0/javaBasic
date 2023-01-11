package class_;

class ThisTest {
	private String name;//접근제어자
	
	public void setName(String name){ //구현 //이 클래스만 접근가능
		System.out.println("this = " + this);
		this.name = name; //이때 this는 필수적으로 써줘야한다.
	};
	
	public String getName(){//동전 투입구 역할 //구현부
		return this.name; //this 는 생략 가능
	};
};


public class ThisMain {

	public static void main(String[] args) {
		ThisTest tt = new ThisTest();//객체생성/메모리heap영역에 고유주소번호를 가진 방을 만듦.
//		ThisTest tt;
//		tt = new ThisTest();
		System.out.println("객체 tt = "+tt);
		tt.setName("이순신");
		System.out.println("이름 = " + tt.getName()); // 객체는 주소의 값을 보관
		//객체를 인스턴스화 시킨후에 메소드를 참조해온것.
		
		ThisTest ss = new ThisTest();
		System.out.println("객체 tt = "+ss);
		ss.setName("윤해랑");
		System.out.println("이름 = " + ss.getName());
	};
};