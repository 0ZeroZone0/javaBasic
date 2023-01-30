package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄", "쿠웨이트","사우디","대한민국"};
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++) {
			stack.push(groupA[i]);
		};
		
		//is면 boolean형으로 갖고온다 
		while(!stack.isEmpty())//stack이 비어있냐고 물어보는거다
			out.println(stack.pop()); // 최근에 추가된(Top) 데이터 삭제
	};
};