package abstract_;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

class WindowTest extends Frame {
	public WindowTest() {
		setTitle("이미지");
		setBounds(900,100,500,500);
		setVisible(true);	
	};
	
	@Override
	public void paint(Graphics g) {
		//이미지 불러오기
		Toolkit t = Toolkit.getDefaultToolkit(); //항상 new만 생성되는건 아니다 이렇게 메소드로도 빈번하다
		Image img=t.getImage("car.png");
		
		//이미지를 크기를 작게  //원래사이 210 210
		g.drawImage(img,3,3, this); //(보관한곳,보여주기시작할 위치,어디다 그릴건지)
		
//		g.drawImage(img,			//이미지
//					30,50,230,250,  //시작할 x축좌표와 y축좌표,끝나는 x축좌표와 y축좌표
//					0,0,210,210,   //이미지 크기
//					this);
		
		//이미지를 거꾸로
//		g.drawImage(img,		    //이미지
//				30,50,230,250,      //시작할 x축좌표와 y축좌표,끝나는 x축좌표와 y축좌표
//				210,210,0,0,        //이미지 크기
//				this);
		
		//좌우 바꾸기
		g.drawImage(img,		    //이미지
				30,50,230,250,      //시작할 x축좌표와 y축좌표,끝나는 x축좌표와 y축좌표
				210,0,0,210,        //이미지 크기
				this);
		
	};
};
//---------------
public class WindowMain {

	public static void main(String[] args) {
		WindowTest wt =new WindowTest();

	};

};