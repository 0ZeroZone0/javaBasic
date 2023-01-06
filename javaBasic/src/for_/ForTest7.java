package for_;

public class ForTest7 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			
			if(i%2 == 0) {
				sum += i;// sum = sum+i  //2는 짝수라서 +2가됨
				System.out.print("+" +i);//+를 붙여줌
			}else { 
				sum -= i;// sum = sum-i //1은 홀수라서 와서 -1이됨
				System.out.print("-" +i); //그래서 -1 앞에 -를 위해서 붙여줌
			};
		};//for i
		
		System.out.println("="+sum);
	};
};

/*
 * 
 * [실행결과] -1+2-3+4-5+6-7+8-9+10 = 5
 * 
 */