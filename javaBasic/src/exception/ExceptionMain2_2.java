package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain2_2 {
	private int dan;
	
	public void input() throws IOException {//구현부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단을 입력:");
		dan = Integer.parseInt(br.readLine());
	};
	
	public void output() {
		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			};
			
		}else {
//			System.out.println("범위 초과 2~9까지만 입력하세요");
			try {
//				throw new Exception("범위 초과...2~9까지만 입력하세요"); //개발자가 강제로 Exception 발생
				throw new MakeException("범위 초과...2~9까지만 입력하세요"); //개발자가 강제로 Exception 발생
				}catch(Exception e ) {
					e.printStackTrace();//에러를 보여줘~
				};
		};
	};
	
	public static void main(String[] args) throws IOException  {
		ExceptionMain2_2 main2 = new ExceptionMain2_2();
		main2.input();//호출
		main2.output();
	};
};