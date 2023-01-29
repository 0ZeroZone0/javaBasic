package interface_;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageMove2 extends JFrame implements ActionListener, WindowListener,KeyListener {
	private JButton resetBtn,leftBtn,upBtn,downBtn,rigthBtn; //생성을 안해서 기본적으로 null값
	int x =230, y=255;
	private DrCanvas can;
	
	public void init() {
		//버튼생성
		resetBtn = new JButton("reset");
		leftBtn = new JButton("left");
		rigthBtn = new JButton("right");
		upBtn = new JButton("up");
		downBtn = new JButton("down");
		
		can = new DrCanvas();
		
		JPanel northP =new JPanel();//FlowLayout(순서배치 - 중앙을 중심으로)
		northP.setBackground(new Color(255,200,255));
		northP.add(resetBtn);
		northP.add(leftBtn);
		northP.add(rigthBtn);
		northP.add(upBtn);
		northP.add(downBtn);
		
		Container c = this.getContentPane();//콘텐트페인의 구역을 얻어와라
		c.add("North",northP);
		c.add("Center",can);//센터에 캔버스를 붙여라
//		c.setBackground(Color.WHITE);//콘텐트페인의 구역색을 하옇게 바꿔라 //캔버스가 생기면서 의미 무 
		
		setTitle("움직여 도비");
		setBounds(900,200,500,500);
		setResizable(false); //크기조정하지말라
		setVisible(true);
		
		//각각의버튼에대해서 포커스를없애야한다
//		resetBtn.setFocusable(false);
//		leftBtn.setFocusable(false);
//		rigthBtn.setFocusable(false);
//		upBtn.setFocusable(false);
//		downBtn.setFocusable(false);
		
		//이벤트
		this.addWindowListener(this);
		
		resetBtn.addActionListener(this);
		leftBtn.addActionListener(this);
		rigthBtn.addActionListener(this);
		upBtn.addActionListener(this);
		downBtn.addActionListener(this);
		
		resetBtn.addKeyListener(this);
		leftBtn.addKeyListener(this);
		rigthBtn.addKeyListener(this);
		upBtn.addKeyListener(this);
		downBtn.addKeyListener(this);

		this.addKeyListener(this);//KeyListener는 내가 갖고있고 내가 구현할거다~
	};//init()
	

	
	//ActionListener Override
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("x = " + x + " y = " + y);
		if(e.getSource() == resetBtn) {	
			x=230;
			y=255;
//			repaint();
		
		}else if(e.getSource()==leftBtn) {
			x -= 50; //x=x-10
//			repaint();
			
			if(x<-30) x=480;
			
		}else if(e.getSource()==rigthBtn) {
			x += 50;
//			repaint();
			
			if(x> 480) x=-30;
			
		}else if(e.getSource()==upBtn) {
			y -= 50;
//			repaint();
			
			if(y<-30) y=410;
			
		}else if(e.getSource()==downBtn) {
			y += 50;
//			repaint();
			
			if(y>420) y=-30;
		};
			can.repaint();  //하나하나있는것보다 그냥 밖에 한번 있어도 돌아간다.
			
		
	};
	
	public class DrCanvas extends Canvas {
		public DrCanvas() {
			this.setBackground(new Color(255,255,255));
		};
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			Toolkit t = Toolkit.getDefaultToolkit(); 
			Image img=t.getImage("real.jpg");
			
			//이미지 위치
			g.drawImage(img,
		               x,y,
		               this);
		};
	};
	
	
	//WindowListener Override
	@Override
	public void windowOpened(WindowEvent e) {
		
	};
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
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
	
	
	//KeyListener Override
	@Override
	public void keyTyped(KeyEvent e) {
		
	};

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("x = " + x + " y = " + y);
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) { 
			System.exit(0);
			}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			x -= 50; //x=x-10
//			repaint();
			if(x<-30) x=480;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x += 50;
//			repaint();
			if(x> 480) x=-30;
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			y -= 50;
//			repaint();
			if(y<-30) y=410;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			y += 50;
//			repaint();
			if(y>420) y=-30;
		};
			can.repaint();  //하나하나있는것보다 그냥 밖에 한번 있어도 돌아간다.
	};

	@Override
	public void keyReleased(KeyEvent e) {
		
	};
	
	
	public static void main(String[] args) {
//		ImageMove move = new ImageMove();
//		move.init();
		new ImageMove2().init(); //위에랑 같은거다.	
	};

};