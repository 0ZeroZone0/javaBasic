package nested;

public class AbstactMain {

	public static void main(String[] args) {
		AbstactTest at =  new AbstactTest() { //익명 Inner class
			@Override
			public void setName(String name) { //구현
				this.name = name;
			}
		};
		
		//인터페이스는 new 할수없다. 할려면 뒤에는 클래스가 와야한다
		//근데 인터페이스가 와서 빨간줄이 그어졌다 없앨려면
		InterA in = new InterA() {//익명Inner 클래스를 new해준다. 인터페이스를 new해준게아니다.
			public void aa() {}
			public void bb() {}
			
		}; 
		
		//추상클래스라서 절대 new를 못한다
		AbstactExam ae = new AbstactExam() {};//익명으로 하면 에러사라짐 //﻿추상메소드가없는 추상클래스
		//쓰고싶으면 오버라이딩 하면된다.
	};

};