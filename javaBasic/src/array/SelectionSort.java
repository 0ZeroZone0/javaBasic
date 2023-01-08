package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {56, 30, 25, 78, 55};
		
		System.out.print("정렬 전 : ");
		for(int x : ar) {
			System.out.print(x+"  ");
		};
		
		System.out.println();
		
		//정렬
		int temp;
		for(int i=0;  i<ar.length-1; i++) {
			for(int j=i+1;  j<ar.length; j++) {
				if(ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				};
				
			};//for j
		};//for i
		
		System.out.print("정렬 후 : ");
		for(int x : ar) {
			System.out.print(x+"  ");
		};
		System.out.println();

	};

};