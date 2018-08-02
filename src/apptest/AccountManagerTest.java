package apptest;

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
	private AccountManager manager = AccountManager.getInstance();

	@Test
	public void testAddAccount() {
		assertTrue("Acccount not added.", manager.addAccount(new Account(999999, "Testy McTestface")));
	}
	
	@Test
	public void testGetAccount() {
		assertEquals("Account not found.", testAccount, manager.getAccount(0));
	}
	
	@Test 
	public void testGetAccountByFirstName() {
		assertEquals("Account not found.", 1, manager.getAccountsByFirstName("Testy"));
	}
	
	@Test
	public void testGetAccounts() {
		assertEquals("Accounts not found.", manager.getAccount(0), testAccount);
	}
 
}
