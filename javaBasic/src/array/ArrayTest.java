package array;

public class ArrayTest {

	public static void main(String[] args) {		
		int[] ar;
		ar = new int[5]; //배열
		System.out.println("배열명 ar = " + ar);
		System.out.println("배열명 ar = " + ar.toString());
		
		ar[0] = 27;
		ar[1] = 36;
		ar[2] = 25;
		ar[3] = 34;
		ar[4] = 12;
		
		System.out.println("배열 크기 = " + ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		};
		System.out.println();
		
		System.out.println("거꾸로 출력");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		};
		System.out.println();
		
		System.out.println("짝수 데이터만 출력");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) System.out.println("ar[" + i + "] = " + ar[i]);
		};
		System.out.println();
		
		System.out.println("확장for");
		for(int data : ar) {
			System.out.println(data);
		};
		System.out.println();

	};

};