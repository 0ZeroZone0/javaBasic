package collection;

//클래스는 식당의메뉴판같은거
class GenericTest<T>{ //아직까지는 이타입을 정하지않겠다 할때 쓰임/ 실행할때 잡아줌
	private T a;
	
	public void setA (T a){
		this.a = a;
	};
	public T getA(){
		return a;
	};
};
//--------------------
public class GenericMain {

	public static void main(String[] args) {
		//실행할때 타입을 정해준다.
		GenericTest<String> aa = new GenericTest<String>();//스트링타입으로
		aa.setA("이순신");
		System.out.println("이름 = " + aa.getA());
		
//		aa.setA(25);//-error 정해진 타입하고 달라서
		
		GenericTest<Integer> bb = new GenericTest<Integer>();//정수형타입으로
		bb.setA(25);
		System.out.println("나이 = " + bb.getA());
	};

};