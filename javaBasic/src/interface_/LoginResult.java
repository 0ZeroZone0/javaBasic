package interface_;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class LoginResult extends JFrame implements WindowListener {
	private String id, pwd;
	
	public LoginResult(String id, String pwd) {
		this.id=id;
		this.pwd=pwd;
		
		setFont(new Font("돋움체",Font.BOLD,24));
		setBounds(800,80,200,200);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);
	};
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(id.equals("angel")&& pwd.equals("1004")) {
			setForeground(Color.BLUE);			
			g.drawString("로그인 성공", 35, 100);
		}
		else {
			setForeground(Color.RED);
			g.drawString("로그인 실패", 35, 100);
		};
	};

	@Override
	public void windowOpened(WindowEvent e) {
		
	};

	@Override
	public void windowClosing(WindowEvent e) {
		setVisible(false);//창닫으면서 사라지게해줌.
	};

	@Override
	public void windowClosed(WindowEvent e) {
		
	};

	@Override
	public void windowIconified(WindowEvent e) {
		
	};

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	};

	@Override
	public void windowActivated(WindowEvent e) {
		
	};

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	};
};