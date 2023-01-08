package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseBall {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		int yn;
		int strike, ball;
		
		do {
			System.out.print("게임을 실행하시겠습니까(Y/N) : ");
			yn = br.read();
			br.read();br.read(); //flush
			
			if(yn=='Y' || yn=='y' || yn=='N' || yn=='n') break;
		}while(true);
		
		if(yn=='Y' || yn=='y') {
			System.out.println("\n 게임을 시작합니다");
			
			//난수 발생
			for(int i=0; i<com.length; i++) {
	            com[i] = (int)(Math.random()*9)+1;
	            
	            //중복
	            for(int j=0; j<i; j++) {
	                if(com[i]==com[j]) {
	                   i--;
	                   break;
	                };
	            };//for j
			};//for i
			//System.out.println(com[0]+","+com[1]+","+com[2]);
			
			//숫자 입력해서 맞추기
			while(true) {
				//입력
				System.out.print("숫자입력 : ");
				for(int i=0; i<user.length; i++) {
					user[i] = br.read()-48;
				};//for
				br.read(); br.read(); //flush
				//System.out.println(user[0]+","+user[1]+","+user[2]);
				
				//비교
				strike=ball=0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						if(com[i] == user[j]) {
							if(i==j) strike++;
							else ball++;
						};
					};//for j
				};//for i
				
				System.out.println(strike+"스트라이크     "+ball+"볼");
				if(strike==3) break;
				
			};//while
			
		};//if
		
		System.out.println("프로그램을 종료합니다");

		//입력 
		//System.out.println(user[0]+","+user[1]+","+user[2]);

	};

};

/*
야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : n
프로그램을 종료합니다

게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 2볼

숫자입력 : 124
0스트라이크 1볼

숫자입력 : 472
2스트라이크 0볼
..

숫자입력 : 372
3스트라이크 0볼

프로그램을 종료합니다
 */