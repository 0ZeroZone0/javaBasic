/*
3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
첫번째 과목 점수 : 85
두번째 과목 점수 : 80
세번째 과목 점수 : 65
합격

첫번째 과목 점수 : 100
두번째 과목 점수 : 90
세번째 과목 점수 : 35
과락으로 불합격

첫번째 과목 점수 : 62
두번째 과목 점수 : 60
세번째 과목 점수 : 45
불합격
*/


package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest2 {
	
//﻿  예외처리 - 자동차 보험 - try ~~ catch 사용해서 처리 하지만
//	우리는 자바가상머신한테 니가 알아서 처리좀해봐 해서 쓰이는게 밑에 throws IOException
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 과목 점수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번째 과목 점수 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("세번째 과목 점수 : ");
		int c = Integer.parseInt(br.readLine());

		double avg = (double)(a+b+c)/3;
		
		if( avg >= 60) {
			if(a >=40 && b>=40 && c>=40) {
				System.out.print("합격");
			}else
				System.out.print("과락으로 불합격");
		}else {
			System.out.print("불합격");
		};
		
	};

};