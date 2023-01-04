package for_;

public class ForTest {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i<=10; i++) {
			System.out.println("Hello Java" + i);
		};
		
		System.out.println("탈출 i = " + i);
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1
		for(i=10; i>=1; i--) {
			System.out.print(i+"  ");
		};
		
		System.out.println();
		
		//A B C D E F G . . . . X Y Z
//		for(i=65; i<=90; i++ ) {
//			System.out.print((char)i +"  ");
//		}
		
		for(i='A'; i<='Z'; i++ ) {
			System.out.print((char)i +"  ");
		};
		
     };//main
};