package thread;

//    스레드가 아니다 인터페이스는 짝퉁
class JoinTest implements Runnable {

	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println("i = " + i);
		};
	};
	
};
//-------------
public class JoinMain {

	public static void main(String[] args) {
		JoinTest jt = new JoinTest();
		Thread t = new Thread(jt);//스레드 생성

		System.out.println("스레드 시작");
		t.start();//스레드 시작 - 스레드 실행 (run())을 찾으러간다.
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //바로 조인걸어줘야지 스레드 종료후에 안뜬다
		
		System.out.println("스레드 종료");
	};
	//메인이 끝나도 스레드는 종료되지 않는다. 메인이 종료되어도 백그라운드에서 스레드는 돌아간다.
};