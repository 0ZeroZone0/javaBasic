package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

//	@SuppressWarnings("all")
	@SuppressWarnings({"rawtypes" , "unchecked"})
	public static void main(String[] args) {
		Collection coll = new ArrayList(); //인터페이스가 다른클래스(어레이리스트)를 통해서 생성이되는거다
		//인터페이스는 무조건 임플리먼츠만 쓰는게아니다!
//		ArrayList coll = new ArrayList();//어차피 어레이가 콜렉션을 다 구성하고있으니까 이렇게 써도된다.
		coll.add("호랑이"); 
		coll.add("사자"); 
		coll.add("호랑이");  //중복허용,순서대로 처리
		coll.add(25); 
		coll.add(43.8); 
		coll.add("기린"); 
		coll.add("코끼리"); 
		
		//지정자 =누굴 가리킬때
		Iterator it = coll.iterator();//Iterator를 Collection에 만들어 달라.
		while(it.hasNext()) {//현재위치에 항목이 있다면 true
			System.out.println(it.next()); //항목을 꺼내서 버퍼에 넣은걸 찍어달라 그리고 다음으로 이동간다.
		};
	
	};
};

//add하면 넣는거고
//remove하면 지우는거다

/*
Collection interface

1. implements - 모든 추상메소드를 Override 해야한다
 15개 정도가 있다..... 너무많다.....

2.익명

new Collection() {
	모든 추상메소드를 Override 해야한다
}
결국 1번하고 같은 개념...

3. 대신 implements 해주는 클래스 - WindowListener - WindowAdapter(추상클래스, 추상메소드x)
	또 대신 안해주는 애들도있따..그럴땐 메소드를 사용.
	
	ArrayList(추상x 그냥 일반클래스 걍 new 해주면됨)

4. 메소드   - 저 클래스를 불러서 구현해주는 메소드가 있다.

*/