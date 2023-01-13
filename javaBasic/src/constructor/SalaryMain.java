package constructor;

public class SalaryMain {

	public static void main(String[] args) {
		//SalaryDTO의 주소를 담는 방을 5개 생성
		SalaryDTO[] ar = new SalaryDTO[5]; //이걸 옮기면 안된다.//main안에서만 삶
		
		SalaryService service = new SalaryService();//여기 ar 쓸려면 서비스클래스에 주석풀어주면됨
		service.menu(ar);//위에 ar 쓰면 여기는 ar 안써도됨 둘중하나 선택
		
		System.out.println("프로그램을 종료합니다.");
	};
};

/*
 입력 출력 수정 삭제 ---> 서비스
 세율은 if문으로 비교

직원들의 월급을 계산하는 프로그램을 작성하시오 - 5사람// 다 정수형으로 받기

세율은 합계가 200만원 이하 : 1%(0.01), 
          400만원 이하 : 2%(0.02), 
          400만원 초과 : 3%(0.03)으로 설정한다.
세금 = (기본급 + 수당) * 세율;
월급 = 기본급 + 수당 - 세금;


SalaryDTO
- 필드 : empId(사원번호), name(이름), position(직급), basePay(기본급), benefit(수당), 
           taxRate(세율), tax(세금), salary(월급)
- 메소드 : 생성자 - 입력
              calc()
              getter

SalaryDTO.java
SalaryService.java
menu()
    ************************
          1. 사원 등록
          2. 전체 출력
          3. 사원 정보 수정
          4. 퇴사
          5. 종료
    ************************
       번호 :    

insertEmp() - Scanner 사용
사원번호 입력 :
사원명 입력 :
직급 입력 :
기본급 입력 :
수당 입력 : 

등록 완료

display() 
사원번호     이름   직급   기본급   수당   세율   세금   월급

updateEmp()
사원번호 입력 : 
사원번호가 없습니다
-----------------------

사원번호 입력 : 

사원번호     이름   직급   기본급   수당   세율   세금   월급

직급 입력 :
기본급 입력 :
수당 입력 : 

수정 완료

deleteEmp()
사원번호 입력 : 
사원번호가 없습니다
-----------------------

사원번호 입력 : 
삭제 완료

SalaryMain.java - main()

*/