package nested;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardMain {
	private JFrame frame; //별도로 따로만들어서 잡아도 된다.
	private CardLayout card;
	
	public CardMain() {
		frame = new JFrame(); //생성 //BorderLayout(동서남북)
		card = new CardLayout();
		
		Container c = frame.getContentPane();//프레임으로부터 컨텐트구역을 얻어와라
		c.setLayout(card);//frame을 card로 바꾼다.
		
		JPanel[] p = new JPanel[6];
		Color[] color = {new Color(255,0,0),
						new Color(236,102,2),
						new Color(255,255,0),
						new Color(0,255,0),
						new Color(0,0,255),
						new Color(255,0,255)};
		
		String[] title = {"빨강","주황","노랑","초록","파랑","보라"};
		
		for(int i=0; i<p.length; i++) {
			p[i] = new JPanel();
			p[i].setBackground(color[i]);
			
			c.add(p[i],title[i]);//같이들어가야지 같이 찍힌다.
		};//for i
		
		//각각 panel당 클릭 이벤트를  작성 MouseListener = MouseAdapter.
		for(int i =0; i<p.length; i++) {
			p[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
//					card.show(c,"파랑"); //원하는 타이틀을 가진걸 하나뽑는거고
					card.next(c); // 있는걸 순서대로 넘겨주는거
				};
			});
		};	
	
		
		frame.setBounds(900,100,200,200);
		frame.setVisible(true);  ///어뎁터는 추상이라 new가 안된다/추상클래스지만 추상메소드x
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame 으로 안해주면 error
		
		
//		frame.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		}); 
//		
	};
	public static void main(String[] args) {
		new CardMain(); 
	};

};