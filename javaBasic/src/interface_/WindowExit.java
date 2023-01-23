package interface_;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExit implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		
	};

	@Override
	public void windowClosing(WindowEvent e) { //끌때
		System.exit(0); //프로그램 강제 종료
		
	};

	@Override
	public void windowClosed(WindowEvent e) { //사후처리
		
	};

	@Override
	public void windowIconified(WindowEvent e) { //내릴때
		
	};

	@Override
	public void windowDeiconified(WindowEvent e) {//다시살릴때
		
	};

	@Override
	public void windowActivated(WindowEvent e) {//창이활성화될때
		
	};

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	};
};