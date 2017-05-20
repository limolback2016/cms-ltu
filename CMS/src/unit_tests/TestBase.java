package unit_tests;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestBase {
	protected static Logger logger = Logger.getLogger("MyTestingLog");
	protected static FileHandler fh;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			fh = new FileHandler("my_test_log.log");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter(); 
			fh.setFormatter(formatter);
		} catch (Exception e) {
			
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		fh.close();
	}

}
