package basic;

/*
ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오

[실행결과]
T → t

또는

e → E
*/

public class CompTest5 {

	public static void main(String[] args) {
		char ch = 'T';	
		int result = ch >= 'A' &&  ch <= 'Z'  ? ch+32 : ch-32; //&& (AND) : 모든 조건이 참일 때 성립
		
		System.out.println(ch + " → " + (char)result); //T → t
	};

};