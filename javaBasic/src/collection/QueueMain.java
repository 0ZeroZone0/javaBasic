package collection;

import java.util.LinkedList;
import static java.lang.System.out;

//운영체제에서 자주쓴다. 그래서 대부분 운영체제에서 많이쓰이는게 Queue
// 먼저들어온걸 먼저 처리한다 FIFO 퍼스트인퍼스트아웃
public class QueueMain {

	public static void main(String[] args) {
		String[] item = {"소나다","캐스퍼","제규어"};
		LinkedList<String> q = new LinkedList<String>();
		
		for(String n : item) 
			q.offer(n); //요소 추가
		
		out.println("q의 크기 : " +q.size()+"\n");
		
//		String data = null;//null도 하나의 상수로 본다 //or "" 으로 해도된다
		String data = "";//비어라 //초기화
		
		//poll(): Queue에서 제거하며 읽기
		while((data=q.poll()) != null) { //null값이 아닐때까지 돌아라.
			out.println(data+" 삭제!");
			out.println("q의 크기 :"+ q.size()+"\n");
			
		};
		
	};

};