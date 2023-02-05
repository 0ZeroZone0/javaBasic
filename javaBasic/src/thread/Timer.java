package thread;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timer extends JFrame implements Runnable{
	private JLabel label;
	private JButton startBtn,stopBtn;
	private int count;
	private boolean startOf; //기본값false
	private boolean stopOf; //기본값false
	
	public Timer() {
			setLayout(null);
			
			label=new JLabel ("0", JLabel.CENTER);
			label.setFont(new Font("고딕체", Font.BOLD, 70));
			label.setForeground(Color.RED);
			startBtn = new JButton("시작");
			stopBtn = new JButton("멈춤");
			
			startBtn.setBounds(200, 50, 60, 30);
			stopBtn.setBounds(200, 100, 60, 30);
			label.setBounds(70,30,100,100);
			
			add(label);
			add(startBtn);
			add(stopBtn);
			
			setBounds(700,200,300,200);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
	
			
			//이벤트
			startBtn.addMouseListener(new MouseAdapter() {
				Thread t;
				
				@Override
				public void mouseClicked(MouseEvent e) {
					t = new Thread(Timer.this);//스레드 생성
					t.start();//스레드 시작
					
					startOf= true;
					stopOf = false;
				};
			});
			
			stopBtn.addMouseListener(new MouseAdapter() {
				Thread t;
				
				@Override
				public void mouseClicked(MouseEvent e) {
					t = new Thread(Timer.this);//스레드 생성
					t.start();//스레드 시작
					
					startOf= false;
					stopOf = true;
				};
			});
	
			
		};//ThreadOnOff()
	
	@Override
	public void run() {

	
		
		while (true) {
			count++;
			label.setText(count + "");

			// 조건이 맞아야 도니까 조건을 부정연산자로 쓴다
			if (!startOf) {
				startBtn.setEnabled(true); 
				stopBtn.setEnabled(false);
				break;
			
			}else {
				startBtn.setEnabled(false); 
				stopBtn.setEnabled(true);
			};

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			
			if (count >= 50)
				count = 0;

		}; // while
		
	};
	

	public static void main(String[] args) {
		new Timer();
	};


};