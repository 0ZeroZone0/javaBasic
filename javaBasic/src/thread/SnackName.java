package thread;

class SnackTest extends Thread{
	private String str;
	
	public SnackTest(String str) {
		this.str=str;
	};
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {         //클래스명이 바로온건 static으로 설정되어있는거
			System.out.println(str + "\t"+ " i = " + i + "\t"+ Thread.currentThread());//현재실행중인 스레드를 찍어달라
		};
	};
};
//-----------------------
public class SnackName {
												//외부에서 들어오는 자극을 처리해달라
	public static void main(String[] args) { 
		SnackTest aa= new SnackTest("새우깡");    //스래드 생성
		SnackTest bb= new SnackTest("포카칩");
		SnackTest cc= new SnackTest("홈런볼");
		
	
		aa.setName("새우깡");
		bb.setName("포카칩");
		cc.setName("홈런볼");
		
		//우선순위 //먼저선택할수있도록  - 1~10(default : 5)
		aa.setPriority(Thread.MAX_PRIORITY); //	aa.setPriority(10)
		bb.setPriority(Thread.MIN_PRIORITY); 
		cc.setPriority(Thread.NORM_PRIORITY); //기본 디폴트값
		
		aa.start(); //스레드 시작 - 스레드 실행(run())
		
//		try {
//			aa.join();//스레드 죽이기. 급한 aa가 좀더 돌고싶다 그럼 bb,cc를 대기상태로 돌려보내고 aa를 더 돌리게해준다.
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		bb.start();
		cc.start();
	};
};