package basic;

import java.text.DecimalFormat;

/*
이름이 L(name)인 사람의 기본급(basePay)이 2500000일때 3.3% 세금(tax)과 월급(salary)을 계산하시오

세금 = 기본급 * 3.3%(0.033)
월급 = 기본급-세금
		
[실행결과]
*** L의 월급 ***
기본급 : 2,500,000원
세금   : 82,500원
월급   : 2,417,500원
*/

public class PayTest {

	
	public static void main(String[] args) {
		//String name = "L"; <<--이것도 가능
		char name = 'L';
		int basePay = 2500000;
		int tax = (int) (basePay * 0.033);
		int salary = basePay - tax;
		DecimalFormat df = new DecimalFormat("#,###");//3자리씩 ,찍기
		
		System.out.println(" *** " + name + " 의 월급 " + " *** " );
		System.out.println("기본금 : " + df.format (basePay) + "원");
		System.out.println("세금 : " +df.format(tax) + "원");
		System.out.println("월급 : "  +df.format(salary) + "원");
		
	};

};