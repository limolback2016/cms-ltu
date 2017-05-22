package unit_tests;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cms.DbConnection;
import cms.DbHandler;

public class DbHandlerTest {
	private static DbConnection dut;
	private static DbHandler dbHandler;
	
	protected static Logger logger = Logger.getLogger("MyTestingLog");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dbHandler = new DbHandler(true, logger);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	public void testCreatTask() {
		
		
		
	}

}
