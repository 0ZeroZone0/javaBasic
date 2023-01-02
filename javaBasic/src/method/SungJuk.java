package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJuk {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		
		System.out.print("국어 점수 입력 : ");
		int kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 입력 : ");
		int math = Integer.parseInt(br.readLine());
		
		
		int tot = kor + eng + math;
		double avg = (double)tot/3;
		
		String grade = null;
		
//		if(avg>90) grade = "A";
//		if(avg<90 && avg>80) grade = "B";
//		if(avg<80 && avg>70) grade = "C";
//		if(avg<70 && avg>=60) grade = "D";
//		if(avg<60 ) grade = "F";
		
//		if(avg>=90) grade = "A";
//		else if(avg>=80) grade = "B";
//		else if(avg>=70) grade = "C";
//		else if(avg>=60) grade = "D";
//		else grade = "F";
		
		
		switch((int)avg / 10) {
		case 10 : 
		case 9 : grade = "A"; break;	
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F";
		}
		
		System.out.println("\t***" + name + "성적 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(  kor  + "\t"
							+eng  + "\t"
							+math + "\t"
							+tot  + "\t"
							+String.format("%.3f", avg) + "\t"
							+grade);
		
	};
};

/*
이름(name), 국어(kor), 영어(eng), 수학(math)점수를 입력하여 총점(tot)과 평균(avg)을 구하시오

학점 - 평균이 90이상이면 "A"
      평균이 80이상이면 "B"
      평균이 70이상이면 "C"
      평균이 60이상이면 "D"
      그외는 "F"

[실행결과]
이름 입력 : 홍길동
국어 점수 입력 : 98
영어 점수 입력 : 75
수학 점수 입력 : 82

   *** 홍길동 성적 ***
이름      국어      영어      수학      총점      평균
홍길동   98      75      82      xxx      xx.xxx

*/