package class_;

//﻿import class_2.SungJuk     //만약 패키지가 다를경우 이런식으로 쓰기

public class SungJukMain {

	public static void main(String[] args) {

		SungJuk aa;
		aa = new SungJuk();//객체화=인스턴스화 //클래스를 객체로 만드는 과정
		aa.setName("김효자");
		aa.setKor(95);
		aa.setEng(90);
		aa.setMath(83);
		
		aa.calc();
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(aa.getName() + "\t"
						 + aa.getKor() + "\t"
						 + aa.getEng() + "\t"
						 + aa.getMath() + "\t"
						 + aa.getTot() + "\t"
						 + String.format("%.2f", aa.getAvg()));
		
		SungJuk bb;
		bb = new SungJuk();
		bb.setName("윤해랑");
		bb.setKor(92);
		bb.setEng(95);
		bb.setMath(63);//매소드에 매개변수가 있는경우의 호출
		
		bb.calc();//참조변수.메소드이름(); // 메서드에 선언된 매개변수가 없는 경우 // 메소드 호출
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(bb.getName() + "\t"
						 + bb.getKor() + "\t"
						 + bb.getEng() + "\t"
						 + bb.getMath() + "\t"
						 + bb.getTot() + "\t"
						 + String.format("%.2f", bb.getAvg()));
		
		
		SungJuk cc;
		cc = new SungJuk();
		cc.setName("손해석");
		cc.setKor(92);
		cc.setEng(91);
		cc.setMath(82);
		
		cc.calc();
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(cc.getName() + "\t"
						 + cc.getKor() + "\t"
						 + cc.getEng() + "\t"
						 + cc.getMath() + "\t"
						 + cc.getTot() + "\t"
						 + String.format("%.2f", cc.getAvg()));

	}

}

/*
 * 필드: name, kor, eng, math, tot, avg 
 * 메소드:setName, setKor, setEng, setMath 
 * 		 calc
 * 		 getName, getKor, getEng, getMath, getTot, getAvg
 * 
 * [실행결과]
 * 이름	  국어 	 영어 	 수학 	총점	     평균 
 * 김효자   95     90      83    xxx      xx.xx
 * 윤해랑   78     62      90    xxx      xx.xx
 * 손해석    82     70      78    xxx      xx.xx
 * 
 */