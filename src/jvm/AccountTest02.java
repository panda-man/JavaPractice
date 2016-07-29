package jvm;

import org.junit.Test;

public class AccountTest02 {
	@Test(expected=IllegalArgumentException.class)
	public void testDeniesNegativeBalanceSet(){
		Account02 a = new AccountTest02();
		a.setBlance(-100);
	}
}
