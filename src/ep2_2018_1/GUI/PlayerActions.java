package ep2_2018_1.GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayerActions extends GameCanvas{
	
	
	
		public GameCanvas canvas = new GameCanvas();

		
	public void actions() {
		
		canvas.addMouseListener(new MouseListener() {

		public void mouseReleased(MouseEvent e) {
	        int x=e.getX();
	        int y=e.getY();
			
	        int x_pos = x/canvas.RECT_WIDTH;
	        int y_pos = y/canvas.RECT_HEIGHT;

	        canvas.setShot(x_pos, y_pos);
			
		}

		
		public void mouseClicked(MouseEvent e) {
		}

		
		public void mousePressed(MouseEvent e) {
		}

		
		public void mouseEntered(MouseEvent e) {
		}

		
		public void mouseExited(MouseEvent e) {
		}


		});
	}
	
	
	
	
	
	

}
