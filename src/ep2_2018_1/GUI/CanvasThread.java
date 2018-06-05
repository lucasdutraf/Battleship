package ep2_2018_1.GUI;

public class CanvasThread extends Thread{
	
	private GameCanvas canvas;
	private boolean running = true;
	
	public CanvasThread(GameCanvas canvas) {
		this.canvas = canvas;
	}
	
	public void run(){
		while(running) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			canvas.paint(canvas.getGraphics());
		}
	}
}
