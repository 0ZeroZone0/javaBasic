package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int start, end;
		int sum=0; //얘는 계산에 쓰일 애라서 가비지값이 들어가있으면 안되니까 초기화시켜주기
		
		System.out.print("시작값 입력 : ");
		start = Integer.parseInt(br.readLine());
		
		System.out.print("끝값 입력 : ");
		end = Integer.parseInt(br.readLine());
		
		for(int i=start; i<=end; i++) {
			sum += i ;
			System.out.print(i+ "  ");
			
		};//for
		
		System.out.println("\n합 = " + sum );
	};
};


/*

시작값 입력 : 15
끝값 입력 : 20

15 16 17 18 19 20
합 = xx

*/