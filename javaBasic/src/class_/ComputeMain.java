package class_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Compute[] ar = new Compute[3];
		
		
		for(int i=0; i<ar.length; i++){
			ar[i] = new Compute();
			
			//입력
			System.out.print("x값 입력 :");
	//		int x = Integer.parseInt(br.readLine());  
	//  	ar[0].setX(x); 
	//		ar[0].setX(Integer.parseInt(br.readLine()));   위에 2개 합친게 이문장하고 같다.
			ar[i].setX(Integer.parseInt(br.readLine()));
			System.out.print("y값 입력 :");
			ar[i].setY(Integer.parseInt(br.readLine()));
	
			//계산
			ar[i].calc();
			System.out.println();
			};//for i
		
		
//		ar[2] = null; //방을 비워라
		
		//출력
		System.out.println("X\tY\tSum\tSub\tMul\tDiv");
		for(Compute data: ar) {
			System.out.println(data.getX() + "\t"
					 + data.getY() + "\t"
					 + data.getSum() + "\t"
					 + data.getSub() + "\t"
					 + data.getMul() + "\t"
					 + String.format("%.2f", data.getDiv()));
		};//for
		
	};

};


/*
객체배열 방3개 잡아주기
Compute
필드 : x, y,sum, sub, mul, div
메소드 : setX, setY
       calc
       getX, getY, getSum, getSub, getMul, getDiv
ComputeMain


main()에서 데이터를 입력 받아서 합,차,곱,몫을 계산하시오
[실행결과]
x값 입력: 320
y값 입력: 258

x값 입력: 256
y값 입력: 128

x값 입력: 578
y값 입력: 325

X 	Y 	합 	차 	곱	 몫
320 258
256 128
578 325

*/