package inheritance;

class Final{//Final은 거의 대부분 public 을 쓴다
	public final String FRUIT = "사과";
	public final String FRUIT2; //초기값 안정해주고 들어간다
	
	public static final String ANIMAL = "호랑이";
	public static final String ANIMAL2; //static은 생성자에서 초기화가 안된다
	
	static {
		ANIMAL2="기린";
	}
	
	public Final() {//new 할때만 잡힌다
		FRUIT2 = "딸기";
	}
}
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25;
		//AGE++; error
		//AGE2 = 30; - error
		System.out.println("AGE = " + AGE);
		
		final int AGE2; //초기값을 안주면 가비지값을 가지고 간다
		AGE2 = 30; //그래서 위에 초기값을 안주면 나중에 값을 줄수있도록 해놨다
		System.out.println("AGE2 = " + AGE2);
		
//		System.out.println("FRUIT = "+ new Final()); //일회용으로 쓸 방법
		
		Final f = new Final(); //f에는 Final이 살고있다는 뜻
//		자료형 주소  하늘빌딩
//		호수 f = new 호수(); // 호수라는 건물을 세우고 주소를 주는거다.
		
		System.out.println("FRUIT = "+ f.FRUIT); //
		System.out.println("FRUIT = "+ f.FRUIT2);	
		
		System.out.println("ANIMAL = " + Final.ANIMAL);
//		System.out.println("ANIMAL = " + f.ANIMAL); //둘중하나써도된다
		
		System.out.println("ANIMAL2 = "+ Final.ANIMAL2);
		
	};
};