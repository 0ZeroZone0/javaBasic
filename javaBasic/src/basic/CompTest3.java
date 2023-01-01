package basic;

public class CompTest3 {

	public static void main(String[] args) {
		int score = 24;
		String result = score>=80 && score<=100 ? "합격" : "불합격";
		System.out.println("결과 = " + result);
		System.out.println();
		
		//score에 들어있는 값이 2와 3의 공배수라면 ? "공배수" : "공배수가 아니다";
		// score가 2의 배수 (2로 나누면 나머지 0)
		result = score%2 == 0  && score%3 == 0  ?  "공배수" : "공배수가 아니다";
		System.out.println("결과 = " + result);
		
	};

};