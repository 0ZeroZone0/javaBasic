package inheritance;

import java.util.Scanner;

public class Examination {
		
		private final String JUNG = "11111"; //정답 - 상수화
		
		private String name =null;
		private String dap;
		private char[] ox =null; // 배열명은 주소를 가지고 있어서 null을 줬다
		private int score;
		
		public Examination() { //초기화
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름 입력 :");
			name = scan.next();
			System.out.print("답 입력 :");
			dap = scan.next();
			System.out.println();
			
			ox= new char[5];
		};
		
	
//------------------------------------------------compare()
	public void	compare() {
		for (int i=0; i<ox.length; i++) {
			if(JUNG.charAt(i)==dap.charAt(i)) {
				ox[i] ='o';
				score += 20;
			}else 
				ox[i]='x';
		};
	};
//------------------------------------------------getter
	public String getName() {
		return name;
	};
	public char[] getOx() {
		return ox;
	};
	public int getScore() {
		return score;
	};	
		
};