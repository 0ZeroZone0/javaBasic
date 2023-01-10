package class_;

public class Compute {
	
	private int x, y, sub, sum, mul;
	private double div;
	
	public void calc(){
		sub = x-y;
		sum = x+y;
		mul = x*y;
		div = (double)x/y;
	};

	public int getX() {
		return x;
	};
	
	public int getY() {
		return y;
	};
	public int getSub() {
		return sub;
	};
	public int getSum() {
		return sum;
	};
	public int getMul() {
		return mul;
	};
	public double getDiv(){
		return div;
	};

	public void setX(int xx) {
		x = xx;
	};
	public void setY(int yy) {
		y = yy;
	};
	
};