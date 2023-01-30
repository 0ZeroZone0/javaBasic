package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange","apple","banana","pear","peach","applemang"};
		
		System.out.println("정렬 전 = ");
		for(String str : ar) {
			System.out.print(str + "  ");
		};
		
		System.out.println();
		
		//클래스명이 바로왔다는건 static이라서
		//배열로 잡힌애들을 sort시켜주겠다
		Arrays.sort(ar);
		
		System.out.println("정렬 후 = ");
		
		for(String str : ar) {
			System.out.print(str + "  ");
		};
		
		System.out.println("\n");
		
		//--------------------------------------------------------------------------
		
		PersonDTO aa = new PersonDTO("윤해랑" , 25);
		PersonDTO bb = new PersonDTO("이순신" , 30);
		PersonDTO cc = new PersonDTO("한강" , 17);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬 전");
		System.out.println(list);//toString처럼 오버라이딩하듯이 주소를 내용으로 바꿔버린거다
		System.out.println();
		
		System.out.println("나이로 오름차순");
		Collections.sort(list);//
		
		System.out.println(list);
		System.out.println();
		
		System.out.println("이름으로 오름차순");
		//인터페이스라서 new가 안된다. 그래서 익명을 써준다
		Comparator<PersonDTO> com =new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
//				return p1.getName() < p2.getName())  ? -1 : 1;  //둘다 문자열이라서 문자열은 비교가 안된다 -error
				
//				return p1.getName().compareTo(p2.getName()) ; //오름차순
				
//				return p1.getName().compareTo(p2.getName())*-1 ; //내림차순 방법1
				return p2.getName().compareTo(p1.getName()) ; //내림차순 방법2
			};
		}; 
		
		Collections.sort(list,com);
		
		System.out.println(list);
		System.out.println();
		
	};
};