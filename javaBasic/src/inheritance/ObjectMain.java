package inheritance;

////자바의 모든 클래스는 Object에게 상속. 항상있던건데 평상시에 생략되어있던것
class Test2 extends Object { 
	
	@Override //부모의 역할을 받으면서 내용을 바꿔서 처리할수있다.
	//클래스@16진수로 나오게 역할을 한다.
	public String toString() {
		return getClass()+"@개바부" ; //객체주소가 이제 16진수가 아니라 개바부로 바뀐다.ㄴ
	};
};

class Sample {//어차피 상속받으니까 굳이 extends 안써도된다
	
};
//-----------
public class ObjectMain {

	public static void main(String[] args) {
		Test2 t = new Test2(); //heap 이라는 메모리 영역에 잡힌다. 그리고 주소를 전달
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString());//항상 있던건데 생략되어있엇던것.
		System.out.println();
		
		Sample s = new Sample();
//		System.out.println("객체 s = " + s); //자동으로 toString 부르는것.밑에랑 같은것
		System.out.println("객체 s = " + s.toString()); //
		System.out.println("객체 s = " + s.hashCode()); // 16진수를 10진수로 보여준다
		System.out.println();
		
		//     주소(stack 영역에 저장) <<이걸 포인터변수라고 한다.
		String str = "apple"; //heap 메모리에 저장 
		//문자열이 나오는애들은 문자열이 나오게 바꿔서 찍어준거다. 오버라이드 해서 apple 나온거다.
		System.out.println("객체 str = " + str.toString()); //문자열로 바꿔서 apple 나온다.
		System.out.println("객체 str = " + str.hashCode()); //믿지마삼 숫자가 가끔겹쳐서나옴
		
		String aa= new String("apple"); //heap영역 -항상 나에게 주소를 준다 / 이름을못준다.
 		String bb= new String("apple");
 		
 		//주소가 같냐고 물어본거다
 		System.out.println("aa==bb : " + (aa == bb));//자체가 참인지 거짓인지 나온다. 조건연산자가 아니다
 		//문자열이 같냐고 물어본거다.
 		System.out.println("aa.equals(bb) : " + (aa.equals(bb)) );//문자열비교
 		System.out.println();
 		
 		Object cc = new Object();
 		Object dd = new Object();
 		System.out.println("cc==dd : " + (cc == dd)); //주소값이 같냐 물어봄
 		System.out.println("cc.equals(bb) : " + (cc.equals(dd)) );//주소를 비교
		System.out.println();
		
		Object ee= new String("apple");  //String 클래스를 만들고 Object 가리킨다.
		Object ff= new String("apple");
 		System.out.println("ee==ff : " + (ee == ff));//주소
 		System.out.println("ee.equals(ff) : " + (ee.equals(ff))); //문자열
 		//오버라이딩이 되면 자식한테 우선권이되서 문자열이 비교가 된다.
 		System.out.println();
	};
	
};