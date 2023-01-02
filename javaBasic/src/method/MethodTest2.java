package method;

public class MethodTest2 {

	public static void main(String[] args) {
		
//		MethodTest2 mt =
//		mt = new MethodTest2();
		
		MethodTest2 mt = new MethodTest2();
		
		System.out.println("합 = " + mt.sum(320,258));
		System.out.println("차 = " + mt.sub(320,258));
		System.out.println("곱 = " + mt.mul(320,258));
		System.out.println("몫 = " + mt.div(320,258));

	};

	public int sub(int a , int b) {
		return a-b;
	};
	
	public int sum(int a , int b) {
		return a+b;
	};
	
	public int mul(int a , int b) {
		return a*b;
	};

	public String div(int a , int b) {
		return String.format("%.2f",(double)a/b);
	};
};