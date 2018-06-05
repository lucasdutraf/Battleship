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
	
	public static final String SSType = "Surubim";

	public static final String SType = "Surubim";
	
	public static final String MType = "Surubim";
	
	public static final String LType = "Cavala";
	
	public static final String SLType = "Surubim";
	
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
	
	public int getMatrix() {
		return this.Matrix;
	}
	
	public void setCanvasMatrixBuilder(int x_pos, int y_pos, int Matrix) {
		this.CanvasMatrixBuilder[x_pos][y_pos] = Matrix;
	}
	
	public int [][] getCanvasMatrix(){
		return CanvasMatrixBuilder;
	}
	
	public void paint(Graphics g) {
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
