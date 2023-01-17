package inheritance;

class AAA{}
class BBB extends AAA{}

public class InstanceOf {

	public static void main(String[] args) {
		AAA aa = new AAA();
		BBB bb = new BBB();//BBB에서 BBB를 참조하겠다
		AAA aa2 = new BBB();//BBB에서 AAA를 참조하겠다
		
		//AAA라는 클래스형이 살고있는거다.
		AAA aa3 = aa; //aa의 주소값을 aa3에게 준거다
		if(aa instanceof AAA) //aa를 따라가면 AAA라는 클래스가 있냐
//		오른쪽에 있는 aa를 왼쪽의 클래스타입(AAA) 으로 값을 넘길수 있는지 
		System.out.println("1. TRUE");
		else System.out.println("1. FALSE");
		
		//부모 = 자식   //다형성  어떠한 성격이 와도 상관이없다
//		AAA aa4 = aa;
		AAA aa4 = bb;
		if(bb instanceof AAA)
//		bb의 주소를 따라가보면 AAA 클래스 타입이 메모리에 생성되었는지? 확인해줘
		System.out.println("2. TRUE");
		else System.out.println("2. FALSE");
		
		//자식 = (자식)부모    //부모는 맨앞에 있 는주소를 맨뒤에 있는 자식한테 주겠다~ //다운캐스팅
		BBB bb2 = (BBB)aa2; //aa2에 있는데 AAA에 가지말구 BBB로 가
		if(aa2 instanceof BBB) //aa2를 따라가면 BBB클래스가있니? 
			System.out.println("3. TRUE");
		else System.out.println("3. FALSE");
		
		////자식 = (자식)부모  -- error
		//BBB bb3 =(BBB)aa; //다운캐스팅
		if(aa instanceof BBB) 
			System.out.println("4. TRUE");
		else System.out.println("4. FALSE");
	};//main
};