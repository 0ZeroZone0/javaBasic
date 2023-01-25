package inheritance;

import java.util.Scanner;

public class Assert {
	private int x,y;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		 x = scan.nextInt();
		System.out.print("y값 입력 : ");
		y = scan.nextInt();
	};
	
	public void output() {
//		assert y>0;//0보다 작으면 여기서 멈춰
		assert y>=0 : "y는 반드시 0보다 커야한다";
		
		int mul=1;
		for(int i =1; i<=y; i++) {
			mul *= x;
		};
		System.out.println(x+"의 "+y+"승 "+mul);
	};

	public static void main(String[] args) {
		Assert as =new Assert();
		as.input();
		as.output();
	};

};


/*
x값 입력 : 2
y값 입력 : 5     input()
-------------------------------
2의 5승은 xx     output()

*/