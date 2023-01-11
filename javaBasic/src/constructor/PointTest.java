package constructor;

public class PointTest {
	private int x,y;

	public PointTest() {
		x = y = 10;
	};
	
	public PointTest(int x, int y) {
		this.x =x ;
		this.y = y;
	};
	
	public void calcPlus() {
		x += 10;
	};
	
	public void calcPlus(int x , int y) {
		this.x += x;
		this.y -= y;
	};
	
	public int calcPlus(int y) {
		this.y += y;
		return this.y;
	};	

	public static void main(String[] args) {
		PointTest pt = new PointTest();
		System.out.println(" x = " + pt.x + "\t y=" +pt.y);
		
		System.out.println("\n x의 값을 +10 증가하는 메소드를 작성하시오");
		
		pt.calcPlus(); //호출
		
		System.out.println(" x = " + pt.x + "\t y=" +pt.y);
		System.out.println();
		PointTest pt2 = new PointTest(100,200);
		System.out.println(" x = " + pt2.x + "\t y=" +pt2.y);
		
		System.out.println("\n x의 값을 3 증가, y의 값을 -8 감소하는 메소드를 작성하시오");
		pt2.calcPlus(3, 8);
		System.out.println(" x = " + pt2.x + "\t y=" +pt2.y);
		
		System.out.println("\n y의 값을 10 증가하는 메소드를 작성하시오");
		int y = pt2.calcPlus(10);
		System.out.println();	System.out.println(" x = " + pt2.x + "\t y=" +y);
		
	};
};