package basic;

public class Variable2 {
//	클래스가 잡는 메모리와 함수가 잡는 메모리가 달라서 같은 int a 가 와도 에러가 안생긴다. 아파트 동이 다른거라 생각하기.
	int a; // 필드 (클래스밑에 잡히는애들) , 인스턴스 변수 , 초기화
	static int b; // 필드 , 클래스 변수 ,초기화 
	String c;

	public static void main(String[] args) {
//		int a;   로컬변수 지역변수 local variable -함수안에 잡히는애들, grabage(쓰레기) <<방만 정해놔서 값이없을때
		int a =10; 
		System.out.println("local a = " + a); //local a = 10
		
		
		Variable2 v;
		v = new Variable2();
		
		System.out.println("객체 v = " + v); //패캐지명.클래스명@16진수 로 주소를 알려줌. 
		System.out.println("필드 a = " + v.a); //필드 a = 0
		System.out.println("필드 b = " + b); //필드 b = 0
		System.out.println("필드 c = " + v.c); //필드 c = null
		
//		System.out.println("필드 a = " + new Variable2().a); //클래스는 new 메모리로 방을 만들어서 a를 찍어달라는 뜻
//		System.out.println("필드 b = " + b); //static 은 메모리에 잡아주기 때문에(방을만들어줌) 따로 안써도됨.
//		System.out.println("필드 c = " + new Variable2().c); //정해진 명칭이 없어서 또 메모리를 만든거라 1회용으로 쓰겠다는 뜻
		

	};
};


//	모든 변수는 반드시 메모리에 생성해야 한다.
// 	서울특별시 광진구 벽산빌라 101동  << c언어가 주는 메모리 주소 /기계를 관리하기때문에 자세하게 줌
// 	왕십리역 2번출구 올리브영 뒤  << 자바가 주는 메모리 주소 / 참고 주소