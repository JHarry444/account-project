package appTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import app.Account;
import app.AccountManager;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountManagerTest {
	
	private Account testAccount = new Account(999999, "Testy McTestface");

	@Test
	public void testAddAccount() {
		assertTrue("Acccount not added.", AccountManager.getInstance().addAccount(new Account(999999, "Testy McTestface")));
	}
	
	@Test
	public void testGetAccount() {
		assertEquals("Account not found.", testAccount, AccountManager.getInstance().getAccount(0));
	}

}
