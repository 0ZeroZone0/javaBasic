package class_;

class Person {//식당의 메뉴판 역할은 이 클래스다 /

	private String name; //나는 누구다 하고 이름밝히는거// 메모리에 안잡힌다 //필드 =쓰레기값이없다/이미 초기화가되어있다
	//null 값을 가지고있다
	private int age; // 나이를 알려준다 // 메모리에 안잡힌다//필드, 초기화로 0값을 가지고있다.
	
	
	public void setName(String n){//구현
		name=n;
	};
	public void setAge(int a){//구현
		age=a;
	};
	public void setData(String n, int a){
		age=a;
		name=n;
	};
	
	public void setData() {} //아무것도 없어서 위에잡은 기본값으로 나가버린다. null하고 나이값으로

	public String getName() {
		return name;
	};
	public int getAge() {
		return age;
	};
};


public class PersonMain { //이 클래스는 메인만 감싸는 기능밖에 없다

	public static void main(String[] args) {
		Person aa; //객체 생성 /aa에는 Person 의 주소가 잡혀있다
		aa = new Person(); //
		System.out.println("객체 aa = " +aa);
//		name = "홍길동" // 이렇게 치면 안된다.
		aa.setName ("또치");
		aa.setAge(25);
		System.out.println("이름 = "+ aa.getName() + "\t 나이 = " + aa.getAge() );
		
		System.out.println();
		Person bb;
		bb=new Person();
		System.out.println("객체 bb = " +bb);
		bb.setName("코난");
		bb.setAge(13);
		System.out.println("이름 = "+ bb.getName() + "\t 나이 = " + bb.getAge() );
		System.out.println();
		
		Person cc;
		cc= new Person();
		System.out.println("객체 cc = " +cc);
		cc.setData("홍길동",30);
		System.out.println("이름 = "+ cc.getName() + "\t 나이 = " + cc.getAge() );
		System.out.println();
		
		Person dd;
		dd= new Person();
		System.out.println("객체 dd = " +dd);
		dd.setData();
		System.out.println("이름 = "+ dd.getName() + "\t 나이 = " + dd.getAge() );
		System.out.println();
		
	};
};

//int aa;  		정수형 변수
//double aa; 	실수형 변수
//String aa; 	객체(클래스형 변수)  - 주소가 들어옴 / aa에 절대 데이터가 담긴게 아니라 주소가 있다