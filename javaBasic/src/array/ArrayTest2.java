package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException { //구현
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
			System.out.println("args["+i+"] 문자열 크기 = " + args[i].length());
			System.out.println("args["+i+"] 문자열의 첫번째 문자 = " + args[i].charAt(0));
			System.out.println();
		};// for i
		System.out.println();
		
		System.out.println("확장for");
		for(String data : args) {
			System.out.println(data);
			System.out.println("문자열 크기 = " + data.length());
			System.out.println("문자열의 첫번째 문자 = " +  data.charAt(0));
			System.out.println();
		};
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.println((i+1) + "번째 문자 : " + str.charAt(i));
		};
	};
};

/*
문자열 입력 : 파인애플 (str)
1번째 문자 : 파   str.charAt(0)
2번째 문자 : 인	 str.charAt(1)
3번째 문자 : 애	 str.charAt(2)
4번째 문자 : 플 	 str.charAt(3)

문자열 입력 : 도마뱀 (domabem)
1번째 문자 : 도
2번째 문자 : 마
3번째 문자 : 뱀
 */