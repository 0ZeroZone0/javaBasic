package multiArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJuk2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("인원수 입력 : ");
		int cnt = Integer.parseInt(br.readLine());

		String[] name = new String[cnt];
		int subjectCnt;
		String[][] subject = new String[cnt][];
		int[][] jumsu = new int[cnt][];
		double[] avg = new double[cnt];
		
		//입력
		for(int i=0; i<cnt; i++) {
			System.out.print("이름 입력 : ");
			name[i] = br.readLine();
			
			System.out.print("과목수 입력 : ");
			subjectCnt = Integer.parseInt(br.readLine());
			
			subject[i] = new String[subjectCnt]; //생성
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = br.readLine();
			};//for j
			
			jumsu[i] = new int[subjectCnt+1]; //생성
			for(int j=0; j<subjectCnt; j++) {
				System.out.print(subject[i][j] + "점수 입력 : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				
				jumsu[i][subjectCnt] += jumsu[i][j]; //총점
			};//for j
			
			avg[i] = (double)jumsu[i][subjectCnt] / subjectCnt; //평균
			
			System.out.println("------------");
		};//for i
		
		//출력
		for(int i=0; i<cnt; i++) {
			//타이틀
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"\t");
			};
			System.out.println("총점\t평균");
			
			//점수
			System.out.print(name[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t"); 
			};
			System.out.println(avg[i]);
			System.out.println();
		};//for
	};

};

/*
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt) - 변수

이름입력 : 이순신 (name) - 1차원
과목수 입력 : 2   (subjectCnt) - 변수
과목명 입력 : 국어 (subject) - 2차웡
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu) - 2차웡
영어 점수 입력 : 100
----------------
이름입력 : 정약용
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어	  영어   총점     평균
이순신    95	  100   xxx	  xx.xx

이름		국어  영어   과학    총점      평균
정약용   95   100	   90	 xxx      xx.xx

 */