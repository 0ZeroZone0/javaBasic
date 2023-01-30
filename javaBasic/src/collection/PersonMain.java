package collection;

import java.util.ArrayList;

public class PersonMain {
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("윤해랑" , 25);
		PersonDTO bb = new PersonDTO("이순신" , 30);
		PersonDTO cc = new PersonDTO("한강" , 17);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
	};
	
	
	public static void main(String[] args) {
		PersonMain main = new PersonMain();
		ArrayList<PersonDTO> list = main.init();//호출
		//같은 타입으로 받아줘여한다 //위에 list랑 전혀다른거다.
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		};
		
		System.out.println();
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getName()+"\t"+list.get(i).getAge());
		};
		
		System.out.println();
		
		for(PersonDTO dto:list) {
			System.out.println(dto.getName()+"\t"+dto.getAge());
	    };
	    
		System.out.println();
	};
};