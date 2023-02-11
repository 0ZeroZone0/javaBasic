package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableTest2 extends JFrame implements ActionListener {
	private JButton addBtn, delBtn;
	private DefaultTableModel model;
	private JTable table;
	private List<PersonDTO> list;

	
	public JTableTest2() {
		
		addBtn = new JButton("추가");
		delBtn = new JButton("삭제");
		
		//타이틀 제목
		Vector vector = new Vector<String>();
		vector.addElement("아이디");
		vector.addElement("이름");
		vector.add("비밀번호");
		vector.add("핸드폰");
		
		
									//제목하고 데이터가 들어갈 1개 행을 만들어줘
//		model = new DefaultTableModel(vector,0) {}; //익명inner 클래스까지 //테이블이라는 클래스안에 클래스가 또 생성
		model = new DefaultTableModel(vector,0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return column != 0 ?  true : false;
			};
		}; 
	
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		//데이터
		PersonDTO aa = new PersonDTO("conan","윤해랑","456","010-1234-5678");
		PersonDTO bb = new PersonDTO("ddochi","한강","789","010-9876-5432");
		
//		list = new List<PersonDTO>(); List는 인터페이스라서 new가 안된다
		list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		
		//테이블은 Vector밖에 안된다 ArrayList도 안뜬다
		//테이블 - 데이터
		for(PersonDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getPhone());
		
			model.addRow(v); // 한줄씩 붙여라
		}//for
		
		
		JPanel southP =new JPanel();
		southP.add(addBtn);
		southP.add(delBtn);
		
		Container c = this.getContentPane();
		c.add("Center",scroll);
		c.add("South",southP);
		
		setTitle("JTableTest2");
		setBounds(900,200,850,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 이벤트
		addBtn.addActionListener(this);
		delBtn.addActionListener(this);
		
	};//JTableTest2()
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addBtn) insert();
		else if(e.getSource()==delBtn) delete();
	};
	
	private void insert() {
								//독립적으로 뜨게
		String id = JOptionPane.showInputDialog(null,"아이디를 입력하세요");
		////아이디를 만들때 취소를 누를때
		if(id==null) return;
		
		//글씨를 안넣고 ok를 누를때
		if(id.length()==0) {
			JOptionPane.showMessageDialog(this,"아이디는 필수 항목입니다");
			return;
		};
		
		//중복체크 - 있다면 사용 중인 아이디입니다.
		for (int i = 0; i < model.getRowCount(); i++) {
			if (id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this, "사용 중인 아이디입니다.");
				return;
			};
		};
		
		String name = JOptionPane.showInputDialog(this,"이름을 입력하세요");
		String pwd = JOptionPane.showInputDialog(this,"비밀번호를 입력하세요");
		String phone = JOptionPane.showInputDialog(this,"핸드폰을 입력하세요");
		
		Vector<String> v = new 	Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(phone);
		
		JOptionPane.showMessageDialog(this,"등록 완료");
		model.addRow(v);
	};
	
	private void delete() {
//		1.이름을 입력받는다.
//		2.삭제 할 이름이 없으면 "삭제할 이름이 없습니다" 그리고 나가기
//		3.삭제 할 이름이 있다면 (중복되는 모든 이름을 모두 삭제)  - "삭제 완료"
		
		String name = JOptionPane.showInputDialog(null,"이름을 입력하세요");
		//취소를 눌렀을때
		if(name==null) return;
		
		int count=0;
		for (int i = 0; i < model.getRowCount(); i++) { //거꾸로 지워도된다.
			if (name.equals(model.getValueAt(i, 1))) {
				model.removeRow(i);
				i--;//삭제되면 인덱스가 하나씩 땡겨지니까 -1씩 해줘야한다.
				count++;
			};//if
		};//for
		
		if(count==0) JOptionPane.showMessageDialog(this, "삭제할 이름이 없습니다");
		else JOptionPane.showMessageDialog(this, count+"명이 탈퇴했습니다");
	};


	public static void main(String[] args) {
		new JTableTest2();
	}


};