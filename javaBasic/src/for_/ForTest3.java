package for_;

public class ForTest3 {

	public static void main(String[] args) {
		int num;
		int count = 0;
				
		for(int i=1; i<=100; i++) {
			
			num = (int)(Math.random()*26) + 65;//65 ~ 90
			System.out.print((char)num + "  " );
			if(i % 10 == 0) System.out.println();
			
			if(num=='A') count++;
			
		}; //for
	     System.out.println("\n 총 A의 개수 = " + count);	
	 };
};



/*

 65(A)~90(Z)사이의 난수를 100개 발생하여 출력하시오
 1줄에 10개씩 나오도록 하시오
 
[실행결과]   < 난수라서 랜덤으로 나옴
J  L  D  A  V  E  G  D  F  A
J  L  D  A  V  E  G  D  F  A  //랜덤으로 나와야함
J  L  D  A  V  E  G  D  F  A  //랜덤으로 나와야함
J  L  D  A  V  E  G  D  F  A  //랜덤으로 나와야함
J  L  D  A  V  E  G  D  F  A  //랜덤으로 나와야함
J  L  D  A  V  E  G  D  F  A  //랜덤으로 나와야함

 총 A의 갯수 =??

*/