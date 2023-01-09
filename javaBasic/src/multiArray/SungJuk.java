package multiArray;

public class SungJuk {

	public static void main(String[] args) {
		String[] name = {"이순신", "정약용", "정조"};
		int[][] jumsu = {{90,95,100,0}, {100,90,75,0}, {75,80,48,0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		//계산
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][3] += jumsu[i][j]; //총점
			};//for j
			
			avg[i] = (double)jumsu[i][3] / 3.0; //평균
			
			if(avg[i]>=90) grade[i]='A';
			else if(avg[i]>=80) grade[i]='B';
			else if(avg[i]>=70) grade[i]='C';
			else if(avg[i]>=60) grade[i]='D';
			else grade[i]='F';
		};
		
		//출력
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}//for j
			System.out.println(String.format("%.2f",avg[i])+"\t"+grade[i]);
		};//for i
	};
};

/*
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
이순신	90		95		100
정약용	100		89		75
정조		75		80		48
----------------------------------------------------
 */