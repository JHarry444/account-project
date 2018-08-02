package app;

public class Main {
	
	public static void main(String[] args) {
		AccountManager manager = AccountManager.getInstance();
		manager.addAccount(new Account(234323, "Jordan", "Harrison"));
		manager.addAccount(new Account(432524, "Assad", "Hussein"));
		manager.addAccount(new Account(657536, "Nelvin", "Jones"));
		manager.addAccount(new Account(874645, "Ifti", "KHAAAAAAAAN!"));
		manager.addAccount(new Account(777855, "Lewis", "Godfinch"));
		manager.addAccount(new Account(656448, "Jordan", "Harrison"));
		
		System.out.println(manager.getAccount(5));
		System.out.println(manager.getAccount(4));
		System.out.println(manager.getAccount(3));
		System.out.println(manager.getAccount(2));
		System.out.println(manager.getAccount(1));
		System.out.println(manager.getAccount(0));
		
		System.out.println(manager.getAccountsJSON());
		System.out.println(manager.getAccountsByFirstName("Jordan"));
	}

}
