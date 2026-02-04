package banking;

public class BankAccount {
	
	// instance variables
	
	//checking/savings
	String accountType;
	
	
	double balance;
	
	
	Customer customer;

	
	//constructor
	public BankAccount(String accountType, Customer customer) {
		
		this.accountType = accountType;
		this.customer = customer;
		
	}
	
	//methods
	
	public void deposit(double amount) {
		this.balance = balance + amount;	
	}
	
	/*
	 * withdraw the giveb amount from balance
	 * 
	 */
	
	public void withdraw(double amount) throws Exception {
		
		if(amount>this.balance) {
			throw new Exception("Amount is greater than available balance");
		}
		
		this.balance = balance- amount;
		
	}
	/*
	 * returns account type and balance for this bank account
	 */
	
	public String getAccountInfo() {
		return this.accountType + ":" + this.balance;
	}
	
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
		//we do this.customer.getName() because customer is a different object, and name belongs to the Customer Object, not to BankAccount
		//so we must ask Customer for its name, however "this" is the current BankAccount object
		// we can Not do getName because BankAccount does not have a name
		}
	
	
	
	
}
