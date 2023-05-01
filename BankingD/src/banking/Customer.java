package banking;

/* representing a customer of a bank
 * 
 */

public class Customer {
	// instance vars

	/*
	 * name of customer
	 * 
	 */
	String name;

	/*
	 * customer adders
	 * 
	 */
	String address;

	// constructor
	/*
	 * creat a customer with the giveb name
	 * 
	 */
	public Customer(String name) {
		// set instance var name to given name

		this.name = name;
	}

	// method
	/*
	 * Sets an address of customer to be given address @param address for
	 * customer
	 * 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/*
	 * Returns customers name @return retirn customer name
	 * 
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * returns customers address @return address of customer
	 * 
	 */
	public String getAddress() {
		return this.address;
	}

}
