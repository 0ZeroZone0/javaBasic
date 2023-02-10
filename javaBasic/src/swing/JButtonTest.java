package swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JButtonTest extends JFrame {
	       //인터페이스-new X  여기에 Icon쓰면안됨 인터페이스라서 대신써줄애를 쓴거니까
	
//									패키지로/프로젝트로/폴더로/이미지
//	private Icon icon1 = new ImageIcon("../../image/cat.png");
	private Icon icon1 = new ImageIcon("image/cat.png");
	private Icon icon2 = new ImageIcon("image/ghost.png");
	private Icon icon3 = new ImageIcon("image/esang.png");
	private Icon icon4 = new ImageIcon("image/pikachu.png");
//	private JButton  이건 이미지 한개밖에 못올라감
	private JRadioButton[] btn = new JRadioButton[4]; 

	public JButtonTest() {
		super("버튼 이미지");//부모생성자 호출 //제일 첫번째줄에 들어가야한다.
//		setTitle(); //아무데가 갖다가 써도된다
		

		ButtonGroup group = new ButtonGroup();
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,2));
		
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JRadioButton( (i+1)+"번 버튼", icon1);
			btn[i].setToolTipText((i+1)+"번째 버튼이다...눌러 봥");//풍선도움말 그림위에 마우스올리면 도움말뜸
			btn[i].setRolloverIcon(icon2); //마우스 올릴때 다른그림으로 넣기
			btn[i].setPressedIcon(icon3); //누를때 다른이미지로 뜨기
			btn[i].setSelectedIcon(icon4); //클릭 하면 다른이미지
			btn[i].setMnemonic(i+49); //alt+1 / alt+2 / alt+3/ alt+4 단축키  //49는 1이니까
			
			
			group.add(btn[i]);
			c.add(btn[i]);
		};//for		
		
		
		pack();//이미지 크기에 맞게 프레임창을 조절해줌
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	};
	
	
	public static void main(String[] args) {
		new JButtonTest();
	};

};