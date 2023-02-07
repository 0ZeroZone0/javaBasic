package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt") ;//data.txt파일을 하나의 파일로 생성해라
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		int size = (int)file.length();//파일의 크기
		byte[] b = new byte[size];
		//파일들이 배열속으로 들어왔다,위치값(배열의몇번째),랭스크기//BufferedInputStream의 함수
		bis.read(b,0,size);
		
//		for(int i=0; i<size; i++) {
//			System.out.println((char)b[i]);
//		}
		
		
		System.out.println(new String(b));//byte[]를 String으로 생성//배열을 문자열로 바꾼다
	
		bis.close();

	};
};