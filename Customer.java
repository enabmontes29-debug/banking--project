package banking;

/*
 * represents a customer of a bank
 */

public class Customer {
	
	//instance variables
	
	String name;//name of customer
	
	String address;//address of customer
	
	/*
	 * creates a customer with the given name
	 */
	//constructor = runs when object is created, runs once per object
	public Customer(String name) {// with the constructor I am telling java how to create a single customer
		// set the value of instance variable name to be the same as the given name	
	this.name= name;
	}
	
	//methods
	
	public void setAddress(String address) {
		
		//sets the address of customer to be given address
		this.address = address;
	}
	
	//returns customer name
	public String getName() {
		return this.name;
	}
	
	//returns customer address
	public String getAddress() {
		return this.address;
	}
	
	
	
	

}
