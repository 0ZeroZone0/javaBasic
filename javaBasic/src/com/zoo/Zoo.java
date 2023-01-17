package com.zoo;

public class Zoo {//메인이 없어서 실행이 안됨
	public void tiger() { //전부다
		System.out.println("무서운 호랑이");
	};
	
	protected void giraffe() {//다른패키지에 있어도 자식은 접근허용
		System.out.println("목이 긴 기린");
	};
	
	private void lion() { // 내 클래스안에만 
		System.out.println("멋진 사자");
	};
	
	void elephant() {//디폴트는 내패키지만//
		System.out.println("뚱뚱한 코끼리");
	};
	
//	디폴트는 자신의 패키지에 있는건 접근하는데
//	사과밭에있는건 접근할수없다
	
};