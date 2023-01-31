package collection;

import java.text.DecimalFormat;
import java.util.Comparator;

public class SungJukDTO implements Comparable<SungJukDTO>{
	
	private int number;
	private String name;
	private int kor,eng,math,tot;
	private double avg;
	
	public void calc(){
		tot = kor+eng+math;
		avg = (double)tot/3;
//		avg = tot/3.0; //위랑같은거
	};


	public int getNumber() {
		return number;
	};
	
	public String getName() {
		return name;
	};

	public int getKor() {
		return kor;
	};

	public int getEng() {
		return eng;
	};

	public int getMath() {
		return math;
	};
	
	public int getTot() {
		return tot;
	};
	
	public double getAvg(){
		return avg;
	};

// -------------------------------set 동전투입구 같은 역할

	public void setNumber(int number) {
		this.number = number;
	};
	
	public void setName(String name) {
		this.name = name;
	};

	public void setKor(int kor) {
		this.kor = kor;
	};

	public void setEng(int eng) {
		this.eng = eng;
	};

	public void setMath(int math) {
		this.math = math;
	};

	// -------------------------------
	
	@Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("#.###");
		return number+"\t"
				+name+"\t"
				+kor+"\t"
				+eng+"\t"
				+math+"\t"
				+tot+"\t"
				+df.format(avg);
	};
	
	@Override
	public int compareTo(SungJukDTO p) {//이름
		return this.tot < p.tot ? -1 : 1;//기본값 오름차순
	};
	
	
	Comparator<SungJukDTO> com =new Comparator<SungJukDTO>() { //총점
		@Override
		public int compare(SungJukDTO p1, SungJukDTO p2) {
			return p2.getName().compareTo(p1.getName()) ;//내림차순 방법2
			
		};
	};
	

	
};