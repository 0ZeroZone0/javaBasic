package while_;

public class WhileTest {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10

		int a = 0;

		while (a < 10) {
			a++;
			System.out.print(a + "  ");// 1
		};
		System.out.println();
		
		
//		 A B C D E ....X Y Z 이렇게 나오게 하고
//		 한줄에 7개 씩 나오게 하기
		
		a = 'A';
		int count=0;
		 	 
		while( a <= 90) {
			System.out.print((char)a + "  ");   //A B  ....... X  Y
			a++; // 66(B)  C  . . . . Y  Z [
			
			count++; // 1 2 3 4 5
			if(count%7 ==0) System.out.println();	
		};
	};

};