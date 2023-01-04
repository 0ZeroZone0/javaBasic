package for_;

public class ForTest4 {

	public static void main(String[] args) {
		int sum = 0;//가비지값 안생기게 무조건 초기화 시켜줘야한다
		int mul = 1;
		
		for(int i=1; i<=10; i++) {
			sum += i; //sum = sum + i;
			mul *= i; //mul = mul * i;
			
			System.out.println(i + "\t" + sum + "\t" + mul );
	
		};//for

	};//main

};