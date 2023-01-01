package basic;

public class CompTest2 {

	public static void main(String[] args) {
		int num = 25;
		
		 // System.out.println(만약에 num에 들어 있는 값을 2로 나눈 나머지가 0이면 ? "짝수이다" : "짝수가 아니다");
		
	    //	System.out.println( num%2 == 0 ? "짝수이다" : "짝수가 아니다");
		
		String result = num%2 == 0 ? "짝수이다" : "짝수가 아니다" ;
		System.out.println(result);

	};

};