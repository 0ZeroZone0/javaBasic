package class2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st=new StringTokenizer(str, ","); //str에 있는걸 , 기준으로 해달라
		System.out.println("토큰 개수 = " + st.countTokens()); //3개
		
		//for문으로 안돌아간다  /배열의 인덱스가 없어서 
		while(st.hasMoreTokens()) { //true 면 실행
			System.out.println(st.nextToken());
		};//while 
		
		System.out.println("--------------");
		
//-------------split
		String[] ar = str.split(","); //비어있는값도 처리한다
		
		for(String data : ar) { //for문은 배열이있어서 사용 가능
			System.out.println(data);
		};
	};
};