package collection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class SungJukService {

	private Scanner scan = new Scanner(System.in);	
	private List<SungJukDTO>list;
	DecimalFormat df = new DecimalFormat("#.###");
	private SungJukDTO sungjuck = new SungJukDTO();
	//	private ArrayList<SungJukDTO>list; 이거써도된다.
	////아무것도 안하면 안에 null값이 들어간다.
	
	public SungJukService() {
		list=new ArrayList<SungJukDTO>(); //생성자에 메모리를 만들어줌.
		//현재갖고있는 클래스를 생성하시오
	};
	
	String temp;

	
	public void menu() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("   1.입력      ");
			System.out.println("   2.출력      ");
			System.out.println("   3.검색      ");
			System.out.println("   4.삭제      ");
			System.out.println("   5.정렬      ");
			System.out.println("   6.끝        ");
			System.out.println("***************");
			System.out.println();
			System.out.println("   번호:");
			num = scan.nextInt();
			
			if(num==6) break;
			
			if(num==1) insertArticle();
			else if(num==2) printArticle();
			else if(num==3) searchArticle();
			else if(num==4) deleteArticle();
			else if(num==5) sortArticle();
			else System.out.println("1 ~ 6번중에 선택하세요");
		}//while
	}//menu()
	
	
	private void insertArticle() {
		SungJukDTO sungjuck = new SungJukDTO(); //여따써야지 계속 입력될때마다 생성되니까
		
		System.out.println();
		System.out.print("번호 입력 : ");
		sungjuck.setNumber(scan.nextInt());
		System.out.print("이름 입력 : ");
		sungjuck.setName(scan.next());
		System.out.print("국어 입력 : ");
		sungjuck.setKor(scan.nextInt());
		System.out.print("영어 입력 : ");
		sungjuck.setEng(scan.nextInt());
		System.out.print("수학 입력 : ");
		sungjuck.setMath(scan.nextInt());
		
		sungjuck.calc();//계산
		list.add(sungjuck);
		
		System.out.println();
		System.out.print("등록 완료..");
		
		};//insertArticle()

	
	private void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for( SungJukDTO sungjuck :list) {
			System.out.println(sungjuck);
		};//for
		
	};//insertArticle()
	
	 public void searchArticle() { // 3. 검색
	      boolean yn = false;
	      
	      System.out.print("검색할 이름 입력 : ");
	      String searcName = scan.next();
	      
	      System.out.println();
	      
	      for (int i = 0; i < list.size(); i++) {
	         if (list.get(i).getName().equals(searcName)) { //검색한이름하고 등록한이름이 같다묜.
	            yn = true;
	         }; //
	      }; //for i

	      if (yn) {//true일 경우에 
	         System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
	         for (int j = 0; j < list.size(); j++) { 
	            if (list.get(j).getName().equals(searcName)) { // 검색한이름하고 등록한이름이 같다면.
	               System.out.println(list.get(j).getNumber() + "\t" + list.get(j).getName() + "\t" + list.get(j).getKor()
	                     + "\t" + list.get(j).getEng() + "\t" + list.get(j).getMath() + "\t" + list.get(j).getTot()
	                     + "\t" + df.format(list.get(j).getAvg()));
	            };
	         }; // for k
	      } else if (yn == false)
	         System.out.println("찾고자 하는 이름이 없습니다\n");
	      	 System.out.println();
	   };// searchArticle()

	   public void deleteArticle() { // 4. 삭제
	      boolean yn = false;

	      System.out.print("삭제할 이름 입력 : ");
	      String searcName = scan.next();

	      for (int i = list.size()-1; i >= 0; i--) {
	         if (list.get(i).getName().equals(searcName)) { // 검색한이름하고 등록한이름이 같다면.
	            list.remove(i);//지워버려 낄낄
	            yn = true;
	         }; // Searching Name
	      }; // for i

	      if (yn == false)
	         System.out.println("찾고자 하는 이름이 없습니다\n");
	      else {
	         System.out.println("삭제 처리가 완료되었습니다\n");
	      };

	   }; // deleteArticle()

	   public void sortArticle() { // 5. 정렬

	      while (true) {
	         System.out.println("   1. 이름으로 오름차순");
	         System.out.println("   2. 총점으로 내림차순");
	         System.out.println("   3. 이전메뉴\n");

	         System.out.print("번호 입력 : ");
	         int choiceUser = scan.nextInt();

	         if (choiceUser == 1) { // 1. 이름으로 오름차순
	            Collections.sort(list, sungjuck.com);
	            printArticle();
	         } else if (choiceUser == 2) { // 2. 총점으로 내림차순
	        	 Collections.sort(list);
	            printArticle();
	         } else if (choiceUser == 3) { // 3. 이전메뉴
	            System.out.println();
	            break;
	         } else {
	            System.out.println("\n1~3 중에 선택하세요\n");
	         };
	         System.out.println();
	      };
	   }; // sortArticle()
	}; // class