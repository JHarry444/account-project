package app;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

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
	
	public Map<Long, Account> getAccounts() {
		return new HashMap<>(accounts);
	}
	
	public String getAccountsJSON() {
		return new Gson().toJson(getAccounts());
	}

	public int getAccountsByFirstName(String firstName) {
		int count = 0;
		for (Account account : accounts.values()) {
			if (account.getFirstName().equals(firstName))
				count++;
		}
		return count;
	}
}
