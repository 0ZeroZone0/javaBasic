package thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Racer extends Canvas implements Runnable{
	private Image img;
	private String name;//말이름을 보관할려고 만들어둠
	private int pos;
	static int rank;
	
	public Racer(String name) {
		setBackground(Color.WHITE);
		img = Toolkit.getDefaultToolkit().getImage("horse.gif");
		this.name = name; //말이름을 보관할려고 만들어둠
	};
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);      //캔버스의 길이를 내놔라
//		g.drawImage(img,0,0,this.getSize().width, this.getSize().height,this);
		g.drawLine(pos,getSize().height/2,getSize().width,getSize().height/2);
		g.drawImage(img, pos, 0,100, this.getSize().height, this);
	};

	@Override
	public void run() {
		for(int i=0; i<600; i+=((int)(Math.random()*10)+1)) {
			pos = i;
			repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			
		};//for
		rank++;
		System.out.println(rank +"등 도착한 말 :"+ name);
		//System.out.println(rank + "등 도착한 말 : " + name);
		
	};

};