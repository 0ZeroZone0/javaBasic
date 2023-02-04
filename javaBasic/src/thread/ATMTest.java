package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;



public class ATMTest implements Runnable {
	private long depositeMoney=100000; //잔액
	private long balance; //찾고자 하는 금액\
	private long calcMoney;
	
	@Override
	public synchronized void run() {
							//도착한 스레드가 찍힘 	//찍힌이름가지고오기
		System.out.println(Thread.currentThread().getName()+"님 안녕하세요");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("찾고자 하는 금액 입력 : ");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		};
		
		//잔액 계산
				if(depositeMoney >= balance) {
					if(balance%10000 == 0) {
						depositeMoney = depositeMoney - balance;
						System.out.println("잔액은 "+ new DecimalFormat().format(depositeMoney)+"원 입니다");
					}else {
						System.out.println("만원 단위로 입력하세요");
					};
						
				}else {
					System.out.println("잔액이 부족합니다");
				};
			};

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm, "엄마"); //스레드 생성
		Thread son = new Thread(atm, "아들"); //스레드 생성
		mom.start(); //스레드 시작
		son.start(); //스레드 시작

	};
};