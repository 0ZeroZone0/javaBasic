package abstract_;

public abstract class AbstractTest { //POJO (Plain Old Java Object)
	protected String name; //클래스의 기본은 캡슐화 private.

	public String getName() {//구현 - 구현부의 특징 괄호문이열림
		return name;
	};
	
//	public void setName(String name) {//구현
//		this.name = name;
//	}
	
	//실제가게가 아직 안열렸다 //실제 메소드가없다 이름만있는거다
	public abstract void setName(String name); //추상메소드 -body({})를 없앤다.
	
};