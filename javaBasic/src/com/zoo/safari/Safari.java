package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.tiger(); 
//		zoo.giraffe(); //생성을 동물원만 생성해서 사파리가 메모리안잡혀있다.
//		zoo.elephant(); 
//		zoo.lion();
		System.out.println();
		
		Safari safari = new Safari();
		safari.tiger(); 
		safari.giraffe(); 
//		safari.elephant(); 
//		safari.lion();

	};
};