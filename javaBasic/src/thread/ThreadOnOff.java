package thread;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThreadOnOff extends JFrame implements Runnable{
	private JLabel label;
	private JButton btn;
	private int count;
	private boolean onoff; //기본값false
	
	public ThreadOnOff() {
		
		label=new JLabel ("0", JLabel.CENTER);
		label.setFont(new Font("고딕체", Font.BOLD, 70));
		label.setForeground(Color.RED);
		btn = new JButton("누르기");
		
		JPanel p = new JPanel (new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);
		
		add("Center" , label);
		add("South" , p);
		
		setBounds(700,200,300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//이벤트
							//추상메소드x,추상클래스 //익명inner클래스사용
		btn.addMouseListener(new MouseAdapter() {
			Thread t;
			
			@Override
			public void mousePressed(MouseEvent e) { //꾹 누를때
				t = new Thread(ThreadOnOff.this);//스레드 생성
				t.start();//스레드 시작
				
				onoff= true;
			};
			
			@Override
			public void mouseReleased(MouseEvent e) { //손을 뗏을때
				t = null;
				
				onoff=false;
			};
		});
		
	};//ThreadOnOff()
	
	@Override
	public void run() {
		while(true) {
			count++;
			label.setText(count+"");
			
			//조건이 맞아야 도니까 조건을 부정연산자로 쓴다
			if(!onoff) break;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(count>=50) count=0;	
			
		};//while
		
	};

	public static void main(String[] args) {
		new ThreadOnOff();
		
	};

};