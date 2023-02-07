package io;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class TryNotepad extends JFrame implements ActionListener{
	private JTextArea area;
	private MenuPane menu;
	private File file;
	
	public TryNotepad() {
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		area.setFont(new Font("고딕체",Font.BOLD,20));
		//항상 스크롤이 떠있다
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		menu = new MenuPane();
		this.setJMenuBar(menu);//프레임안에 메뉴바속으로 데이터가 들어간다.
		
		add("Center",scroll);
		
		setTitle("간단 메모장");
		setBounds(300,100,700,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	};
	
	public void event() {
		//이벤트
		menu.getNewM().addActionListener(this);//끝내기 메뉴
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
		
	};
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menu.getNewM()) {
			area.setText("");
			
		}else if(e.getSource() == menu.getOpenM()) {
			openDialog();//열기 다이얼로그 (팝업창)
			fileRead();//파일 읽기
		
		}else if(e.getSource() == menu.getSaveM()) {
			saveDialog(); //저장
			fileWriter();//파일 쓰기
			
		}else if(e.getSource() == menu.getExitM()) {
			System.exit(0);
			
		}else if(e.getSource() == menu.getCutM()) {
			area.cut();
		
		}else if(e.getSource() == menu.getCopyM()) {
			area.copy();
			
		}else if(e.getSource() == menu.getPasteM()) {
			area.paste();
			
		};
		
	};//actionPerformed(ActionEvent e)


	private void openDialog() {
		JFileChooser chooser = new JFileChooser();
		int result =chooser.showOpenDialog(this);//내 프레임 위에 떠라!
//		chooser.showOpenDialog(null);//독립적으로 따로 떠라!
		if(result == JFileChooser.APPROVE_OPTION) {//내가파일을 선택하고 열기 누를때 동의한다
			file = chooser.getSelectedFile();
		};
		JOptionPane.showMessageDialog(this, file); //파일을 열때 파일위치 경로를 보여준다
	};
	
	private void fileRead() {
		area.setText("");//초기화. 다시부를때 안겹쳐지게 해주기.
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line=null;
			
		while((line = br.readLine()) != null){//한줄씩 읽는게 다끝날때 까지 반복하시오
//			area.setText(line);//setText는 덮어쓰기 효과가 있다.그래서 마지막 줄만 보인다
			area.append(line+"\n");//"\n"이거안하면 연달아서 붙어서 나오니까 해주자
			}//while
		
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		};
	};
	
	public void saveDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		if(result == 0) {
			file = chooser.getSelectedFile(); //선택한 파일경로를 저장
			JOptionPane.showMessageDialog(this, file);
		};
	};

	
	private void fileWriter() {
		try {
			PrintWriter pw = new PrintWriter (new FileWriter(file));
			
			String data = area.getText();
			
			pw.write(data);
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		};
	};




	public static void main(String[] args) {
		new TryNotepad().event();
	};

};