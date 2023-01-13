package constructor;

import java.util.Scanner;

public class SalaryService {
	private Scanner scan = new Scanner(System.in);
//	private SalaryDTO[]ar; ////메인에서 생성자에 ar  쓸려면 이 주석풀면됨
	
	public SalaryService () {}
//	public SalaryService(SalaryDTO[] ar) { ////메인에서 생성자에 ar  쓸려면 이 주석풀면됨
//		this.ar = ar;
//	}
	
	public void menu(SalaryDTO[] ar) {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("   1.사원등록     ");
			System.out.println("   2.전체출력     ");
			System.out.println("   3.사원정보수정  ");
			System.out.println("   4.퇴사       ");
			System.out.println("   5.종료       ");
			System.out.println("***************");
			System.out.println();
			System.out.println("   번호:");
			num = scan.nextInt();
			
			if(num==5) break;
			
			if(num==1) insertEmp(ar);
			else if(num==2) display(ar);
			else if(num==3) updateEmp(ar);
			else if(num==4) deleteEmp(ar);
		};//while
	};//menu()
		
	
	public void insertEmp(SalaryDTO[] ar) {
		int i;
		int count=0; //빈 자리 갯수 셀려고
		
		for(i=0; i<ar.length; i++) {
			if(ar[i]==null) count++; //빈방이면 카운트세라	
		};
		
		if(count == 0) {
			System.out.println("정원초과..");
			return;
		};
			
		for(i=0; i<ar.length; i++)
		{
			if(ar[i]==null) break;
		};
		
		System.out.println();
		System.out.print("사원번호 입력 : ");
		int empId = scan.nextInt();
		System.out.print("사원명 입력 : ");
		String name = scan.next();;
		System.out.print("직급 입력 : ");
		String position = scan.next();
		System.out.print("기본급 입력 : ");
		int basePay = scan.nextInt();
		System.out.print("수당 입력 : ");
		int benefit = scan.nextInt();
		
		ar[i]  =  new SalaryDTO(empId,name,position,basePay,benefit);//생성자 호출
		
		ar[i].calc();
		
		System.out.println();
		System.out.print("등록 완료..");
		
		};//insertEmp(SalaryDTO[] ar)

	
	public void display(SalaryDTO[] ar) {
		
		System.out.println();
		System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t세금\t월급");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				System.out.println(ar[i].getEmpId()+"\t"
						+ar[i].getName()+"\t"
						+ar[i].getPosition()+"\t"
						+ar[i].getBasePay()+"\t"
						+ar[i].getBenefit()+"\t"
						+(int)(ar[i].getTaxRate()*100)+"%\t"
						+ar[i].getTax()+"\t"
						+ar[i].getSalary()+"\t"
						);
			};
		};
	}//display(SalaryDTO[] ar)
	
	public void updateEmp(SalaryDTO[] ar) {
			
			int i;
			System.out.println(" 사원 번호 입력 : ");
			int empId = scan.nextInt();
			
			for(i=0; i<ar.length; i++) 
			{
				if(ar[i] !=null) {
					if(ar[i].getEmpId() == empId){
					break;
			        }
			     }
			 };//for
			if(i==ar.length) { //위에 for문을 다 돌았다는뜻
				System.out.println("찾고자 하는 직원이 없습니다.");
				return;
			};
			System.out.println(ar[i].getEmpId()+"\t"
					+ar[i].getName()+"\t"
					+ar[i].getPosition()+"\t"
					+ar[i].getBasePay()+"\t"
					+ar[i].getBenefit()+"\t"
					+(int)(ar[i].getTaxRate()*100)+"%\t"
					+ar[i].getTax()+"\t"
					+ar[i].getSalary()+"\t");
			
			System.out.println();
			System.out.println();
			System.out.println();//사원번호는 유일한거라서 못바꾼다.
			System.out.print("사원명 입력 : ");
			String name = scan.next();;
			System.out.print("직급 입력 : ");
			String position = scan.next();
			System.out.print("기본급 입력 : ");
			int basePay = scan.nextInt();
			System.out.print("수당 입력 : ");
			int benefit = scan.nextInt();
			
			ar[i].setName(name);
			ar[i].setBasePay(basePay);
			ar[i].setPosition(position);
			ar[i].setBenefit(benefit);
			
			ar[i].calc();
			
			System.out.println();
			System.out.println("수정 완료...");
	};//updateEmp(SalaryDTO[] ar)
	
	
	public void deleteEmp(SalaryDTO[] ar) {
		
		int i;
		System.out.println(" 사원 번호 입력 : ");
		int empId = scan.nextInt();
		
		for(i=0; i<ar.length; i++) 
		{
			if(ar[i] !=null) {
				if(ar[i].getEmpId() == empId){
				break;
		        }
		     }
		 };//for
		 
		if(i==ar.length) { //위에 for문을 다 돌았다는뜻
			System.out.println("찾고자 하는 직원이 없습니다.");
			return;
		};
		
		ar[i] = null;
		System.out.println();
		System.out.println("삭제 완료...");
		
		
		
	};//deleteEmp(SalaryDTO[] ar)

	
};