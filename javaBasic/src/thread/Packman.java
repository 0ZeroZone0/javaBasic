package thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Packman extends JFrame implements KeyListener {
	int x = 80, y=80;
	
	public Packman() {
		
		JPanel packmanP = new JPanel();
		packmanP.setBackground(Color.WHITE);
		
		setTitle("팩맨");
		setBounds(900,200,500,500); //창 크기
		setResizable(false);//창크키 고정
		setVisible(true);//창 보여주기
		setDefaultCloseOperation(EXIT_ON_CLOSE);//시스템끄기
		
		add(packmanP);
		
		//이벤트
		this.addKeyListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("packman.png");
		
		//이미지 위치
		g.drawImage(img,x,y,this);
	}
	
	//KeyListener Override
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			x -= 50;
			if(x<-30) x=480;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x += 50;
			if(x>480) x=-30;
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			y -= 50;
			if(y<-30) y=410;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			y += 50;
			if(y>420) y=-30;
		}
			repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	public static void main(String[] args) {
		new Packman();
		
	}

}
