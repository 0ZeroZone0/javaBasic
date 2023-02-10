package swing;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListTest extends JFrame{//JFrame = BorderLayout 동서남북이 기본이다
	
	public JListTest() {
		
	//부모생성자 불러~ //반드시 생성자안에서만 생성자를 부를수있다.	
	super("JList");
	setLayout(new FlowLayout());//옆으로 계속 붙는다
	
	String [] listData = {"Hong" , "Gil", "Dong" , "JAVA" , "JSP"};
	JList<String> list1 = new JList<String>(listData);
	//JList 항목을 나열할때 많이 쓰인다.
	list1.setSelectedIndex(1);//선택되는거다
	
	//자바에서 관리를 해주는건 디폴트모델리스트다. 모델쪽으로 들어가야한다
	//model은 데이터를 넣다 뺐다 해주고 list는 보여주는애다
	//그래서 동시에 같이 움직여야하니까  //model은 매니저님같은거
	DefaultListModel<String>model = new DefaultListModel<String>();
	JList<String> list2 = new JList<String>(model);//model가지고 처리하겠다
	//데이터를 넣을때는
	model.addElement("사과");
	model.addElement("딸기");
	model.addElement("바나나");
	model.addElement("배");
	list2.setSelectedIndex(1);
	
	//모델이 아니라 데이터를 백터가 잡겠다
	Vector<String> vListData =new Vector<String>();
	JList<String> list3 = new JList<String>(vListData);//Vector로 처리하겠다
	JScrollPane scroll = new JScrollPane(list3);
	
	vListData.addElement("축구");//이거써도 되고 밑에 그냥 add 써도된다
	vListData.add("야구");
	vListData.add("농구");
	vListData.add("배구");
	vListData.add("테니스");
	vListData.add("수영");
	vListData.add("육상");
	vListData.add("태권도");
	vListData.add("유도");
	
	//﻿이 클래스는 생성자만 쓸수있따 JListTest()만쓸수있음//완벽한 1회용
	class Student {//로컬 내부 클래스(local inner class) 생성자안에서 살다가 여기서 죽는다
		String id;
		String name;
		String department;
		
		public Student(String id, String name, String department) {
			this.id=id;
			this.name=name;
			this.department=department;
		};

		@Override
		public String toString() {
			return name;
		};
		
	};//class Student

	Student s1 = new Student("100","이순신","전산과");
	Student s2 = new Student("200","윤해랑","기획실");
	Student s3 = new Student("300","한강","건축과");
	Student s4 = new Student("400","김해신","기획실");
	
//	JList<Student> list4 =new JList<Student>(model이 필요하다 model이 관리해야하니까)
	JList<Student> list4 =new JList<Student>(new DefaultListModel<Student>());
//	DefaultListModel<Student> model2 = new 를 하면안된다 새로 생성하면 안되니가
	DefaultListModel<Student> model2 = (DefaultListModel<Student>) list4.getModel();//자식 = (자식)부모
	model2.addElement(s1);
	model2.addElement(s2);
	model2.addElement(s3);
	model2.addElement(s4);
	
	add(list1);
	add(list2);
	add(scroll);
	add(list4);
	setBounds(900,200,400,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	};//JListTest()
	
	public static void main(String[] args) {
		new JListTest();
	};

};