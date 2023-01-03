package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("이름 입력 : ");
      String name = br.readLine();
      System.out.print("직책 입력 : ");
      String position = br.readLine();
      System.out.print("기본급 입력 : ");
      int basePay = Integer.parseInt(br.readLine());
      System.out.print("수당 입력 : ");
      int extraPay = Integer.parseInt(br.readLine());
      
      int totalPay = basePay + extraPay;
      double taxRate = totalPay >= 4000000 ? 0.03 : 0.02;
      
      Salary s = new Salary();
      
      //int tax = (int)(totalPay * taxRate);
	  int tax = s.calcTax(totalPay, taxRate);

	  // int pay = totalPay - tax;
	  int pay = s.calcSalary(totalPay, tax);

	  System.out.println("\t *** " + name + " 월급 명세서 ***");
	  System.out.println("직급 : " + position);
	  System.out.println("기본급\t수당\t급여\t세율\t세금\t월급");
	  System.out.println(
				basePay + "\t" + extraPay + "\t" + totalPay + "\t" + (int) (taxRate * 100) + "% \t" + tax + "\t" + pay);
   };
   
   public int calcTax(int totalPay, double taxRate){//구현
	      int tax = (int)(totalPay * taxRate);
	      return tax;
   };
   
   public int calcSalary(int totalPay, int tax){//구현
      return totalPay-tax;
   };
   
};


/*

월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 급여, 세금, 월급을 계산하시오
세율은 급여가 4,000,000 만원 이상이면 3% 아니면 2%로 한다 (조건연산자 - 조건 ? 참 : 거짓)

급여 = 기본급 + 수당
세금 = 급여 * 세율  //static 쓰지않는것
월급 = 급여 - 세금

세금은 calcTax()     메소드 작성
월급은 calcSalary()  메소드 작성

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4500000
수당 입력 : 200000

      *** 홍길동 월급 명세서 ***
직급 : 부장
기본급      	   수당         급여      세율      세금        월급
4500000      200000  	4700000  	3%      xxxxx  	 xxxxxxx


*/