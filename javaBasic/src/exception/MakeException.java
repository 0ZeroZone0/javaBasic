package exception;

//MakeException이 Exception을 상속받았다.
public class MakeException extends Exception {//개발자가 만든 Exception 클래스
	private String errorMessage;
	
	public MakeException() {}
	public MakeException(String errorMessage) {
		this.errorMessage = errorMessage;
	};
	
@Override
	public String toString() {
//		return errorMessage; //가장기본적인 타이틀 모양
		return getClass()+": "+errorMessage; //클래스명도 같이나오게 설정
	};

};