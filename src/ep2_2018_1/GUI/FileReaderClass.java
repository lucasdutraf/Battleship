package ep2_2018_1.GUI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class FileReaderClass {
	
		
	public GameCanvas gamecanvas = new GameCanvas();
	
	private int LinesAlreadyRead = 1;
	
	private int A = 0;
	
	private int L = 0;
	
	private int fishesInTheLake[] = new int [5];
		
	private String Path;
	
	public String getPath() {
		return Path;
	}
	public void setPath(String Path) {
		this.Path = Path;
	}
	
	public FileReaderClass() {
		//readFile();
	}
	public void readFile(String Path) {
		try {
			
			FileReader fr = new FileReader(Path);
			BufferedReader bufferreader = new BufferedReader(fr);
			
			int aux_b = 0;
			int i = 0;
			
			String line = bufferreader.readLine();
			LinesAlreadyRead++;
			
			while(line != null) {
				
				if(LinesAlreadyRead == 2) {
					
					String[] sizeArray = line.split(" ");
					this.L = Integer.parseInt(sizeArray[0]);
					this.A = Integer.parseInt(sizeArray[1]);
					
					gamecanvas.setWidth(this.L);
					gamecanvas.setHeight(this.A);
					
				}
				
				if(LinesAlreadyRead >= 5 && LinesAlreadyRead < 5 + this.A) {
					
					char[] ValuesMatrix = line.toCharArray();
					
					for(int aux = 0; aux < ValuesMatrix.length; aux++) {
						gamecanvas.setMatrix(Integer.parseInt(String.valueOf(ValuesMatrix[aux])));
						gamecanvas.setCanvasMatrixBuilder(aux, aux_b, gamecanvas.getMatrix());
					}
					aux_b++;
				}
				if (LinesAlreadyRead >= this.A + 7) {
					String fishes[] = line.split(" ");
					this.fishesInTheLake[i] = Integer.parseInt(fishes[1]);
					i++;
					
				}
				line = bufferreader.readLine();
				LinesAlreadyRead++;	
	
			}
			
			bufferreader.close();
					
		}
		catch (IOException e) {
			System.out.println("SOMETHING WENT WRONG");
		}
				
	}
}


	


