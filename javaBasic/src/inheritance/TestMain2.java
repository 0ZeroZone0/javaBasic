package inheritance;

class AA {
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.print("AA : " + a + "   ");
	};
};

//-----------------
class BB extends AA {
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.print("BB : " + a + "   ");
	};
};

//-----------------
public class TestMain2 {
	public static void main(String[] args) {
		BB aa = new BB(); //상속관계라서 부모꺼 까지 같이 만들어짐
		aa.disp(); //BB : 13
		System.out.println("aa : " + aa.a );//13
		System.out.println();
		
		AA bb = new BB(); //부모 = 자식 
		bb.disp(); //BB : 13
		System.out.println("bb : " + bb.a); //3
		System.out.println();
		
		AA cc = new AA();
		cc.disp();// AA : 8
		System.out.println("cc : " + cc.a); //8
		System.out.println();
		
		BB dd = (BB)bb; //자식 = (자식) 부모 //부모가 자식클래스로 갈때는 자식화//타입이틀려서 맞춰서보내기.
		dd.disp(); //BB : 18     아까 위에 13까지 나왔으니까  
		System.out.println("dd : " + dd.a);
		System.out.println();
	};
};