package io;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ScoreForm extends JFrame implements ActionListener{
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakT, nameT, korT, engT, mathT;
	private JButton inputBtn, printBtn, searchBtn, rankBtn, saveBtn, loadBtn;
	private DefaultTableModel model;
	private JTable table;
	private Score score;
	
	public ScoreForm() {
		
		//JLabel 생성
		hakL = new JLabel("학번");
		nameL = new JLabel("이름");
		korL = new JLabel("국어");
		engL = new JLabel("영어");
		mathL = new JLabel("수학");
		
		//JTextField 생성
		hakT = new JTextField("",15);
		nameT = new JTextField("",15);
		korT = new JTextField("",15);
		engT = new JTextField("",15);
		mathT = new JTextField("",15);
		
		//JButton 생성
		inputBtn = new JButton("입력");
		printBtn = new JButton("출력");
		searchBtn = new JButton("학번검색");
		rankBtn = new JButton("순위");
		saveBtn = new JButton("파일저장");
		loadBtn = new JButton("파일읽기");
		
		//타이틀 제목
		Vector<String> title = new Vector<String>();
		title.addElement("학번");
		title.addElement("이름");
		title.add("국어");
		title.add("영어");
		title.add("수학");
		title.add("총점");
		title.add("평균");
		
		model = new DefaultTableModel(title,0);
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		score = new ScoreImpl();
		
		JPanel leftP = new JPanel();
		leftP.setLayout(new GridLayout(5,2,-130,30)); //5개 2줄로
		
		leftP.add(hakL); 
		leftP.add(hakT); 
		
		leftP.add(nameL); 
		leftP.add(nameT); 
		
		leftP.add(korL);
		leftP.add(korT);
		
		leftP.add(engL); 
		leftP.add(engT); 
		
		leftP.add(mathL);
		leftP.add(mathT);
		
		
		JPanel buttonP = new JPanel();
		buttonP.setLayout(new GridLayout(1,6,5,5)); //5개 1줄로
		
		buttonP.add(inputBtn); buttonP.add(printBtn); buttonP.add(searchBtn);
		buttonP.add(rankBtn); buttonP.add(saveBtn); buttonP.add(loadBtn);
		
		
		Container c = this.getContentPane();
		
		c.add("West",leftP);
		c.add("Center",scroll);
		c.add("South",buttonP);
		

		
		setTitle("학번");
		setVisible(true);
		setBounds(900,200,600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트
		event();
		
	};
	
	
	 public void event() {
		 inputBtn.addActionListener(this);
		 printBtn.addActionListener(this);
		 searchBtn.addActionListener(this);
		 rankBtn.addActionListener(this);
		 saveBtn.addActionListener(this);
		 loadBtn.addActionListener(this);
	 };//event()


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inputBtn) {
			input();
			score.print(model);//데이터가 들어오면 바로바로 찍힌다
			
		}else if(e.getSource()==printBtn) {
			score.print(model);
			
		}else if(e.getSource()==searchBtn) {
			score.search(model);
			
		}else if(e.getSource()==rankBtn) {
			score.tot_desc();
			score.print(model);//비교된걸 다시 출력해줘~
			
		}else if(e.getSource()==saveBtn) {
			score.save();
			
		}else if(e.getSource()==loadBtn) {
			score.load();
			score.print(model); //부른걸 다시 출력해줘~
		};
		
	};//actionPerformed(ActionEvent e)


	private void input() {
		//유효성
		//데이터가 들어왔는지 안들어왔는지 
		
		String hak = hakT.getText();
		if(hak.length()==0) {
			JOptionPane.showMessageDialog(this, "학번을 입력하세요");
			return;
		};
		
		String name = nameT.getText();
		if(name.length()==0) { 
			JOptionPane.showMessageDialog(this, "이름을 입력하세요");
			return;
		};
		
		int kor = Integer.parseInt(korT.getText());
		int eng = Integer.parseInt(engT.getText());
		int math = Integer.parseInt(mathT.getText());
		int tot = kor+eng+math;
		double avg = tot/3.; 
		
		ScoreDTO dto = new ScoreDTO();
		dto.setHak(hak);
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);
		dto.setTot(tot);
		dto.setAvg(avg);
		
		score.input(dto);//ScoreImpl의 input()를 호출
		
		//입력 창 초기화
		hakT.setText("");
		nameT.setText("");
		korT.setText("");
		engT.setText("");
		mathT.setText("");
		
	};
};