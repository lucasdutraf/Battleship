package ep2_2018_1.GUI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class FileReader extends GameCanvas{
	
		
	private int LinesAlreadyRead = 1;
	
	private String line;
	
	private int  aux_b = 0;
	
	private String Path;
	
	public String getPath() {
		return Path;
	}
	public void setPath(String Path) {
		this.Path = Path;
	}
	
	public void convertStringToInt(int Type) throws IOException {
		String kindArray[] = line.split(" ");
		String kindString = kindArray[1];
		Type = Integer.parseInt(kindString);
	}
	
	public FileReader() {
		// TODO Auto-generated method stub
	}
	public void readFile() {
		try {
			
			GameCanvas gamecanvas = new GameCanvas();
			
			InputStream inputstream = new FileInputStream(getPath());
			InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
			BufferedReader bufferreader = new BufferedReader(inputstreamreader);
			
			line = bufferreader.readLine();
			LinesAlreadyRead++;
			
			while(line != null) {
				
				if(LinesAlreadyRead == 2) {
					
					String sizeArray[] = line.split(" ");
					String WidthString = sizeArray[0];
					String HeightString = sizeArray[1];
					WidthInt = Integer.parseInt(WidthString);
					HeightInt = Integer.parseInt(HeightString);
					
				}
				
				if(LinesAlreadyRead >= 5 && LinesAlreadyRead < 5 + HeightInt) {
					
					char[] ValuesMatrix = line.toCharArray();
					
					for(int aux = 0; aux < ValuesMatrix.length; aux++) {
						
						Matrix = Integer.parseInt(String.valueOf(ValuesMatrix[aux]));
						gamecanvas.setCanvasMatrixBuilder(aux, aux_b, Matrix);
					}
					aux_b++;
				}
				if(LinesAlreadyRead == 8 + HeightInt) {
					convertStringToInt(NumberOfSSFishes);
				}
				if(LinesAlreadyRead == 9 + HeightInt) {										
					convertStringToInt(NumberOfSFishes);
				}
				if(LinesAlreadyRead == 10 + HeightInt) {
					convertStringToInt(NumberOfMFishes);
				}
				if(LinesAlreadyRead == 11 + HeightInt) {
					convertStringToInt(NumberOfLFishes);
				}
				if(LinesAlreadyRead == 12 + HeightInt) {
					convertStringToInt(NumberOfSLFishes);
					System.out.println("passou aqui 1");
				}
				
				line = bufferreader.readLine();
				LinesAlreadyRead++;	
	
			}
					
		}
		catch (IOException e) {
				e.printStackTrace();
		}
				
	}
}


	


