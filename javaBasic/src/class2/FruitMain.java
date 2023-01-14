package class2;

public class FruitMain {

	public static void main(String[] args) {
//		Fruit []ar =new Fruit[3];	//객체배열 생성
		Fruit [] ar = 	{new Fruit("사과",100,80,75),
						new Fruit("포도",30,25,10),
						new Fruit("딸기",25,30,90)};//객체배열 생성
	
		System.out.println("------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("------------------------------------");
		for(int i=0; i<ar.length; i++){
			ar[i].calcTot();
			ar[i].dispTot();
		};//for
		System.out.println("------------------------------------");
		Fruit.output();

	};

};
/*
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
필드  : pum, jan, feb, mar, tot
       sumJan, sumFeb, sumMar
메소드 : 생성자
       calcTot
       dispTot
       output

[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75        255
포도     30    25    10        xxx
딸기     25    30    90        xxx
---------------------------------
        xxx   xxx   xxx
*/