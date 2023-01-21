package abstract_;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarMain {
	
	private int year, month , lastDay, week;
	
	public CalendarMain() {
		
		Scanner scan = new Scanner(System.in);
		
		// 입력
		System.out.print("년도 입력 : ");
		year = scan.nextInt();

		System.out.print("월 입력 : ");
		month = scan.nextInt();
	};
	
	public void calc() {
		Calendar cal = Calendar.getInstance();//이때 생성하는 시점에 날짜가 기준이된다. //기준이 시스템 날짜와 시간
		cal.set(Calendar.YEAR, year);//현재 내가원하는 년도로 달라
		cal.set(Calendar.MONTH, month-1);//현재 내가원하는 월로 달라 /1월은 0 / 2월은 1
		cal.set(Calendar.DAY_OF_MONTH, 1);//무조건 시작은 1일이라고 기준잡아주기.//안잡아주면 시스템날짜로 기준됨
		
		//28,29,30,31
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //해당 월 마지막 날짜/ 그월에 가장큰값을 가지고와라
		
		//무슨요일이냐
		week =cal.get(Calendar.DAY_OF_WEEK);
	};
	
	public void display() {
		System.out.println("****************" + year +"년"+ month +"월"+"****************");
	    System.out.print("일\t월\t화\t수\t목\t금\t토\t\n");
	    for(int i=1; i<week; i++) {
	    	System.out.print("\t");
	    }//for i
	    for(int i=1; i<=lastDay; i++) {
	    	System.out.print(i + "\t");
	    	
	    	if(week%7==0)System.out.println();
	    		week++;
	    }//for
	};
	
	public static void main(String[] args) {
		
		CalendarMain main = new CalendarMain();
		main.calc();
		main.display();
	};
};