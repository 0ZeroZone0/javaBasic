package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) throws IOException {
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
		//아래랑 같은 문장이다
		
		FileOutputStream fos = new FileOutputStream ("result.txt");
		DataOutputStream dos = new DataOutputStream(fos);
				
		dos.writeUTF("이순신");//문자열
		dos.writeInt(38);
		dos.writeFloat(185.3f);//﻿float형 상수로 바꿔준다
		dos.close();//여기선 사실 의미가없지만 채팅을 할땐 꼭 필요하다. 끊어줘야한다 로그아웃처럼
		
		FileInputStream fis = new FileInputStream("result.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("이름 = "+ dis.readUTF());//문자열로 불러오라
		System.out.println("나이 = "+ dis.readInt());
		System.out.println("키 = "+ dis.readFloat());
		dis.close();
	};
};