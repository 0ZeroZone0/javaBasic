package collection;

public class PersonDTO implements Comparable<PersonDTO> {
	private String name;
	private int age;
	
	//세터대신 생성자로 잡음
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
	};
	
	public String getName() {
		return name;
	};
	
	public int getAge() {
		return age;
	};
	
	//이걸 주석처리하면 주소값만 나온다.
	@Override
	public String toString() {
		return name + "\t" + age;
	};

	@Override//추상메소드
	public int compareTo(PersonDTO p) {//밑에 기준을 나이로 잡은거다. 기준은 선택사항!
//		if(this.age < p.age) return -1; //비교대상자 오른쪽이 더크면 -1
//		else if(this.age > p.age ) return 1;
//		else return 0;//같을때
		
		//조건 ? 참 : 거짓;
//		return this.age < p.age ? -1 : 1;//기본값 오름차순
		return this.age < p.age ? 1 : -1;//기본값 내림차순
	};
};