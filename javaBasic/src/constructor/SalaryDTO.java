package constructor;

public class SalaryDTO {//클래스는 다 가상이다.
	
	
	private int empId, basePay, benefit, tax, salary;
	double taxRate;
	private String name, position;
	
//  --------------------------------------------생성자
	
	public SalaryDTO (int empId , String position ,String name, int basePay, int benefit){
		this.empId = empId;
		this.name =name;
		this.position =position;
		this.basePay =basePay;
		this.benefit =benefit;
	};
//  --------------------------------------------계산부분
	
	public void calc() { 
		int total = (basePay+benefit);
		
		if(total <= 2000000) taxRate = 0.01;
		else if(total <= 4000000) taxRate = 0.02;
		else taxRate = 0.03;
		
		tax = (int) (total*taxRate);
		salary = total-tax;
	
	};//calc()
//  --------------------------------------------getter
	
	public String getName() {
		return name; //this는 생략가능 //안써도 구분되니까
	};
	
	public String getPosition() {
		return position; 
	};
	
	public int getEmpId() {
		return empId;
	};
	
	public int getBasePay() {
		return basePay;
	};
	
	public int getBenefit() {
		return benefit;
	};
	
	public double getTaxRate() {
		return taxRate;
	};
	
	public int getTax() {
		return tax;
	};
	
	public int getSalary() {
		return salary;
	};

//  --------------------------------------------setter
	
	public void setName(String name) {
		this.name = name;
	};
	
	public void setPosition(String position) {
		this.position = position;
	};
	
	public void setBasePay(int basePay) {
		this.basePay = basePay;
	};
	
	public void setBenefit(int benefit) {
		this.benefit = benefit;
	};
	
};