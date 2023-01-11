package class_;

public class MemberDTO {

	//번호, 비밀번호, 우편번호 도 문자열로 들어와야한다
	
	private String name,address,phone;
	private int age;
	
// -------------------------------getter

	public  String getName() {
		return name; //this 있는데 생략된거
	};
	
	public int getAge() {
		return age;
	};
	
	public String getPhone() {
		return phone;
	};
	
	public String getAddress() {
		return address;
	};
	

// -------------------------------setter 
	
	public void setName(String name) {
		this.name = name;
	};
	
	public void setAge(int age) {
		this.age = age;
	};
	
	public void setPhone(String phone) {
		this.phone = phone;
	};
	
	public void setAddress(String address) {
		this.address = address;
	};
	
};