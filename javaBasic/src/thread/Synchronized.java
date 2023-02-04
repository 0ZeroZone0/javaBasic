package thread;

public class Synchronized extends Thread {
	private static int count;
	
	public Synchronized() {
		System.out.println("this = " + this);
	};
	
	@Override
//	public synchronized void run() { -동기화 x  - 스레드 3가지가 다 들어온다는 뜻
	public void run() {
//		synchronized (this) { //this가 바로 클래스의 주소값이라 못막는다.
		synchronized (Synchronized.class) {
			for(int i=1; i<=5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName()+ " : " +count);
			};	
		};
	};

	public static void main(String[] args) {
		Synchronized aa= new Synchronized(); //스레드 생성
		Synchronized bb= new Synchronized();
		Synchronized cc= new Synchronized();
		
		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");
		
		aa.start();//스레드 시작
		bb.start();
		cc.start();
	};

};