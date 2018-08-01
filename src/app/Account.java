package app;

public class Account {
	
	private String firstName, lastName;
	private int accountNumber;

	public Account(int accountNumber, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}

	public Account(int id, String fullName) {
		this.accountNumber = id;
		String[] names = fullName.split(" ");
		this.firstName = names[0];
		this.lastName = names[1];
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	@Override
	public String toString() {
		return "id: " + this.getAccountNumber() + " Name: " + this.getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Account) {
			Account account = (Account) obj;
			return account.getName().equals(this.getName()) && account.getAccountNumber() == account.accountNumber;
		} else {
			return false;
		}
	}
}
