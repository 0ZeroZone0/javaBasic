package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class WindowTest extends Frame{//프레임이 윈도우의 창을만드는 역할 //메인도 콜백
	public WindowTest() {//구현부
		setTitle("내가 만든 윈도우");//제목주기
		
		setForeground(Color.white);
		
//		setBackground(Color.YELLOW);//노랑색
		setBackground(new Color(221,149,205)); //원하는 색상넣기
		
//		setLocation(900,200);
//		setSize(300,400);
		setBounds(900,200,300,400); //위에 두개 결합한것
		setVisible(true); //true 보여라 false면 숨겨라 //많이쓴다
	};//WindowTest()
	
	//호출한적이없는데 실행이됐다? //자바가상머신에 의해 호출
	//일정한 시점, 어떠한 사건이 발생하면 JVM에 의해서 호출되는 메소드다. = 콜백 메소드
	//일정한 시점 = setVisible 창을 띄울때
	//repaint(); 하면 JVM이 다시불러준다. 스스로는 부를수없다
	public void paint(Graphics g) {//구현부
		g.drawString("도형그리기", 100,100);
		g.drawLine(100,150 ,200,250);
		g.drawLine(200,150 ,100,250);
//		g.drawRect(x좌표, y좌표, 너비, 높이);
		g.drawRect(80, 150, 100, 100);
		g.drawOval(100,200,100,100);
		
	};
};


public class WindowMain {

	public static void main(String[] args) {
		WindowTest wt = new WindowTest();//호출
	};
};