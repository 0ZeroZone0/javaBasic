package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RPSGame {

	   public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int com, user;
	      int money;
	      
	      System.out.print("insert coin ? ");
	      money = Integer.parseInt(br.readLine());
	      
	      for(int i=1; i<=money/100; i++) {
	         com = (int)(Math.random()*3)+1; //컴이 난수 1~3 발생
	         
	         System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
	         user = Integer.parseInt(br.readLine());
	         
	         System.out.println(com +","+ user);
	         
	         if(com==1) { //컴이 가위
	            if(user==1) {
	               System.out.println("컴퓨터:가위\t 사용자:가위");
	               System.out.println("Draw!!");
	            }else if(user==2) {
	               System.out.println("컴퓨터:가위\t 사용자:바위");
	               System.out.println("Win!!");
	            }else if(user==3){
	               System.out.println("컴퓨터:가위\t 사용자:보자기");
	               System.out.println("Lose!!");
	            };
	            
	         }else if(com==2) { //컴이 바위
	            if(user==1) {
	               System.out.println("컴퓨터:바위\t 사용자:가위");
	               System.out.println("Lose!!");
	            }else if(user==2) {
	               System.out.println("컴퓨터:바위\t 사용자:바위");
	               System.out.println("Draw!!");
	            }else if(user==3){
	               System.out.println("컴퓨터:바위\t 사용자:보자기");
	               System.out.println("Win!!");
	            };
	            
	         }else if(com==3) { //컴이 보자기
	            if(user==1) {
	               System.out.println("컴퓨터:보자기\t 사용자:가위");
	               System.out.println("Win!!");
	            }else if(user==2) {
	               System.out.println("컴퓨터:보자기\t 사용자:바위");
	               System.out.println("Lose!!");
	            }else if(user==3){
	               System.out.println("컴퓨터:보자기\t 사용자:보자기");
	               System.out.println("Draw!!");
	            };
	         };
	         
	         System.out.println();
	      };//for i

	   };

	};

/*
가위(1), 바위(2), 보(3) 게임 
1게임당 100원이 사용된다 (150원이 입력되면 게임은 1판)
 
[실행결과] insert coin ? 1000
 
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
 컴퓨터 : 바위 나 : 보자기 You Win!!

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
 컴퓨터 : 가위 나 : 보자기 You Lose!!

가위(1),바위(2),보(3) 중 번호 입력 : 2 (user) 
컴퓨터 : 가위 나 : 가위 You Draw!!
*/