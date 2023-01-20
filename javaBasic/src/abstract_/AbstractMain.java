package abstract_;

public class AbstractMain extends AbstractTest{

	public static void main(String[] args) {
//		AbstractTest at = new AbstractTest();//추상클래스는 절대 new가 안된다
		//해결 방법 1번 상속을 걸어서 자식에게 추상메소드를 반드시 오버라이드를 해야한다는 조건
		//부모가 반드시 죽으면서 자식에 반드시 복수를 해달라고 강제성으로 오버라이딩 시킨다.
		
		AbstractMain at = new AbstractMain(); //부모꺼 까지 만든다
		at.setName("이순신"); //오버라이드라서 자식껄로 호출
		System.out.println("이름 = " + at.getName());
	};

	@Override
	public void setName(String name) {
		this.name = name; 
		
	};

};