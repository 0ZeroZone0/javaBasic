package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class URLMain {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://www.naver.com/index.html");
		
		System.out.println("프로토콜 = " + url.getProtocol());
		System.out.println("호스트 = " + url.getHost());
		System.out.println("포트 = " + url.getPort()); //-1 //포트가없어서
		System.out.println("기본 포트 = " + url.getDefaultPort()); //https는 443
		System.out.println("파일 = " + url.getFile());
		System.out.println();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine()) != null ) {
			System.out.println(line);
		};
		br.close();
	
	};

};