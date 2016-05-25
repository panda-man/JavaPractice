package jvm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {
	@Test public void instantiate(){
		Account a = new Account("ミナト", 300000);
		assertEquals("ミナト", a.owner);
		assertEquals(30000, a.balance);
	}
	
}
