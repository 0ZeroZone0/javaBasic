package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame implements ActionListener {
	private JLabel dispL, inputL;
	private StringBuffer dispBuf, inputBuf; //버퍼는 안에있는값을 고칠수있다. 스트링은 누적되서 쓰면안된다...흑
	private String[] btnTitle = {	"C", "<-", 
									"7", "8", "9", "/", 
									"4", "5", "6", "*", 
									"1", "2", "3", "-",
									".", "0", "=","+" };
	private JButton[] btn = new JButton[btnTitle.length];
	
	private int op; //String으로 잡아도된다 //연산자
	private double result; //실수형도 계산해야하니까 //맨 처음에 입력된 값 / 중간결과
	
	private NumberFormat nf = new DecimalFormat("#.####");
//	private DecimalFormat df = new DecimalFormat("#.#####");

	public void init() {
		setLayout(null);
		// 버튼 번호 매칭
		for (int i = 0; i < btnTitle.length; i++) {
			btn[i] = new JButton(btnTitle[i]);
			btn[i].setFont(new Font("굴림", Font.BOLD, 20));
//				btn[i].addActionListener(this);  //이벤트처리
		} // for

		// 라벨
		dispL = new JLabel("",JLabel.RIGHT);
		inputL = new JLabel("0", JLabel.RIGHT);
		dispL.setFont(new Font("맑은고딕", Font.BOLD, 20));
		inputL.setFont(new Font("맑은고딕", Font.BOLD, 20));
		dispL.setOpaque(true);// 투명도
		dispL.setBackground(Color.GRAY);
		inputL.setOpaque(true);// 투명도
		inputL.setBackground(Color.GRAY);
		JPanel jp = new JPanel(new GridLayout(2, 1, 6, 5));
		jp.add(dispL);
		jp.add(inputL);
		jp.setBounds(7, 5, 270, 95);
		
		dispBuf =new StringBuffer();
		inputBuf =new StringBuffer();
		

		// 버튼 두개
		JPanel p1 = new JPanel(new GridLayout(1, 2, 6, 5));
		p1.add(btn[0]);
		p1.add(btn[1]);
		p1.setBounds(7, 105, 270, 45);
		// 아래 나머지 버튼
		JPanel p2 = new JPanel(new GridLayout(4, 4, 6, 5));
		for (int i = 2; i < btn.length; i++) {
			p2.add(btn[i]);
		}
		p2.setBounds(7, 155, 270, 200);
		add(jp);
		add(p1);// 판넬을 add(p);해야 뜨지
		add(p2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);// WindowListener안쓰고 한줄만써도 시스템이 꺼진다.
		setBounds(900, 200, 300, 400);
		setVisible(true);

		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(this);
		}
	}

	// ActionListener Override
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="1" ||
		   e.getActionCommand()=="2" ||	
		   e.getActionCommand()=="3" ||	
		   e.getActionCommand()=="4" ||	
		   e.getActionCommand()=="5" ||	
		   e.getActionCommand()=="6" ||	
		   e.getActionCommand()=="7" ||	
		   e.getActionCommand()=="8" ||	
		   e.getActionCommand()=="9" ||	
		   e.getActionCommand()=="0") {
			
			dispL.setText(dispBuf+""); //새로찍을때 초기화
			
			if(inputBuf.length()==1 && inputBuf.toString().equals("0")) {//1자리고 0일때
				inputBuf.delete(0,1);
			}//if
				
			inputBuf.append(e.getActionCommand());
			inputL.setText(inputBuf+"");
			System.out.println("inputBuf = " + inputBuf);
			
		}else if(e.getActionCommand()=="C") {
			dispBuf.delete(0,dispBuf.length());//클리어할때 모든내용이 지워진다.
			inputBuf.delete(0,inputBuf.length());
						
			dispL.setText("");
			inputL.setText("0");
			
			result = op = 0; //다시 0으로줘야지 다시계산한다.
			
		}else if(e.getActionCommand()=="<-") {
			inputBuf.delete(inputBuf.length()-1,inputBuf.length());
			if(inputBuf.length()==0) inputBuf.append("0");
			inputL.setText(inputBuf+"");
			
		}else if(e.getActionCommand()==".") {
			if(inputBuf.indexOf(".")== -1) { //.이없을때
				if(inputBuf.length()==0) inputBuf.append("0."); //아무것도없을때
				else inputBuf.append(".");//숫자있을때
			}
			inputL.setText(inputBuf+"");
			
		}else if(e.getActionCommand()=="+") {
			calc(); //계산
			op = '+';
			
			dispBuf.append(inputBuf+"+");//inputBuf와 +연산자와 같이 올라가라
			inputBuf.delete(0,inputBuf.length());//버퍼에 내용은 지우고
			
			dispL.setText(dispBuf+"");//라벨에는 디스플레이버퍼를 뿌리고
			inputL.setText(nf.format(result)); //인풋라벨에는 중간값결과 뿌리기
			
		}else if(e.getActionCommand()=="-") {
			calc();
			op = '-';
			
			dispBuf.append(inputBuf+"-");//inputBuf와 +연산자와 같이 올라가라
			inputBuf.delete(0,inputBuf.length());//버퍼에 내용은 지우고
			
			dispL.setText(dispBuf+"");//라벨에는 디스플레이버퍼를 뿌리고
			inputL.setText(nf.format(result)); //인풋라벨에는 중간값결과 뿌리기
			
		}else if(e.getActionCommand()=="*") {
			calc();			
			op = '*';
			
			dispBuf.append(inputBuf+"*");//inputBuf와 +연산자와 같이 올라가라
			inputBuf.delete(0,inputBuf.length());//버퍼에 내용은 지우고
			
			dispL.setText(dispBuf+"");//라벨에는 디스플레이버퍼를 뿌리고
			inputL.setText(nf.format(result)); //인풋라벨에는 중간값결과 뿌리기
			
		}else if(e.getActionCommand()=="/") {
			calc();			
			op = '/';
			
			dispBuf.append(inputBuf+"/");//inputBuf와 +연산자와 같이 올라가라
			inputBuf.delete(0,inputBuf.length());//버퍼에 내용은 지우고
			
			dispL.setText(dispBuf+"");//라벨에는 디스플레이버퍼를 뿌리고
			inputL.setText(nf.format(result)); //인풋라벨에는 중간값결과 뿌리기
			
		}else if(e.getActionCommand()=="=") {
			calc();		
			op = 0; //계산이 끝나니까
			
			dispBuf.append(inputBuf+"=");//inputBuf와 +연산자와 같이 올라가라
			
			dispL.setText(dispBuf+"");//라벨에는 디스플레이버퍼를 뿌리고
			inputL.setText(nf.format(result)); //인풋라벨에는 중간값결과 뿌리기
			
			inputBuf.delete(0,inputBuf.length());//아래버퍼에 내용은 지우고
			dispBuf.delete(0,dispBuf.length());//위버퍼에 내용은 지우고  //이제연산처리안하니까
			//순서중요
			
		}
		
	}//actionPerformed

	
	public void calc() {
		if(op==0) result = Double.parseDouble(inputBuf+""); //ex) 2+ 일때 result에 값이들어간다.
		else if (op=='+')result += Double.parseDouble(inputBuf+"");
		else if (op=='-')result -= Double.parseDouble(inputBuf+"");
		else if (op=='*')result *= Double.parseDouble(inputBuf+"");
		else if (op=='/')result /= Double.parseDouble(inputBuf+"");
		System.out.println("result = "+result); //결과 확인용
	};
	
	
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		ca.init();

	};

};