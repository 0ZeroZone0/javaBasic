package inheritance;

/*
class EnumColor {
	static final String RED = "빨강";
	static final String GREEN = "초록";
	static final String BLUR = "파랑";
	static final String MAGENTA = "보랑";
}
*/

//앞에 enum을 걸면 전부 다 상수라서 굳이 static final을 쓸 필요가없다(생략)
//enum은 상수들의 집합
//EnumColor도 자료형으로 먹힌다
enum EnumColor {//상수들을 묶어서 처리한다
	RED,GREEN,BLUE,MAGENTA
}

//-------------
public class EnumMain {

	public static void main(String[] args) {
		System.out.println(EnumColor.RED);//new할필요없다
		System.out.println();
		
		String colorName = "빨강";
		EnumColor color = EnumColor.RED; //하나의 자료형처럼 쓰인다
		System.out.println(colorName + "\t" + color);
		System.out.println();
		
		for(EnumColor data : EnumColor.values()) {//enum 안에 있는 값을 하나씩 꺼내와라
			System.out.println(data + "\t" 
								+ data.ordinal() + "\t" //인식하는 오는순서대로 0123...가 순서대로 준다
								+ data.valueOf(data+"")); //문자열을 주었더니 enum으로 꺼내온거다
//			System.out.println(data.valueOf("BLACK"));//블랙을 찾아서 찍어줘  -error
		};//for
	};

};