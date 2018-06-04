package ep2_2018_1.GUI;

import java.awt.Canvas;
import java.awt.Graphics; 

public class GameCanvas extends Canvas{
	
	
	protected int WidthInt;
	
	protected int HeightInt;
	
	protected int Matrix = 0;
	
	private int [][] CanvasMatrixHelper = new int [WidthInt][HeightInt];
	
	public void setWidth(int WidthInt) {
		this.WidthInt = WidthInt;
	}
	public int getWidth() {
		return WidthInt;
	}
	
	public void setHeight(int HeightInt) {
		this.HeightInt = HeightInt;
	}
	public int getHeight() {
		return HeightInt;
	}
	
	
	public void setCanvasMatrixHelper(int x_pos, int y_pos, int Matrix) {
		this.CanvasMatrixHelper[x_pos][y_pos] = Matrix;
	}
	
	public void paint(Graphics g) {
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
