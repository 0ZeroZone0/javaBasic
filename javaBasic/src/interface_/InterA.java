package interface_;

//인터페이스 안에는 상수만 들어간다.
public interface InterA {
	public static final String NAME = "홍길동"; //상수
//	public int age=25;//일반변수 아니고 상수다. static final이 생략된거다.
	//이구역은 무조건 상수만 들어오기때문에
	public int AGE=25; //그래서 대문자로 바꿔주자
	
	public abstract void aa(); //추상메소드만 가능
	public void bb(); //abstract 생략가능 
	//이구역은 무조건 추상도 들어오기때문에
};