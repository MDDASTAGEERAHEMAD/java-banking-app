package banking;

/* represents a checking/saving account for customers/*
 * 
 */
public class BankAccount {

	// Instance vars.
	/*
	 * type of account(checking/saving)
	 * 
	 */
	String accountType;

	/*
	 * balance for bank account
	 * 
	 */
	double balance;

	/*
	 * customer for this account
	 * 
	 */
	Customer customer;

	// constructor
	/*
	 * create a bank account of given type for given customer
	 * 
	 * @param accountType for bank account
	 * 
	 * @param customer for bank account
	 */
	public BankAccount(String accountType, Customer customer) {

		this.accountType = accountType;
		this.customer = customer;

	}

	// method
	/*
	 * Deposit the given amount
	 * 
	 * @param to add to balance
	 */
	public void deposite(double amount) {
		this.balance += amount;
	}

	/*
	 * withdraw the given amount from balance
	 * 
	 * @param amount to withdraw
	 * 
	 * @throws Exception if given amount is larger then available balance
	 */
	public void withdraw(double amount) throws Exception {

		if (amount > this.balance) {

			throw new Exception("ammount ia greater then available balance");
		}
		this.balance -= amount;
	}

	/*
	 * return accountType and balance for this bank account.
	 * 
	 * @return String with all the info
	 */
	public String getAccountInfo() {
		return this.accountType + " : " + this.balance;

	}
	
	public String getCustomerInfo(){
		return this.customer.getName() + " from " + this.customer.getAddress();	}

}
