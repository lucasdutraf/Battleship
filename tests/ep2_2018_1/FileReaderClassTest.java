package ep2_2018_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ep2_2018_1.GUI.FileChooser;
import ep2_2018_1.GUI.FileReaderClass;

class FileReaderClassTest {
	
	
	public String path;
	public FileChooser filechooser;
	
	
	
	public FileReaderClass filerc;
	
	@BeforeEach
	public void beforeTests() {
		filerc = new FileReaderClass();
		filechooser = new FileChooser();
	}
	
	@Test
	public void testagetPath() {
		path = "path";
		
		assertEquals(filerc.getPath(), path);
	}
	
	@Test
	public void testasetPath() {
		filerc.setPath("path");
		
		assertEquals("path", filerc.getPath());
	}
	
	@Test
	public void testaReadFile() {
		//ação
		filerc.readFile(path);
		
		//verificação
		assertEquals(path, filechooser.getPathLoader());
	}
	

	@AfterEach
	void afterTests() {
		filerc = null;
	}

}
