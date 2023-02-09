package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class DrCanvas extends Canvas {
	private MsPaint msPaint;
	
	public DrCanvas(MsPaint  msPaint) {
		this.msPaint = msPaint;
		setBackground(new Color(207,255,229));//민트색
	}
	
	@Override
		public void paint(Graphics g) {
			super.paint(g);
			//list안에 있는 기존에 있던 도형을 다시 그리기

			int x1, y1, x2, y2, z1, z2;
			
//			List<ShapeDTO> list =msPaint.getList();
		     for(ShapeDTO dto : msPaint.getList()){
		    	 
		    	 //좌표
		    	 x1 = dto.getX1();
		    	 y1 = dto.getY1();
		    	 x2 = dto.getX2();
		    	 y2 = dto.getY2();
		    	 z1 = dto.getZ1();
		    	 z2 = dto.getZ2();
		    	 
		    	 //색
		    	 switch(dto.getColor()) {
			    	 case 0 : g.setColor(Color.RED); break;
			    	 case 1 : g.setColor(Color.GREEN); break; 
			    	 case 2 : g.setColor(Color.BLUE); break;	 
			    	 case 3 : g.setColor(Color.CYAN); break;	 
			    	 case 4 : g.setColor(Color.MAGENTA); break;	
		    	 };
		    	 
		       //도형그리기
			    if(dto.isFill()) { //채워진 도형
		            if(dto.getShape()==Shape.LINE) g.drawLine(  dto.getX1(),
		            									dto.getY1(), 
		            									dto.getX2(), 
		            									dto.getY2());
		            else if(dto.getShape()==Shape.CIRCLE) {
		               g.fillOval( Math.min(dto.getX1(),dto.getX2()),
		                		   Math.min(dto.getY1(),dto.getY2()), 
		                		   Math.abs(dto.getX2()-dto.getX1()), 
		                		   Math.abs(dto.getY2()-dto.getY1()));
		             
		            }
		            else if(dto.getShape()==Shape.RECT) {
		               g.fillRect(  Math.min(dto.getX1(),dto.getX2()),
			                		Math.min(dto.getY1(),dto.getY2()), 
			                		Math.abs(dto.getX2()-dto.getX1()), 
			                		Math.abs(dto.getY2()-dto.getY1()));
		       
		            }
		            else if(dto.getShape()==Shape.ROUNDRECT) {
		               g.fillRoundRect( Math.min(dto.getX1(),dto.getX2()),
		            		   			Math.min(dto.getY1(),dto.getY2()), 
		            		   			Math.abs(dto.getX2()-dto.getX1()),
			                		   	Math.abs(dto.getY2()-dto.getY1()), dto.getZ1() , dto.getZ2());
		            
		            }
		               
		         }else { //비어있는 도형
		            if(dto.getShape()==Shape.LINE) g.drawLine(  dto.getX1(),
								                		dto.getY1(), 
								                		dto.getX2(), 
								                		dto.getY2());
		            
		            else if(dto.getShape()==Shape.CIRCLE) {
		               g.drawOval( Math.min(dto.getX1(),dto.getX2()),
		                		   Math.min(dto.getY1(),dto.getY2()), 
		                		   Math.abs(dto.getX2()-dto.getX1()), 
		                		   Math.abs(dto.getY2()-dto.getY1()));
		         
		               
		            }
		            else if(dto.getShape()==Shape.RECT) {
		               g.drawRect(  Math.min(dto.getX1(),dto.getX2()),
			                		Math.min(dto.getY1(),dto.getY2()), 
			                		Math.abs(dto.getX2()-dto.getX1()), 
			                		Math.abs(dto.getY2()-dto.getY1()));
		         
		            }
		            else if(dto.getShape()==Shape.ROUNDRECT) {
		               g.drawRoundRect( Math.min(dto.getX1(),dto.getX2()),
		               		   			Math.min(dto.getY1(),dto.getY2()), 
		               		   			Math.abs(dto.getX2()-dto.getX1()),
		               		   			Math.abs(dto.getY2()-dto.getY1()), dto.getZ1() , dto.getZ2());
		      
		            };
		         };//else 
		
				};//for

				//도형 그리기

			//ArrayList에 기존의 도형을 넣어서 list 안에 있는 기존의 도형들을 꺼내서 다시 그리기.
			//기존의 도형 (좌표6개 / 채우기 / 색 / 도형 다갖고있어야한다 총 9개 정보를) = ShapeDTO에 저장
			
			//새로운 도형 = ShapeDTO에 저장
			
			//좌표 
			//문자열에서 int형으로 바꿔주기.                          //왼쪽에있는 공백, 오른쪽에있는 공백을 다 제거해준다
			x1 = Integer.parseInt(msPaint.getX1T().getText().trim());
			y1 = Integer.parseInt(msPaint.getY1T().getText().trim());
			x2 = Integer.parseInt(msPaint.getX2T().getText().trim());
			y2 = Integer.parseInt(msPaint.getY2T().getText().trim());
			z1 = Integer.parseInt(msPaint.getZ1T().getText().trim());
			z2 = Integer.parseInt(msPaint.getZ2T().getText().trim());
			
			//채우기
			boolean fill = msPaint.getFill().isSelected();
			//Boolean isSelected() - 체크상태를 true 또는 false로 반환
				switch(msPaint.getCombo().getSelectedIndex()) { //인덱스로 얻겠다 0 ,1 ,2 ,3 ,4 순으로
			case 0 : g.setColor(Color.RED); break;
					//this.setForeground(~~~~~); //이건 화면을 갱신해서 색들어갈때마다 껌뻑껌뻑거림
			case 1 : g.setColor(Color.GREEN); break; 
			case 2 : g.setColor(Color.BLUE); break;	 
			case 3 : g.setColor(Color.CYAN); break;	 
			case 4 : g.setColor(Color.MAGENTA); break;	
			//색
//			switch(msPaint.getCombo().getSelectedItem()) {  // 빨강, 초록, 파랑, 민트, 보라
		 
	
			};
			
			//도형 그리기
			if(fill) { //채워진 도형
				if(msPaint.getLine().isSelected()) g.drawLine(x1, y1, x2, y2);
				else if(msPaint.getCircle().isSelected()) {
					g.fillOval(Math.min(x1,x2),Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			
				}
				else if(msPaint.getRect().isSelected()) {
					g.fillRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1),Math.abs(y2-y1));
				
				}
				else if(msPaint.getRoundRect().isSelected()) {
					g.fillRoundRect(Math.min(x1,x2), Math.min(y1,y2),Math.abs(x2-x1), Math.abs(y2-y1), z1 , z2);
				
				};
					
			}else { //비어있는 도형
				if(msPaint.getLine().isSelected())
					g.drawLine(x1, y1, x2, y2); //선은 빈것도 채운것도 같아서 똑같이
				else if(msPaint.getCircle().isSelected()) {
					g.drawOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			
					
				}
				else if(msPaint.getRect().isSelected()) {
					g.drawRect(Math.min(x1,x2), Math.min(y1,y2),Math.abs(x2-x1), Math.abs(y2-y1));
			
				}
				else if(msPaint.getRoundRect().isSelected()) {
					g.drawRoundRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1),Math.abs(y2-y1), z1 , z2);
		
				};
			};//else 
			
			//펜
			
			if(msPaint.getPen().isSelected()) g.drawLine(
					msPaint.getFirst_point().x,
					msPaint.getFirst_point().y,
					msPaint.getLast_point().x,
					msPaint.getLast_point().y);
			
			msPaint.getFirst_point().x =msPaint.getLast_point().x;
			msPaint.getFirst_point().y = msPaint.getLast_point().y;
			
			
		};//paint 

};