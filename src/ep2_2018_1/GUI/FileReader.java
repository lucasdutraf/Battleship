package ep2_2018_1.GUI;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader implements Runnable{
	
	private String Path;
	
	public String getPath() {
		return Path;
	}
	public void setPath(String Path) {
		this.Path = Path;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Path path = Paths.get(getPath());
		try {
			byte[] map = Files.readAllBytes(path);
			String reading = new String(map);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
