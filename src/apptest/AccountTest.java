package apptest;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import app.Account;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountTest {
	
	private Account testAccount = new Account(1, "Two", "Three");
	
	@Test
	public void testGetAccountNumber() {
		assertEquals("Dodgy getter for account number.", 1, testAccount.getAccountNumber());
	}
	
	@Test
	public void testGetFirstName() {
		assertEquals("Dodgy getter for first name.", "Two", testAccount.getFirstName());
	}
	
	@Test
	public void testGetLastName() {
		assertEquals("Dodgy getter for last name.", "Three", testAccount.getLastName());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Incorrect return by getName.", "Two Three", testAccount.getName());
	}
	
	@Test
	public void testSetAccountNumber() {
		testAccount.setAccountNumber(2);
		assertEquals("Dodgy setter for account number", 2, testAccount.getAccountNumber());
	}
	
	@Test
	public void testSetFirstName() {
		testAccount.setFirstName("Four");
		assertEquals("Dodgy getter for first name.", "Four", testAccount.getFirstName());
	}
	
	@Test
	public void testSetLastName() {
		testAccount.setLastName("Five");
		assertEquals("Dodgy setter for last name.", "Five", testAccount.getLastName());
	}
}
