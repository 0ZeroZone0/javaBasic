package swing;

import java.awt.Container;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MsPaint extends JFrame implements ActionListener{
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox<String> combo;
	private JButton draw;
	private JPanel northP = new JPanel();
	private JPanel southP = new JPanel();
	private DrCanvas can;
	private List<ShapeDTO>list;
	private Point first_point, last_point;

	
	public MsPaint() {
		
		//JLabel 생성
		x1L = new JLabel("x1");
		y1L = new JLabel("y1");
		x2L = new JLabel("x2");
		y2L = new JLabel("y2");
		z1L = new JLabel("z1");
		z2L = new JLabel("z2");
		
		//JTextField 생성
		x1T = new JTextField("0",5);
		y1T = new JTextField("0",5);
		x2T = new JTextField("0",5);
		y2T = new JTextField("0",5);
		z1T = new JTextField("50",5);
		z2T = new JTextField("50",5);
		
		fill = new JCheckBox("채우기");
		
		
		//JRadioButton 생성
		line = new JRadioButton("선");
		circle = new JRadioButton("원");
		rect = new JRadioButton("사각형",true);
		roundRect = new JRadioButton("둥근사각형");
		pen = new JRadioButton("연필");			
		
		//버튼을 묶어줘야지 레디오버튼을 체크할때 한개씩만 체크할수있다
		ButtonGroup group = new ButtonGroup(); 
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		group.add(pen);
		
		String[] name = {"빨강","초록","파랑","민트","보라"};
		combo = new JComboBox<String>(name);
		
		draw = new JButton("그리기");
		
		can  = new DrCanvas(this);
		
		list = new ArrayList<ShapeDTO>();
		
		//리스트 생성		

		first_point = new Point();
		last_point = new Point();

		//추가
		northP.add(x1L);
		northP.add(x1T);
		northP.add(y1L);
		northP.add(y1T);
		northP.add(x2L);
		northP.add(x2T);
		northP.add(y2L);
		northP.add(y2T);
		northP.add(z1L);
		northP.add(z1T);
		northP.add(z2L);
		northP.add(z2T);
		//-----------------
		northP.add(fill);
		//-----------------
		southP.add(line);
		southP.add(circle);
		southP.add(rect);
		southP.add(roundRect);
		southP.add(pen);
		//-----------------
		southP.add(combo);
		southP.add(draw);
		//-----------------
		//왠만하면 쓰는게 좋음. 없어도 되긴하는데 JFrame에는 컨테이너 영역이있어서 써주는게좋음!
		Container c = this.getContentPane();
		
		
		c.add("North",northP);
		c.add("Center",can);
		c.add("South",southP); 
		
		setTitle("미니 그림판");
		setVisible(true);
		setBounds(900,200,700,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		draw.addActionListener(this);
//		combo.addActionListener(this); //같이 색이 변한다..

//----------------------------------------------------------------------------------		
							//추상클래스 , 추상메소드 x  익명inner
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {// 꾹 누른상태가 시작좌표가 된다.
				//눌러진 곳의 좌표값 보여주기.
				x1T.setText(Integer.toString(e.getX()));
				y1T.setText(Integer.toString(e.getY()));
				
				first_point = e.getPoint();
				
//				dto.setX1(Integer.parseInt(x1T.getText()));
//				dto.setY1(Integer.parseInt(y1T.getText()));

				
			};
		});
	
		can.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {//도형이 완성됐을때
				
				//shapeDTO생성
				ShapeDTO dto = new ShapeDTO();
				//좌표6개
				dto.setX1(Integer.parseInt(x1T.getText()));
				dto.setY1(Integer.parseInt(y1T.getText()));
				dto.setX2(Integer.parseInt(x2T.getText()));
				dto.setY2(Integer.parseInt(y2T.getText()));
				dto.setZ1(Integer.parseInt(z1T.getText()));
				dto.setZ2(Integer.parseInt(z2T.getText()));
				
				//채우기
				dto.setFill(fill.isSelected());
				
				//색
				dto.setColor(combo.getSelectedIndex());
				
				//도형
				if(line.isSelected()) dto.setShape(Shape.LINE);
				else if(circle.isSelected()) dto.setShape(Shape.CIRCLE);
				else if(rect.isSelected()) dto.setShape(Shape.RECT);
				else if(roundRect.isSelected()) dto.setShape(Shape.ROUNDRECT);
				else if(pen.isSelected()) dto.setShape(Shape.PEN);
				
				//ArrayList추가
				list.add(dto);
//				System.out.println(list);//나오는지 확인 출력
		};
	});
//----------------------------------------------------------------------------------			
		//getPoint() = 마우스 이벤트가 발생한 좌표를 얻어온다.
		
		can.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				
				last_point = e.getPoint();
		
				can.repaint();
			};
		});
		

	};//MsPaint()
	
//---------------------------------------getter
	
	public JTextField getX1T() {
		return x1T;
	};
	public JTextField getY1T() {
		return y1T;
	};
	public JTextField getX2T() {
		return x2T;
	};
	public JTextField getY2T() {
		return y2T;
	};
	public JTextField getZ1T() {
		return z1T;
	};
	public JTextField getZ2T() {
		return z2T;
	};
	public JCheckBox getFill() {
		return fill;
	};
	public JComboBox<String> getCombo() {
		return combo;
	};
	public JRadioButton getLine() {
		return line;
	};
	public JRadioButton getCircle() {
		return circle;
	};
	public JRadioButton getRect() {
		return rect;
	};
	public JRadioButton getRoundRect() {
		return roundRect;
	};
	public JRadioButton getPen() {
		return pen;
	};
	public Point getFirst_point() {
		return first_point;
	};
	public Point getLast_point() {
		return last_point;
	};
	public List<ShapeDTO> getList() {
		return list;
	};

	
//--------------------------------------------------Override
	@Override
	public void actionPerformed(ActionEvent e) {
		can.repaint();
	};

	
//---------------------------------------main
	public static void main(String[] args) {
		new MsPaint();
	};


};