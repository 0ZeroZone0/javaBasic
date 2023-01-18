package inheritance;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingMain extends JFrame{
	private JButton newBtn = null, exitBtn;
	
	public void init() {
		setLayout(null); //동서남북이 사라진다. 아무대나 배치가 가능
		
		newBtn = new JButton("새로만들기");
//		exitBtn = new JButton("종료");
		exitBtn = new JButton(new ImageIcon("xs.png"));
		
		newBtn.setBounds(100,100,100,50);
		exitBtn.setBounds(100,200,100,50);
		
		this.add(newBtn);
		this.add(exitBtn);
		
		setBounds(900, 200, 300, 400);
		setVisible(true);
	
	};

	public static void main(String[] args) {
		SwingMain sm = new SwingMain();
		sm.init();
	};

};