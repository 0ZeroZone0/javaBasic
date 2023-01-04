package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, dab;
		int count;
		String yn;
		
		while(true) {
			System.out.println();
			count = 0;
		
			for(int i=1; i<=5; i++) {//5문제
				a = (int)(Math.random()*90)+10;//10~99
				b = (int)(Math.random()*90)+10;//10~99
				
					for(int j=1; j<=2; j++) { // j=1, j=2 - 틀린경우 1번 더 기회를 준다
					System.out.print("["+ i + "] " + a + " + " + b + " = "); //난수 화면 출력
					dab = Integer.parseInt(br.readLine());
					
					if(dab == a+b) { 
						System.out.println("딩동뎅"); 
						count++;
						break; //break는 for, switch만 벗어나는거임 if 를 벗어나는게아님
					}else {
						if(j==2)System.out.println("분발하세요...정답은 " + (a+b) + "입니다");
						else System.out.println("분발하세요");
					};
				};//for j
				     
			};//for i
			
			System.out.println("\n 당신의 총 "+count+"문제를 맞추어서 "+ count*20 +"점 입니다");
			
			System.out.print("한번 더 (Y/N) : ");
			yn = br.readLine();
			
			if(yn.equals("N") || yn.equals("n")) break; // while를 벗어나라
		};//while
		
		System.out.println("프로그램을 종료합니다");
	};

};

/*
10~99난수를 2개(a,b) 발생하여 합을 맞추는 게임
문제수는 총 5문제를 제공한다
1문제당 점수 20점씩 계산
틀리면 한번 더 기회를 준다  //for문 한번더 주면된다.

[실행결과]

[1] 26 + 35 = 10
틀렸다
[1] 26 + 35 = 50      //한번 더 기회를 주기
틀렸다... 정답은 61

[2] 12 + 10 = 22
딩동뎅
..
[5] 10 + 90 = 85
틀렸다
[5] 10 + 90 = 100
딩동댕

당신의 총 x문제를 맞추어서 xx점 입니다

한번 더 (Y/N) : N
프로그램을 종료합니다.

*/