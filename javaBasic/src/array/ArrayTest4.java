package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] ar = new int[100];
		int count=0;
		int sum=0;
		int[] cnt = new int[26];
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = (int)(Math.random()*26+65);
		};
		
		for(int i=0; i<ar.length; i++) {
			System.out.print((char)ar[i]+"  ");
			count++;
			if(count%10==0) System.out.println();
			
			sum += ar[i];
			
			for(int j=0; j<cnt.length; j++) { 
				if(ar[i] == j+65) cnt[j]++;	  
			};//for j
			
		};//for i
		
		System.out.println();
		System.out.println("합 = "+sum);
		for(int i=0; i<cnt.length; i++) {
			System.out.println((char)(i+65) + "의 개수 = " + cnt[i]);
		};
	
	};

};