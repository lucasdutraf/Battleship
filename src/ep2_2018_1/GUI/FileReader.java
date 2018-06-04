package ep2_2018_1.GUI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class FileReader extends GameCanvas{
	
	
	private GamePlayerActions gameplayeractions;
	
	private int LinesAlreadyRead = 1;
	
	private String Path;
	
	public String getPath() {
		return Path;
	}
	public void setPath(String Path) {
		this.Path = Path;
	}
	
	public FileReader() {
		// TODO Auto-generated method stub
		try {
			
			InputStream inputstream = new FileInputStream(getPath());
			InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
			BufferedReader bufferreader = new BufferedReader(inputstreamreader);
			
			String line = bufferreader.readLine();
			LinesAlreadyRead++;
		
			while(line != null) {
				
				if(LinesAlreadyRead == 2) {
					
					String size = bufferreader.readLine();
					String sizeArray[] = size.split(" ");
					String WidthString = sizeArray[0];
					String HeightString = sizeArray[1];
					
					WidthInt = Integer.parseInt(sizeArray[0]);
					HeightInt = Integer.parseInt(sizeArray[1]);
					
				}
				
				if(LinesAlreadyRead >= 5 && LinesAlreadyRead < 5 + HeightInt) {
					
					char[] ValuesMatrix = line.toCharArray();
					
					for(int aux = 0; aux < ValuesMatrix.length; aux++) {
						
						Matrix = Integer.parseInt(String.valueOf(ValuesMatrix[aux]));
						
					}
					
					
					
					
				}
				
				
				LinesAlreadyRead++;	
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int getMatrix() {
		return this.Matrix;
	}
}

	


