package constructor;

public class VarArgs {//...은 갯수를 자유롭게 풀어주겠다는뜻//ar은 배열로잡겠다
	public int sum(int...ar) { //내부적으로 배열로 처리
		int hap=0;
		for (int i=0; i<ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	};

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		
		System.out.println("합= " + va.sum(10,20));//호출
		System.out.println("합= " + va.sum(10,20,30));//호출
		System.out.println("합= " + va.sum(10,20,30,40));//호출
	
	};
};


/*

public int sum(int a, int b) {
return a+b;
}
public int sum(int a, int b,int c) {
return a+b+c;
}
public int sum(int a, int b,int c,int d) {
return a+b+c+d;
}

*/