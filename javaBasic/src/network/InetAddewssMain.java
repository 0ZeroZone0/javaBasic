package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddewssMain {

	public static void main(String[] args) throws UnknownHostException {

//		InetAddress naver = new InetAddress(); //생성자가없어서 new가 안된다. 그래서 메소드를 써줘야한다.
		InetAddress naver = InetAddress.getByName("www.naver.com");//주소를 가지고와
		System.out.println("NAVER IP = "+naver.getHostAddress());//주소의 호스드주소를 보여줌
		System.out.println();
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("localhost IP = "+local.getHostAddress());//내 주소를 알려줘
		System.out.println();
		
		InetAddress[] daum =InetAddress.getAllByName("www.daum.net");
		for(InetAddress data : daum) {
			System.out.println("Daum IP = "+data.getHostAddress());
		};
		
	};

};