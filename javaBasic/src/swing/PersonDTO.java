package swing;

public class PersonDTO {
	private String id;
	private String name;
	private String pwd;
	private String phone;
	
	public PersonDTO(String id, String name, String pwd, String phone) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
	};

	public String getId() {
		return id;
	};

	public String getName() {
		return name;
	};

	public String getPwd() {
		return pwd;
	};

	public String getPhone() {
		return phone;
	};
	
	
};