package interface_;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener, WindowListener  {	
	private JLabel idL,pwdL;
	private JTextField idT;
	private JPasswordField pwdT;
	private JButton loginBtn,resetBtn;
	
	
	public Login() {
		setLayout(null);
		
		idL = new JLabel("아이디");
		pwdL = new JLabel("비밀번호");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginBtn = new JButton("로그인");
		resetBtn = new JButton("다시작성");
		
		idL.setBounds(40,20,100,40);
		pwdL.setBounds(40,70,100,40);
	
		idT.setBounds(130,20,200,40);
		pwdT.setBounds(130,70,200,40);
		
		loginBtn.setBounds(70,130,90,50);
		resetBtn.setBounds(210,130,90,50);
		
		add(idL); add(idT);
		add(pwdL); add(pwdT);
		add(loginBtn); add(resetBtn);
		
		setTitle("로그인창");
		setBounds(900,200,400,250);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);
		resetBtn.addActionListener(this);
		loginBtn.addActionListener(this);
	};

	@Override
	public void windowOpened(WindowEvent e) {

		
	};

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	};

	@Override
	public void windowClosed(WindowEvent e) {

		
	};

	@Override
	public void windowIconified(WindowEvent e) {

		
	};

	@Override
	public void windowDeiconified(WindowEvent e) {
	
		
	};

	@Override
	public void windowActivated(WindowEvent e) {

		
	};

	@Override
	public void windowDeactivated(WindowEvent e) {

		
	};
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resetBtn) {
			idT.setText(""); 
			pwdT.setText("");
		}else if(e.getSource()==loginBtn) {
			String id = idT.getText();
			String pwd = pwdT.getText();

			new LoginResult(id, pwd);
		};
	};
	
	
	public static void main(String[] args) {
		new Login();
	};
};