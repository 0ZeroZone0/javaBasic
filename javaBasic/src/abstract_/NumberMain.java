package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//3자리 마다 , 쉼표 찍고 소수이하는 3째자리 까지 찍는다
//		NumberFormat nf = new NumberFormat(); -error
		
		NumberFormat nf = new DecimalFormat();
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		//유효숫자가 아닌것은 표현하지 않는다
		NumberFormat nf2 = new DecimalFormat("#,###.##원"); //소수점이없는건 표시x
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		//0을 강제로 표시
		NumberFormat nf3 = new DecimalFormat("#,###.00원");//자릿수에 강제로 맞추기
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//메소드를 이용하여 생성, 기본적으로 3자리 마다 , 쉼표 찍고 소수이하는 3째자리 까지 찍는다
//		NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf4 =NumberFormat.getCurrencyInstance(); //앞에 돈 표시
		nf4.setMaximumFractionDigits(2);//소수이하 2째 자리 까지
		nf4.setMinimumFractionDigits(2);//강제로 0을 표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
	
//		NumberFormat nf4 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf5 =NumberFormat.getCurrencyInstance(Locale.JAPAN);//앞에 돈 표시
		nf5.setMaximumFractionDigits(2);//소수이하 2째 자리 까지
		nf5.setMinimumFractionDigits(2);//강제로 0을 표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
	};
};