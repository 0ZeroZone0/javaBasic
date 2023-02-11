package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel{//추상클래스라서 오버라이드
	String[] title = {"아이디","이름","비밀번호","핸드폰"};
	Object[][] data = {	{"hong","이순신","111","010-123-1234"},
						{"conan","윤해랑","456","010-987-4567"},
						{"ddochi","한강","789","010-654-7890"},
						{"frodo","김유신","951","010-951-0159"} };
	
	//밑에 전부다 콜백되고 있는거다. 하나도 안불렀는데 불러지는거가
	
	@Override
	public int getRowCount() {//테이블의 행의 수 [필수]
		return data.length;
	};

	@Override
	public int getColumnCount() {// 테이블의 열의 수 [필수]
		return title.length; //for문으로 data[i].length 구해줘도 된다
	};

	@Override					//몇번째줄 행 ,    몇번째칸 열       에서 꺼내와라
	public Object getValueAt(int rowIndex, int columnIndex) { //데이터 추출[필수]
		return data[rowIndex][columnIndex];
	};
	
	@Override
	public void setValueAt(Object ob, int rowIndex, int columnIndex) { //데이터 넣어주기
		data[rowIndex][columnIndex] = ob; //오브젝트라 어떤값이든 들어간다
	};
	
	@Override
	public String getColumnName(int column) { //타이틀변경
		return title[column];
	};

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) { //편집가능
		
//		return true; //다 수정해라
		return columnIndex !=0 ?  true : false;
			};
	
};

//-------------------------------------------------
public class JTableTest extends JFrame {
	public JTableTest() {
		JTableModel model = new JTableModel();
		JTable table = new JTable(model);//model갖고 처리해라
		JScrollPane scroll = new JScrollPane(table); //table안에 스크롤 붙여라
		
		add("Center",scroll);
		
		setBounds(900,200,400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	};//JTableTest()

	public static void main(String[] args) {
		new JTableTest();
		
	};

}