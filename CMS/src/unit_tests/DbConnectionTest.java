package unit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cms.DbConnection;

public class DbConnectionTest extends TestBase {
	private static DbConnection dut;
	
	@Test
	public void testConnect() throws Exception {
		dut = new DbConnection(true, logger);
		assertNotNull(dut.connect());
	}

}
