package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clock extends JFrame {
	private JLabel time;
	
	public Clock() {
		
		
		time = new JLabel("Clock", JLabel.CENTER);
		
		add("Center", time);
		
		time.setFont(new Font("돋움체", Font.BOLD, 50));
		time.setForeground(Color.RED);	
		setBounds(700, 200, 400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
				Calendar cal = Calendar.getInstance();
				
				int hour = cal.get(Calendar.HOUR_OF_DAY); 
				int minute = cal.get(Calendar.MINUTE); 
				int second = cal.get(Calendar.SECOND);
				
				String str = String.format("%02d : %02d : %02d", hour,minute,second);
				time.setText(str);
				
//				repaint();
			
		}
	
	public static void main(String[] args) {
		new Clock();
	}

}