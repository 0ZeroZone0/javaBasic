package thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RunRace extends JFrame implements ActionListener {
	private JButton btn;
	private Racer[] racer; //말이 이제 한마리가 아니니까 배열로 바꿔준다.
	private int count;
	
	
	public RunRace(int count) {
		this.count = count;
		btn = new JButton("출발");
		racer = new Racer[count];//배열로생성
		
								//패널위에 캔버스
								//캔버스는 레이아웃이 없어서 이렇게 잡아줘야한다
		JPanel centerP = new JPanel(new GridLayout(count,1));
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<count; i++) {
			System.out.print("말 이름 입력 : ");
			racer[i] = new Racer(scan.next());//생성
			centerP.add(racer[i]);
		}//for
		
		 							//FlowLayout 이건 가운데정렬이라 오른쪽으로 바꿔버렸다
		JPanel southP = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		southP.add(btn);
		
		Container c = this.getContentPane();
		c.add("Center", centerP);
		c.add("South", southP);
		
		
		setBounds(700, 200, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		//이벤트처리
		btn.addActionListener(this);
		
	};
	
	//ActionListener Override
	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false); //버튼비활성화 시키기
		
		Thread[] t= new Thread[count];
		for(int i=0; i<count; i++) {
		t[i] = new Thread(racer[i]);//스레드생성
		t[i].setPriority((int)Math.random()*10+1); //우선순위 ... 비리같은거 ㅋㅋ
		t[i].start();//스레드시작
		};
	};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("말 마리 수 입력 :");
		int count =scan.nextInt();
		
		new RunRace(count);
	};


};