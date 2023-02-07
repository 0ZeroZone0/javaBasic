package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
//		data =bis.read();
//		System.out.println(data);
		
		while((data =bis.read()) != -1) {
				System.out.print((char)data);
		};
		bis.close(); 
	};

};