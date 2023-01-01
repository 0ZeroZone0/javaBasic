package basic;

public class CompTest {

	public static void main(String[] args) {
		int a=25, b=36;
		
		/*만약에 a에 들어있는 값이 b보다 크다면 ? a : b; 
      		a >= b ? a : b ;
      		System.out.println(a >= b ? a : b );    */
		
		int max = a >= b ? a : b ;
		int min = a < b ? a : b ;
		
		
		System.out.println("큰 값 = " + max);
		System.out.println("작은 값 = " + min);
		
	};

};