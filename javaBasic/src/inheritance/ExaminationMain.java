package inheritance;

import java.util.Scanner;

public class ExaminationMain {

	public static void main(String[] args) {
		/*
		//생성자 호출
		Examination exam = new Examination();
		//비교실행
		exam.compare();
		
//		exam.getOx(); //이건 주소값만 갖고온다. 왜냐면 배열이라서 
		
		
		System.out.println("이름\t1 2 3 4 5 \t점수");
		System.out.print(exam.getName()+"t"); //이름
		for(int i=0; i<exam.getOx().length; i++) { //ox출력
			System.out.print(exam.getOx()[i]+"  ");
		}
		System.out.print("\t"+exam.getScore());
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int size = scan.nextInt();
		
		Examination[]ar= new Examination[size]; //배열 생성
		  for(int i=0; i<size; i++) {
			  ar[i] = new Examination(); //클래스 생성
			  ar[i].compare();//비교
			  System.out.println();
		  };//for
		  
		  //출력
		  System.out.println("이름\t1 2 3 4 5 \t점수");
		  for(int k=0; k<size; k++) {
		      System.out.print(ar[k].getName()+"\t");
		      for(int i=0; i<ar[k].getOx().length; i++) {//ar[0]의 ox의 크기만큼 돌린다
		          System.out.print(ar[k].getOx()[i]+" ");
		         };
		      System.out.println("\t"+ar[k].getScore());
		  };//for k
	};
};



/*
main

생성
메소드 호출
출력


----------------------------------------
이름과 5개의 답을 입력하여 OX로 채점하시오
총 문제수는 5문제이다
점수는 1문제당 20점입니다

[실행결과]
이름 입력 : 이순신
답 입력 : 14123

이름      1 2 3 4 5   점수
이순신   O X O X X   40
-------------------------------

인원수 입력 : 3

이름 입력 : 이순신
답 입력 : 13211

이름 입력 : 신해
답 입력 : 11111

이름 입력 : 김구
답 입력 : 13242

이름      1 2 3 4 5   점수
이순신     O X X O O   60
신해      O O O O O   100
김구      O X X X X   20

Examination
필드 - name, dap, ox[], score
      private final String JUNG = "11111"; //정답 
메소드 - 생성자 (Scanner)
       compare() - 비교
       getter      

*/