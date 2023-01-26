package nested;

//이 클래스는 추상클래스가 되면 new 할수없다
public abstract class AbstactTest { //POJO(Plain old java object)형식 -클래스의 기본
	 String name;

	public String getName() {
		return name;
	};

		//추상메소드는 body가 필요없다.
	public abstract void setName(String name);//추상메소드 - 반드시 오버라이드해서 써라
	
};