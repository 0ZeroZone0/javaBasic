package interface_;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


//인터페이스는 짝퉁이고 틀로 (추상화)만든걸 내가 가져다가 사용해서 구현하는거다.
class WindowTest extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
	private JButton newBtn, exitBtn;
	private JTextArea area;//글자공간
	
	public WindowTest() {
		newBtn = new JButton("새로 만들기");
		exitBtn = new JButton("종료");
		area = new JTextArea();//글자
		JScrollPane scroll = new JScrollPane(area);//스크롤바
		
		JPanel northP = new JPanel();
		northP.add(newBtn);
		northP.add(exitBtn);
		
		add("North",northP);
		add("Center",scroll);
	
		
		setBounds(900,100,300,400);
		setVisible(true);
		
		//이벤트
		this.addMouseListener(this);
		//나한테서 클릭이벤트가 생기니까 구현부를 가진것도 나야~ 라고 JVM알려주기
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
		newBtn.addActionListener(this);
		exitBtn.addActionListener(this);
	};//WindowTest()
	
	
		//MouseListener Override - Event Handler
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("마우스 클릭");
		};

		@Override
		public void mousePressed(MouseEvent e) { //마우스를 눌렀을때 
			System.out.println("X = " + e.getX() + "Y = "+ e.getY());// x,y좌표를 가지고온다
		};

		@Override
		public void mouseReleased(MouseEvent e) {
		
		};

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("마우스 IN");
		};

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("마우스 OUT");
		};

		//MouseMotionListener Override - Event Handler
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("마우스 드래그");
		};

		@Override
		public void mouseMoved(MouseEvent e) {
		};
		
		//ActionListener Override - Event Handler
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==newBtn) {
				area.setText(""); //지워버려라
			}else if(e.getActionCommand()== "종료") { //타이틀이 종료인지 찾아주는중
				System.exit(0);
			};
		};
};//class WindowTest
//------------------------------
public class WindowMain {
	public static void main(String[] args) {
		new WindowTest();
	};

};