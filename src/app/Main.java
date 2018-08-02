package app;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		String me = "Jordan";
		AccountManager manager = AccountManager.getInstance();
		manager.addAccount(new Account(234323, me, "Harrison"));
		manager.addAccount(new Account(432524, "Assad", "Hussein"));
		manager.addAccount(new Account(657536, "Nelvin", "Jones"));
		manager.addAccount(new Account(874645, "Ifti", "KHAAAAAAAAN!"));
		manager.addAccount(new Account(777855, "Lewis", "Godfinch"));
		manager.addAccount(new Account(656448, me, "Harrison"));
		
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		String[] accounts = {manager.getAccount(5).toString(), manager.getAccount(4).toString(), manager.getAccount(3).toString(), manager.getAccount(2).toString(), manager.getAccount(1).toString(), manager.getAccount(0).toString(), manager.getAccountsJSON(), "" + manager.getAccountsByFirstName(me)};
		logger.log(Level.INFO, accounts[0]);
		logger.log(Level.INFO, accounts[1]);
		logger.log(Level.INFO, accounts[2]);
		logger.log(Level.INFO, accounts[3]);
		logger.log(Level.INFO, accounts[4]);
		logger.log(Level.INFO, accounts[5]);
		
		logger.log(Level.INFO, accounts[6]);
		logger.log(Level.INFO, accounts[7]);
	}

}
