package banking;

import java.util.Scanner;

/*
Represents a bank for managing a customers  and their bank account @ author Md Dsatageer Ahemad 
 */
public class Bank {

	public static void main(String[] args) {

		/* creates instance of a class */
		Bank bank = new Bank();

		/* call run method in the bank class */
		bank.run();

	}

	/*
	 * runs the program by initializing and managing bank accounts and customers
	 */
	public void run() {

		System.out.println("program running");

		System.out.println(" welcome to the bank ! what is yuor name");

		// create scanner to take user input
		Scanner scanner = new Scanner(System.in);

		// get the token which is customers name

		String name = scanner.next();

		System.out.println(" Hello " + name + " ! we are creating checking and saving account for you");

		// create customer with given name
		Customer customer = new Customer(name);

		// get address
		System.out.println(" what is your address?");

		// get the next token which is customers address.
		String address = scanner.next();

		// set the customers address
		customer.setAddress(address);

		// create checking account for customer
		BankAccount checkingAccount = new BankAccount("checkin ", customer);

		// create a saving account for customer
		BankAccount savingAccount = new BankAccount("saving ", customer);

		// gets and print the customer info associated with the checking account
		System.out.println();
		System.out.println("customer info :");
		System.out.println(checkingAccount.getCustomerInfo());

		/*
		 * get and print account info for checking account
		 * 
		 */
		System.out.println("checking account");
		System.out.println(checkingAccount.getAccountInfo());

		System.out.println();

		System.out.println("saving account");
		System.out.println(savingAccount.getAccountInfo());

		// deposits

		System.out.println("want to deposire the aamount");
		// String deposit = scanner.next();

		// into checking account
		System.out.println();
		System.out.println("Amount  (decimal) to deposits into your checking account");
		double amount = scanner.nextDouble(); // get next token double
		checkingAccount.deposite(amount); // deposit into checking account

		// into savings account
		System.out.println();
		System.out.println("Amount  (decimal) to deposits into your savings  account");
		amount = scanner.nextDouble(); // get next token double
		savingAccount.deposite(amount); // deposit into savings account

		// print new balance
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());

		// withdrwals

		// from checking account
		System.out.println();
		System.out.println("Amount  (decimal) to withdrwal from your cheking  account");
		amount = scanner.nextDouble(); // get next token double

		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {

			// print custom error message from withdraw method
			System.out.println(e.getMessage());
		}

		// withdraw from saving accounyt
		System.out.println();
		System.out.println("Amount  (decimal) to withdrwal from your cheking  account");
		amount = scanner.nextDouble(); // get next token double

		try {
			savingAccount.withdraw(amount);
		} catch (Exception e) {

			// print custom error message from withdraw method
			System.out.println(e.getMessage());
		}

		// print new balance
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());

		scanner.close();

	}

}
