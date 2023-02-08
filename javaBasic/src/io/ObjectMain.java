package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersonDTO dto = new PersonDTO("이순신", 25, 185.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(dto);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		
//		ois.readObject() //오브젝트형으로 꺼내와라
//		Object ob = ois.readObject(); //부모 = 자식  //오브젝트로하면 DTO에서 이름,나이,키를 못부름...
		PersonDTO dto2 = (PersonDTO)ois.readObject();//자식 = (자식)부모
		
		System.out.println("이름 = "+ dto2.getName());
		System.out.println("나이 = "+ dto2.getAge());
		System.out.println("키 = "+ dto2.getHeight());
	
		ois.close();
	};
		
};