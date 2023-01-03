package method;

class Test {
	public int a, b;//필드

	public void sum() {
		System.out.println(a + " + " + b +" = " + ( a + b)); //10 + 20 = 30
	};

	public void sub() {
		System.out.println(a + " - " + b +" = " + ( a - b)); //10 - 20 = -10
	};
};

public class MethodTest4 {

	public static void main(String[] args) {
		Test t = new Test();
		t.a = 10;
		t.b = 20;
		t.sum();
		t.sub();
	};

};