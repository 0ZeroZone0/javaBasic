package inheritance;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

//Frame은 BorderLayout(동서남북)
//동서남북에는 1개의 Component만 들어간다
public class AwtMain extends Frame {
	//버튼은 반드시 프레임이 있어야 한다.
	private Button newBtn = null ,exitBtn; //클래스는 new 안했으면 null값 가지고있다 
	
	
	public void init() {//초기에 잡아줄때 많이 쓴다. //종이컵역할
		newBtn = new Button("NEW");
		exitBtn= new Button("CLOSE");
		
		//쟁반역할, 동서남북이 없다 //종이컵을 올린다
		Panel p =new Panel(); //FlowLayout(순서대로 배치 - 중앙)
		p.setLayout(new GridLayout(1,2,10,0));//행열배치,균등배치 (행,열,가로여백,새로여백)
		p.setBackground(Color.YELLOW);
		p.add(newBtn);
		p.add(exitBtn);
		
		this.add("North" ,p); //this는 WindowMain2지만 나는 곧 Frame이다
		
		setBounds(900,200,300,400); //위에 두개 결합한것
		setVisible(true);
	};
	
	public static void main(String[] args) {
		AwtMain wm = new AwtMain();
		wm.init();
	};
};

/*
Component(도구)
연필,샤프,볼펜
못,망치
Button,TextField,TextArea . . . . 

Container(도구를 담는 것)
필통,도구상자 
Frame ,Dialog(팝업창)

Java
*GUI
*AWT(부모)    java.awt
  ↑
 Swing(자식) -javax.swing 확장패키지 //그래픽기능까지들어감
 
*/