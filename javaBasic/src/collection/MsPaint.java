package collection;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MsPaint extends JFrame{
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox<String> combo;
	private JButton draw;
	private JPanel p = new JPanel();
	private JPanel p2 = new JPanel();
	private DrCanvas can;
	
	public MsPaint() {
		x1L = new JLabel("x1L");
		y1L = new JLabel("y1L");
		x2L = new JLabel("x2L");
		y2L = new JLabel("y2L");
		z1L = new JLabel("z1L");
		z2L = new JLabel("z2L");
		
		x1T = new JTextField("0",5);
		y1T = new JTextField("0",5);
		x2T = new JTextField("0",5);
		y2T = new JTextField("0",5);
		z1T = new JTextField("0",5);
		z2T = new JTextField("0",5);
		
		fill = new JCheckBox("채우기");
		line = new JRadioButton("선");
		circle = new JRadioButton("원");
		rect = new JRadioButton("사각형",true);
		roundRect = new JRadioButton("둥근사각형");
		pen = new JRadioButton("연필");			
		
		String[] name = {"빨강","초록","파랑","민트","보라"};
		combo = new JComboBox<String>(name);
		draw = new JButton("그리기");
		
		setTitle("미니 그림판");
		setVisible(true);
		setBounds(900,200,700,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		can  = new DrCanvas(this);

		//추가
		p.add(x1L);
		p.add(x1T);
		p.add(x2L);
		p.add(x2T);
		p.add(y1L);
		p.add(y1T);
		p.add(y2L);
		p.add(y2T);
		p.add(z1L);
		p.add(z1T);
		p.add(z2L);
		p.add(z2T);
		//-----------------
		p.add(fill);
		//-----------------
		p2.add(line);
		p2.add(circle);
		p2.add(rect);
		p2.add(roundRect);
		p2.add(pen);
		//-----------------
		p2.add(combo);
		p2.add(draw);
		//-----------------
		Container c = this.getContentPane();
		
		c.add("North",p);
		c.add("South",p2); 
		c.add("Center",can);

	};

	public static void main(String[] args) {
		new MsPaint();
	};

};