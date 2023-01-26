package nested;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JFrame -BorderLayout(동서남북) 1개의 컴포넌트만 올라간다.
public class RGBMain extends JFrame {
	private JButton redBtn,greenBtn,blueBtn;//현재 null값있으니까 생성해주기.
	private DrCanvas can;//선언만
	
	public RGBMain() {
		redBtn = new JButton("빨강");
		greenBtn = new JButton("녹색");
		blueBtn = new JButton("블루");
		
		can = new DrCanvas();
		
		JPanel northP = new JPanel();//FlowLayout -중앙
		northP.add(redBtn);
		northP.add(greenBtn);
		northP.add(blueBtn);
		
		add("North",northP);
		add("Center", can);
		
		setBounds(900,100,300,400);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//이벤트
		//ActionListener는 버튼에 의해 움직인다.
		redBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(Color.RED);
			}
		});
		greenBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(Color.GREEN);
			}
		});
		blueBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(Color.BLUE);
			}
		});
		
		
	};//RGBMain

	public class DrCanvas extends Canvas {
		public DrCanvas() {
			this.setBackground(new Color(255,200,255));
		};
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
		};
		
	};//class DrCanvas
	
	public static void main(String[] args) {
		new RGBMain();
	};


};