package swing;

import java.awt.Color;

enum Shape { //enum자체가 상수라서 static final 안써줘도 된다 int형이라고도 안해도 된다.
		LINE,CIRCLE,RECT,ROUNDRECT,PEN
		//나중에 채팅할때 로그인할때 로그아웃할때 채팅할때 이런거할때 쓰인다.귓속말인지 등등
};

public class ShapeDTO {
	
//	public static final int LINE=0;//const 라고한다 //enum을 쓰기때문에 여기는 안써줘도 된다.
	private int x1,x2,y1,y2,z1,z2;
	private boolean fill;
	private int color; //칼라의 값을 combo값에 매겨주면된다.
	private Shape shape;
	
//--------------------------------getter
	public int getX1() {
		return x1;
	};

	public int getX2() {
		return x2;
	};
	
	public int getY1() {
		return y1;
	};
	
	public int getY2() {
		return y2;
	};
	
	public int getZ1() {
		return z1;
	};
	
	public int getZ2() {
		return z2;
	};
	
	public boolean isFill() {
		return fill;
	};
	
	public int getColor() {
		return color;
	};
	
	public Shape getShape() {
		return shape;
	};
	
//--------------------------------setter	
	
	public void setX1(int x1) {
		this.x1 = x1;
	};

	public void setX2(int x2) {
		this.x2 = x2;
	};


	public void setY1(int y1) {
		this.y1 = y1;
	};


	public void setY2(int y2) {
		this.y2 = y2;
	};


	public void setZ1(int z1) {
		this.z1 = z1;
	};

	public void setZ2(int z2) {
		this.z2 = z2;
	};

	public void setFill(boolean fill) {
		this.fill = fill;
	};

	public void setColor(int color) {
		this.color = color;
	};

	public void setShape(Shape shape) {
		this.shape = shape;
	};

};