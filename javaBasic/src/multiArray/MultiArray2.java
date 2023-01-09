package multiArray;

public class MultiArray2 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		int count=0;
		
		for(int i=ar.length-1; i>=0; i--) {
			for(int j=ar[i].length-1; j>=0; j--) {
				count++;
				ar[i][j] = count;
			};
		};
		
		//출력
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%5d", ar[i][j]));
			};
			System.out.println();
		};

	};

};

/*
  100   99   98   97   96   95   94   93   92   91
   90   89   88   87   86   85   84   83   82   81
   80   79   78   77   76   75   74   73   72   71
   70   69   68   67   66   65   64   63   62   61
   60   59   58   57   56   55   54   53   52   51
   50   49   48   47   46   45   44   43   42   41
   40   39   38   37   36   35   34   33   32   31
   30   29   28   27   26   25   24   23   22   21
   20   19   18   17   16   15   14   13   12   11
   10    9    8    7    6    5    4    3    2    1
 */