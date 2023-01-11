package class_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberMain {
	
	private MemberDTO[] ar = new MemberDTO[5];//방배열잡는거//원래는 메인안에 자주넣긴함
	
	public static void main(String[] args)throws IOException{
		
		
		MemberMain main = new MemberMain(); //객체생성
		main.menu();
		System.out.println("프로그램을 종료합니다");
	}
	
	public void menu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//원래 밖의 클래스에 자주씀
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("    1.가입     ");
			System.out.println("    2.출력     ");
			System.out.println("    3.수정     ");
			System.out.println("    4.탈퇴     ");
			System.out.println("    5.끝내기     ");
			System.out.println("***************");
			System.out.println();
			System.out.print( "번호 :   ");
			num = Integer.parseInt(br.readLine());
			
			if(num==5) break; 
			if(num==1) insertMember();
			else if(num==2) list();
			else if(num==3) updateMember();
			else if(num==4) deleteMember();
		
		
		}//while
		
	}//menu()
	
	public void insertMember() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int i;
		int count=0; //빈 자리 갯수 셀려고
		
		for(i=0; i<ar.length; i++) {
			if(ar[i]==null) count++; //빈방이면 카운트세라	
		}
		if(count == 0) {
			System.out.println("정원초과..");
			return;
			}
			
		for(i=0; i<ar.length; i++)
		{
			if(ar[i]==null) break;
		}
		
		ar[i] = new MemberDTO(); //클래스 생성 //방만 잡아서 여기다가 넣어준다
		
		System.out.println();
		System.out.print("이름 입력 : ");
		ar[i].setName(br.readLine());
		System.out.print("나이 입력 : ");
		ar[i].setAge(Integer.parseInt(br.readLine()));
		System.out.print("핸드폰 입력 : ");
		ar[i].setPhone(br.readLine());
		System.out.print("주소 입력 : ");
		ar[i].setAddress(br.readLine());
		System.out.println();
		System.out.println("등록 완료..");
		
		System.out.println((count-1) + "자리가 남았습니다");//위에 등록하면서 한자리 빠지니까
	}//insertMember()
	
	public void list() {
		System.out.println();
		System.out.println("이름		나이 		핸드폰		   주소");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!= null) {
			System.out.println(ar[i].getName()+"\t\t"
							+ar[i].getAge()+"\t\t"
							+ar[i].getPhone()+"\t\t"
							+ar[i].getAddress()+"\t\t");	
				}
			}
	}//list()
	
	//회원정보 수정
	public void updateMember() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" 핸드폰 번호 입력 : ");
		String phone=(br.readLine());
		int i;
		
		for(i=0; i<ar.length; i++) 
		{
			if(ar[i] !=null) {//전화번호가 입력되어있으면
//		    if(phone.equals(ar[i].getPhone())){ //이렇게 써도된다.
				//입력받은 번호와 ar[i].getPhone()이 같으면
				if(ar[i].getPhone().equals(phone)){
				break;//찾으면 반복문 탈출
		        }
		     }
		 }//for
		if(i==ar.length) {//i=5일때 (찾은게 하나도없을때)
			System.out.println("찾고자 하는 회원이 없습니다.");
			return;
		}
		System.out.println(ar[i].getName()+"\t"
				+ar[i].getAge()+"\t"
				+ar[i].getPhone()+"\t"
				+ar[i].getAddress()+"\t");	
		
		System.out.println();
		System.out.println();
		System.out.print("이름 입력 : ");
		ar[i].setName(br.readLine());
		System.out.print("나이 입력 : ");
		ar[i].setAge(Integer.parseInt(br.readLine()));
		System.out.print("핸드폰 입력 : ");
		ar[i].setPhone(br.readLine());
		System.out.print("주소 입력 : ");
		ar[i].setAddress(br.readLine());
		System.out.println();
		System.out.println("수정 완료..");
	
		}//updateMember()
	
	//회원삭제
	public void deleteMember() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		System.out.println(" 핸드폰 번호 입력 : ");
		String phone=(br.readLine());
		int i;
		
		for(i=0; i<ar.length; i++) 
		{
			if(ar[i] !=null) {
//		    if(phone.equals(ar[i].getPhone())){ //이렇게 써도된다.
				if(ar[i].getPhone().equals(phone)){
				break;
		        }
		     }
		 }//for
		
		if(i==ar.length) {
			System.out.println("찾고자 하는 회원이 없습니다.");
		}else {
			ar[i] = null;
			System.out.println("탈퇴 완료...");
		}
	
		}//deleteMember()
	}

/*
MemberDTO (Data Transfer Object) - 데이터를 이동시킬수있는 하나의 객체다/ 1인분의 정보를 저장하는것
MemberV (Value Object) -1인분의 데이터가 저장
MemberDAO -데이터를 억세스 할때 /디뷰아이랑 연동하는거

MemberDTO
- name, age, phone, address
- setter / getter

insertMember() //빈자리를 찾아서 넣어줘야 한다.
이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

등록 완료. 4자리 남았습니다.

list()
이름		나이		핸드폰		주소
총 5명 중에서 등록된 회원만 보여준다 

updateMember()
핸드폰 번호 입력 : 010 123 1234
찾고자 하는 회원이 없습니다.

-------------------------------------------(만약 있다면)
 이름		나이		핸드폰		주소
이순신		23		010			서울  (예시)

이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

수정 완료

deleteMember()
핸드폰 번호 입력 : 010 123 1234
찾고자 하는 회원이 없습니다.

핸드폰 번호 입력 : 010 123 1234
삭제 완료
*/

/*
클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다.// =5개의 배열
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 출력, 수정, 탈퇴 프로그램을 작성하시오// =메소드 구성 //주차장관리 입차가입 출차출력

menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 

*/