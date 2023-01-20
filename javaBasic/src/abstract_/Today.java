package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException {
     //시스템의 날짜와 시간
	 Date date = new Date();
	 System.out.println("오늘 날짜 : " + date);
	 System.out.println();
		
	 //출력
	 //년도 월 요일 시간  HH가 24시간
	 SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
	 //hh나 HH 에 따라 달라진다. 오전 오후에 따라서
	 System.out.println("오늘 날짜 : " + sdf.format(date));
	 System.out.println();
	 
	 //입력  입력할때 형식을 잡는다.
	 SimpleDateFormat input = new SimpleDateFormat("yyyyMMddhhmmss");
	 Date birth = input.parse("20050305142652"); // String -> Date 형식으로 바꿔주겠다
	 System.out.println("내 생일 : " + birth);
	 System.out.println("내 생일 : " + sdf.format(birth));
	 System.out.println();
	 
//	 Calendar cal = new Calendar(); //error
//	 Calendar cal = new GregorianCalendar(); //기준은 시스템 날짜와 시간, Sub class를 이용하여 생성
//	 Calendar cal = Calendar.getInstance(); //메소드를 이용하여 클래스 생성 //메소드안에서 new가 일어나기때문에 그냥 나는 사용만 해주면된다.
	 Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific")); //외국시간에 맞추기
	 
//	 int year = cal.get(Calendar.YEAR); //static final 걸려있다.
	 int year = cal.get(1);//이렇게쓰면 굉장히 싫어한다.비추!. 그래서 자바에서 final을 걸어서 상수화로 만들어놨던거다 
	 
	 int month = cal.get(Calendar.MONTH)+1;//0->1월, 1->2월, 2->3월
	 int day = cal.get(Calendar.DAY_OF_MONTH);//한달동안의 일 
	 int week = cal.get(Calendar.DAY_OF_WEEK); //1->일요일, 2->월요일 ....
	 int hour = cal.get(Calendar.HOUR_OF_DAY); 
	 int minute = cal.get(Calendar.MINUTE); 
	 int second = cal.get(Calendar.SECOND);
	 
	 String dayOfWeek = null;
	 switch(week){
		 case 1 : dayOfWeek = "일요일"; break;
		 case 2 : dayOfWeek = "월요일"; break;
		 case 3 : dayOfWeek = "화요일"; break;
		 case 4 : dayOfWeek = "수요일"; break;
		 case 5 : dayOfWeek = "목요일"; break;
		 case 6 : dayOfWeek = "금요일"; break;
		 case 7 : dayOfWeek = "토요일"; break;
	 };//switch

	 System.out.println("오늘 날짜 : " +year + "년 "
			 						 +month+ "월 "	
			 						 +day  + "일 "
			 						 +dayOfWeek+" "
			 						 +hour + "시 "
			 						 +minute + "분 "
			 						 +second + "초 ");
	};
};