package basic;

public class Money {

	public static void main(String[] args) {
		int money = 5678;
		int thousand = money / 1000;
		int hundred = money % 1000 /100;
		int ten = money % 1000 % 100 / 10;
		int one = money % 1000 % 100 % 10 /1;
		
		System.out.println("금액 : " + money + "원");
		System.out.println("천원 : " + thousand + "장");
		System.out.println("백원 : " + hundred + "개");
		System.out.println("십원 : " + ten + "개");
		System.out.println("일원 : " + one + "개");
		
	};

};

/*
금액(money)이 5679원일때 다음과 같이 출력하시오

[실행결과]
금액 : 5679원
천원 : 5장
백원 : 6개
십원 : 7개
일원 : 9개
 */