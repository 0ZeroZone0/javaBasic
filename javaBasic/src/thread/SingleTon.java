package thread;

public class SingleTon {
	private int num=3;
			//static은 프로그램시작할때 딱 한번 초기화를 잡는다.
	private static SingleTon instance = null;
	
	public static SingleTon getInstance() {
		if(instance==null) { //현재 생성하는게 첨입니까?
			synchronized (SingleTon.class) {//동기화  -- 한사람만 지나가게 
				//근데 윗문장은 지금 스레드를 안해줘서 사실 지금은 있으나마나다 //무용지물
				//왜냐면 위에 if(instance==null)이걸 물어볼대 이미 한개씩밖에안들어와서
				instance = new SingleTon();// 한사람이라도 만들면 null값 사라지니까
			};
		};
		return instance;
	};

	public static void main(String[] args) {
		
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = "+ aa);
		System.out.println("num = "+ aa.num); //4
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = "+ bb);
		System.out.println("num = "+ bb.num); //4
		System.out.println();
		
		System.out.println("** 싱글톤 ***");
		SingleTon cc =SingleTon.getInstance();
		cc.num++;
		System.out.println("cc = "+ cc);
		System.out.println("num = "+ cc.num); //4
		System.out.println();
		
		SingleTon dd =SingleTon.getInstance();
		dd.num++;
		System.out.println("dd = "+ dd);
		System.out.println("num = "+ dd.num); //5
		System.out.println();
		
	};

};