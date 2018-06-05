package ep2_2018_1.GUI;

import java.awt.Canvas;
import java.awt.Graphics; 

public class GameCanvas extends Canvas{
	
	
	protected static int WidthInt;
	
	protected static int HeightInt;
	
	protected int Matrix = 0;
	
	protected int NumberOfSSFishes = 0;
	
	protected int NumberOfSFishes = 0;
	
	protected int NumberOfMFishes = 0;
	
	protected int NumberOfLFishes = 0;
	
	protected int NumberOfSLFishes = 0;
	
	private int [][] CanvasMatrixBuilder = new int [WidthInt][HeightInt];
	
	public void setWidth(int WidthInt) {
		GameCanvas.WidthInt = WidthInt;
	}
	public int getWidth() {
		return WidthInt;
	}
	
	public void setHeight(int HeightInt) {
		GameCanvas.HeightInt = HeightInt;
	}
	public int getHeight() {
		return HeightInt;
	}
	
	
	public void setCanvasMatrixBuilder(int x_pos, int y_pos, int Matrix) {
		this.CanvasMatrixBuilder[x_pos][y_pos] = Matrix;
	}
	
	public void paint(Graphics g) {
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
