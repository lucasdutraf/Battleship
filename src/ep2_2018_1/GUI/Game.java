package ep2_2018_1.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import javax.swing.JLabel;

public class Game extends JFrame{

	private JPanel contentPane;
	private GameCanvas canvas = new GameCanvas();
	CanvasThread updateScreenThread = new CanvasThread(canvas);


	public Game() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(GameCanvas.RECT_WIDTH * WidthInt, GameCanvas.RECT_HEIGHT * GameCanvas.HeightInt);
		getContentPane().add("Center", canvas);
		setLocationRelativeTo(null);
	
		
		updateScreenThread.start();
	
	
	
	}
}
