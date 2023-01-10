package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3]; //객체 배열 - 주소 /배열을 만든거지 클래스를 만든게아니다
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setName("김효자");
		ar[0].setKor(95);
		ar[0].setEng(90);
		ar[0].setMath(83);
		
		ar[1].setName("윤해랑");
		ar[1].setKor(78);
		ar[1].setEng(62);
		ar[1].setMath(90);
		
		ar[2].setName("손해석");
		ar[2].setKor(82);
		ar[2].setEng(70);
		ar[2].setMath(85);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<ar.length; i++) {
			ar[i].calc();
			
			System.out.println(ar[i].getName() + "\t"
							 + ar[i].getKor() + "\t"
							 + ar[i].getEng() + "\t"
							 + ar[i].getMath() + "\t"
							 + ar[i].getTot() + "\t"
							 + String.format("%.2f", ar[i].getAvg()));
		};//for i
	};
};