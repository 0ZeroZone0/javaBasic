package class_;

public class SungJuk {
	
	private String name;
	private int kor,eng,math,tot;
	private double avg;
	
	public void calc(){
		tot = kor+eng+math;
		avg = (double)tot/3;
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

	public void setName(String n) {
		name = n;
	};

	public void setKor(int k) {
		kor = k;
	};

	public void setEng(int e) {
		eng = e;
	};

	public void setMath(int m) {
		math = m;
	};


};