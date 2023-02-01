package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();//기본용량10개 ,10개가 넘으면 10개씩 또 증가
		System.out.println("벡터 크기 = " + v.size()); //0 
		System.out.println("벡터 크기 = " + v.capacity()); //10
		System.out.println();
		
		
		System.out.println("항목 추가");
		for(int i =1; i<=10; i++) {
			v.add(i+"");//위에 String타입이니까 "" 붙여서 타입을 변환시킴.
		};
		
		for(int i =0; i<v.size(); i++) {
			System.out.print(v.get(i)+"  ");
		};
		
		System.out.println();
		System.out.println("벡터 크기 = "+v.size());//10
		System.out.println("벡터 크기 = "+v.capacity());//10
		System.out.println();
		
		v.addElement(5+""); //v.add를 써도된다. 둘중하나쓰면된다 //중복허용,들어간 순서도 지킨다
		for(String data : v) {
			System.out.print(data+"  ");
		}
		System.out.println();
		System.out.println("벡터 크기 = "+v.size());//11
		System.out.println("벡터 크기 = "+v.capacity());//20
		System.out.println();
		
		System.out.println("항목 삭제");
//		v.remove("5"); //앞의 있는 5가 지워진다. //Object 형식
		v.removeElementAt(10); //뒤의 5가 지워진다. //v.remove(10); 써도된다 //지운다고 용량이 주는건아니다.
		
		Iterator<String> it = v.iterator();  //인터페이스라 new가 안된다
		while(it.hasNext()) { //있냐 없냐 물어보기
			System.out.print(it.next()+"  ");//꺼내고 버퍼에 넣은뒤에 다음으로 이동
		}//while
		
		System.out.println();
		
		Vector<String> v2 = new Vector<String>(5,2);//기본용량 5개 , 2개씩 증가
	};
};