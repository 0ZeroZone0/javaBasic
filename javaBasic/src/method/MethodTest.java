package method;

public class MethodTest {
	
	public static void main(String[] args) {  //구현
		disp();//호출   = MethodTest.disp 랑 같은거임 
		MethodTest mt;	
		mt = new MethodTest();  //호출
		mt.output();
		
		System.out.println("최대값 = " + max(25,36));
		System.out.println("최소값 = " + mt.min(20,58));
	};

//	public    -전체공개
//	private   -허락한사람들만 들어올수있음
	
	public static int max(int a, int b) {
		return a >= b ? a : b;  //큰값을 가지고 가라
	};
	
	public int min(int a , int b) {
		return a < b ? a : b;
	};
	
	public static void disp( ) { //구현
		System.out.println("안녕하세요");
	};
	
	
	public void output( ) {
		System.out.println("반갑습니다");
	};
	
};

//	 자바가상머신은 main 밖에 모름.