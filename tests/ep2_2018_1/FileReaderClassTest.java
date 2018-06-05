package ep2_2018_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ep2_2018_1.GUI.FileReaderClass;

class FileReaderClassTest {
	
	
	public String path;
	
	
	
	public FileReaderClass filerc;
	
	@BeforeEach
	public void beforeTests() {
		filerc = new FileReaderClass();
	}
	
	@Test
	public void testaReadFile() {
		//ação
		filerc.readFile(path);
		
		//verificação
		assertEquals(path, filerc.getPath());
	}
	

	@AfterEach
	void afterTests() {
		filerc = null;
	}

}
