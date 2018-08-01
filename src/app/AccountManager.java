package app;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {

	private static AccountManager instance = new AccountManager();

	private Map<Long, Account> accounts = new HashMap<>();
	private long id = 0;

	private AccountManager() {
	}

	public static AccountManager getInstance() {
		return instance;
	}

	public boolean addAccount(Account account) {
		accounts.put(id++, account);
		if (accounts.get(id - 1) == null) {
			return false;
		}
		return accounts.get(id - 1).equals(account);
	}

	public Account getAccount(long id) {
		return accounts.get(id);
	}
}
