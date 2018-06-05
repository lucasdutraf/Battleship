package ep2_2018_1.GUI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;


public class FileReaderClass {
	
		
	public GameCanvas gamecanvas = new GameCanvas();
	
	private int LinesAlreadyRead = 0;
	
	private int height_helper = 0;
	
	private int width_helper = 0;
	
	private int matrix_helper = 0;
	
	private int fishesInTheLake[] = new int [10];
		
	private String Path;
	
	public String getPath() {
		return Path;
	}
	public void setPath(String Path) {
		this.Path = Path;
	}
	
	public FileReaderClass() {
	}

	public FileReaderClass(String Path) {
		this.Path = Path;
		readFile(Path);
	}

	
	public void readFile(String Path) {
		
		try {
			
			FileReader fr = new FileReader(Path);
			BufferedReader bufferreader = new BufferedReader(fr);
			
			String line;
			
			int aux_b = 0;
			int i = 0;
			bufferreader.readLine(); 
			LinesAlreadyRead++; // 2
			line = bufferreader.readLine();
		
			Scanner sysInput = new Scanner(line);
			width_helper = sysInput.nextInt();
			gamecanvas.setWidth(width_helper);
			height_helper = sysInput.nextInt();
			gamecanvas.setHeight(height_helper);
			LinesAlreadyRead++; // 3
			
			bufferreader.readLine();
			LinesAlreadyRead++; // 4
			bufferreader.readLine();
			LinesAlreadyRead++;// 5 +tamanho-1
			//try {
						
				while(line != null) {
					if(LinesAlreadyRead >= 5 && LinesAlreadyRead < 5 + this.height_helper) {
											
						char[] ValuesMatrix = line.toCharArray();
						
						for(int aux = 0; aux < ValuesMatrix.length; aux++) {
							this.matrix_helper = Integer.parseInt(String.valueOf(ValuesMatrix[aux]));
							gamecanvas.setCanvasMatrixBuilder(aux, aux_b, this.matrix_helper);
						}
						aux_b++;
					}
					
					if (LinesAlreadyRead >= this.height_helper + 7) {
						String fishes[] = line.split(" ");
						this.fishesInTheLake[i] = Integer.parseInt(fishes[1]);
						i++;
						
					}
					line = bufferreader.readLine();
					LinesAlreadyRead++;	
				}
			//}

			//catch(Exception e) {
				System.out.println("Ocorreu um erro durante o processamento de dados ;-; ");
			//}
			
			bufferreader.close();
					
		}
		catch (IOException e) {
			System.out.println("SOMETHING WENT WRONG");
		}
				
	}
}


	


