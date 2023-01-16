package inheritance;

class Test {
	int a,b;
};

//-----------------
public class TestMain {

	public static void main(String[] args) {
		Test aa = new Test();//클래스는 Test 1개다
		Test bb = aa;
		aa.a = 2;
		aa.b = 5;
		System.out.println(aa.a + "\t" + aa.b);// 2  5
		System.out.println(bb.a + "\t" + bb.b);// 2  5
		System.out.println();
		
		bb.a=7;
		bb.b=9;
		System.out.println(aa.a + "\t" + aa.b);// 7  9
		System.out.println(bb.a + "\t" + bb.b);// 7  9
		System.out.println();
		
		bb = new Test();//클래스를 또 새로만들어달라~
		bb.a=10;
		bb.b=20;
		System.out.println(aa.a + "\t" + aa.b);//7   9 
		System.out.println(bb.a + "\t" + bb.b);//10  20
		System.out.println();
		//주소값가지고 움직이는거다
	};

};