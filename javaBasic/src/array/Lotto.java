package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lotto {
//로또 숫자는 다 6개
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] lotto = new int[6];
		int money;
		
		System.out.print("돈 입력 : ");
		money = Integer.parseInt(br.readLine());
		
		for(int w=1; w<=money/1000; w++) {

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				};
			};

			// 중복을 제거해야한다
		};// for i

		int temp;
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				};

			}; // for j
		}; // for i

		// 출력
		for (int data : lotto) {
			System.out.print(String.format("%02d  ", data)); //4자리수씩 맞추겠다
		};
		System.out.println();
		
		//1장당 5줄
		
		if(w%5==0) System.out.println();
		
		};//for w
	};

};