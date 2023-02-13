package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain2 {

	public static void main(String[] args) throws IOException {
		//view-source:https://www.jestina.co.kr/pages/1210
		//14k,14K - 대소문자 가리지말고 다 찾아보기 (28개)
	
		URL url = new URL("https://www.jestina.co.kr/pages/1210");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String line = null;
		int count = 0;
		int idx =0;
	
		while((line = br.readLine()) != null ) {
			line =line.toLowerCase();
			idx=0;
			
			while((idx=line.indexOf("14k",idx))!= -1) {
				count++;
//				idx = idx + ("14k".length()); //밑에랑 같은거
				idx += ("14k".length());
			};
		};//while
		System.out.println("14K의 개수 = " + count);
		
		br.close();


	};
};