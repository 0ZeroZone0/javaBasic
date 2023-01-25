package inheritance;

//enum이란 상수를 클래스처럼 써도 상관없다.
enum EnumColor2{
	//enum 괄호안에 데이터는 생성자로 전달된다.
	RED("빨강"), GREEN("초록"), BLUE("파랑"), MAGENTA("보라");
	//이값을 얻고자할때는 생성자를 통해야한다. 생성자가없으면 에러가 난다.
	
	//public을 앞에쓰면 에러가난다 지원을안한다
	//private /default 만 제공한다
	private String colorName;
	
	EnumColor2(String colorName){
		this.colorName = colorName;	
	};
	
	public String getColorName(){
		return colorName;
	};
	
};
//---------------------------------
public class EnumMian2 {

	public static void main(String[] args) {
		System.out.println(EnumColor2.RED);
		System.out.println();
		
		for(EnumColor2 data : EnumColor2.values()) {
			System.out.println(data + "\t" 
								+ data.ordinal() + "\t" 
								+ data.valueOf(data+"") + "\t"
								+ data.getColorName());
		};
	};
};