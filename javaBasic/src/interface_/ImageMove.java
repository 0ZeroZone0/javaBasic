package interface_;

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

public class ImageMove extends JFrame implements ActionListener, WindowListener,KeyListener{
	private JButton resetBtn,leftBtn,upBtn,downBtn,rigthBtn; //생성을 안해서 기본적으로 null값
	int x =230, y=255;
	
	public void init() {
		//버튼생성
		resetBtn = new JButton("reset");
		leftBtn = new JButton("left");
		rigthBtn = new JButton("right");
		upBtn = new JButton("up");
		downBtn = new JButton("down");
		
		JPanel northP =new JPanel();//FlowLayout(순서배치 - 중앙을 중심으로)
		northP.setBackground(new Color(255,200,255));
		northP.add(resetBtn);
		northP.add(leftBtn);
		northP.add(rigthBtn);
		northP.add(upBtn);
		northP.add(downBtn);
		
		Container c = this.getContentPane();//콘텐트페인의 구역을 얻어와라
		c.add("North",northP);
		c.setBackground(Color.WHITE);//콘텐트페인의 구역색을 하옇게 바꿔라
		
		setTitle("움직여 도비");
		setBounds(900,200,500,500);
		setResizable(false); //크기조정하지말라
		setVisible(true);
		
		//이벤트
		resetBtn.addActionListener(this);
		leftBtn.addActionListener(this);
		rigthBtn.addActionListener(this);
		upBtn.addActionListener(this);
		downBtn.addActionListener(this);
		this.addWindowListener(this);	
		resetBtn.addKeyListener(new ImageMove());
		leftBtn.addKeyListener(new ImageMove());
		rigthBtn.addKeyListener(new ImageMove());
		upBtn.addKeyListener(new ImageMove());
		downBtn.addKeyListener(new ImageMove());
		
	};//init()
	
	public void paint(Graphics g) {
		//이미지 불러오기
		super.paint(g);//부모에있는 페인트메소드를 불러준다.이걸줘야지 버튼하고 이미지가 같이보인다
		
		Toolkit t = Toolkit.getDefaultToolkit(); 
		Image img=t.getImage("car.png");
		
		//이미지 위치
		g.drawImage(img,
	               x,y,
	               this);
	};//Graphics
	
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
			
			if(y<30) y=480;
			
		}else if(e.getSource()==downBtn) {
			y += 50;
//			repaint();
			
			if(y>480) y=30;
		};
			repaint();  //하나하나있는것보다 그냥 밖에 한번 있어도 돌아간다.
			
		
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
	
	
	public static void main(String[] args) {
//		ImageMove move = new ImageMove();
//		move.init();
		new ImageMove().init(); //위에랑 같은거다.	
	};

	@Override
	public void keyTyped(KeyEvent e) { //키보드의 타입을 알아보는거
		
	};

	@Override
	public void keyPressed(KeyEvent e) { //키를 누를때=
		 int key = e.getKeyCode();
	     if(key == KeyEvent.VK_LEFT) x -= 50;
	     if(key == KeyEvent.VK_RIGHT) x += 50;
	     if(key == KeyEvent.VK_UP) y += 50;
	     if(key == KeyEvent.VK_DOWN) y -= 50;
		
	};
		
//		if( e.getKeyCode() == 37 ) System.out.println( "왼족 누름");
//		else if( e.getKeyCode() == 38 ) System.out.println( "위 누름");
//		else if( e.getKeyCode() == 39 ) System.out.println( "오른쪽 누름");
//		else if( e.getKeyCode() == 40 ) System.out.println( "아래 누름"); 


	@Override
	public void keyReleased(KeyEvent e) { //키보드에서 손을뗄때
		
	};

};