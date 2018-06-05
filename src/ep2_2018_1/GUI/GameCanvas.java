package ep2_2018_1.GUI;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon; 

public class GameCanvas extends Canvas{
	
	
	protected int WidthInt = 1000;
	
	protected int HeightInt = 1000;
	
	public static final int RECT_WIDTH = 80;
	
	public static final int RECT_HEIGHT = 80;
	
	public static final int MARGIN = 0;
	
	protected int Matrix = 0;
	
	protected int NumberOfSSFishes = 0;
	
	protected int NumberOfSFishes = 0;
	
	protected int NumberOfMFishes = 0;
	
	protected int NumberOfLFishes = 0;
	
	protected int NumberOfELFishes = 0;
	
	public static final String SSType = "Pititinga";

	public int getNumberOfSSFishes() {
		return NumberOfSSFishes;
	}
	public void setNumberOfSSFishes(int numberOfSSFishes) {
		this.NumberOfSSFishes = numberOfSSFishes;
	}
	public int getNumberOfSFishes() {
		return NumberOfSFishes;
	}
	public void setNumberOfSFishes(int numberOfSFishes) {
		this.NumberOfSFishes = numberOfSFishes;
	}
	public int getNumberOfMFishes() {
		return NumberOfMFishes;
	}
	public void setNumberOfMFishes(int numberOfMFishes) {
		this.NumberOfMFishes = numberOfMFishes;
	}
	public int getNumberOfLFishes() {
		return NumberOfLFishes;
	}
	public void setNumberOfLFishes(int numberOfLFishes) {
		this.NumberOfLFishes = numberOfLFishes;
	}
	public int getNumberOfELFishes() {
		return NumberOfELFishes;
	}
	public void setNumberOfELFishes(int numberOfELFishes) {
		this.NumberOfELFishes = numberOfELFishes;
	}
	public void setMatrix(int matrix) {
		this.Matrix = matrix;
	}

	public static final String SType = "Sardinha";
	
	public static final String MType = "Tucunaré";
	
	public static final String LType = "Cavala";
	
	public static final String SLType = "Surubim";
	
	private int animationCounter = 0;
	
	private int animationCounterDirection = 1;
	
	private int [][] CanvasMatrixBuilder = new int [WidthInt][HeightInt];
	
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
		
		if(animationCounterDirection == 0) {
			if(animationCounter < 6) {
				animationCounter++;
			}
			else {
				animationCounterDirection = 1;
			}
		}
		else {
			if(animationCounter > 0) {
				animationCounter--;
			}
			else {
				animationCounterDirection = 0;
			}
		}
		
		//Prepare an ImageIcon
		ImageIcon icon =  new ImageIcon("images/water_" + String.valueOf(animationCounter) + ".jpg");
		ImageIcon WrongShot =  new ImageIcon("images/wrongshot.jpg");
		ImageIcon RightShot =  new ImageIcon("images/rightshot.jpg");
		ImageIcon VerifyRightShot =  new ImageIcon("images/verifyrightshot.jpg");
		ImageIcon VerifyWrongShot =  new ImageIcon("images/verifywrongshot.jpg");
		// Prepare img obj to be used
		final Image standard = icon.getImage();
		final Image WrongS = WrongShot.getImage();
		final Image RightS = RightShot.getImage();
		final Image VerifiedRight = VerifyRightShot.getImage();
		final Image VerifiedWrong = VerifyWrongShot.getImage();
		
		for(int x = 0; x < this.WidthInt; x++) {
			for(int y = 0; y < this.HeightInt; y++) {
				g.drawImage(standard, x * RECT_WIDTH + MARGIN, y * RECT_HEIGHT+MARGIN, RECT_WIDTH, RECT_HEIGHT, null);
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
