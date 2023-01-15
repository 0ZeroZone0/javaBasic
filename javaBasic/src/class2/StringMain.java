package class2;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int index = 0;
		
		System.out.print("문자열 입력 : ");
		String str = scan.next();

		System.out.print("현재 문자열 입력 : ");
		String target = scan.next();

		System.out.print("바꿀 문자열 입력 : ");
		String replacing = scan.next();
		
		if(str.length() < target.length()) //크면 상관없다 //하지만 작으면 문제가생긴다
			System.out.println("입력한 문자열의 크기가 작습니다");
		else {
			str = str.toLowerCase();//소문자로
			target = target.toLowerCase();//타켓을 대문자로 바꾼다.
//			str=str.toUpperCase();//대문자로
//			target= target.toLowerCase();//타켓을 소문자로 바꾼다.
			
			
			while((index = str.indexOf(target, index)) != -1) { //-1이 아닌이상 계속 돌아라
				count++;
				index += (target.length()); //글자수의 크기만큼 인덱스가 바뀐다.
			};//while
			
			System.out.println(str.replace(target, replacing));
			System.out.println(count + "개 치환");
		};//else
	};
};

/*
치환하는 프로그램을 작성하시오 - indexOf(), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환
----------------
문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환
----------------
문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환
----------------
문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환
----------------
문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

*/