package banking;

import java.util.Scanner;

/*
 * Represents a bank for managing customer and their bank accounts
 */

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creates a new instance of Bank class
		Bank bank = new Bank();
		
		//calls the run method in the bank class
		bank.run();
		
		
		
	}
	/*
	 * Runs the program by initiliazing and managing bank accounts and customers
	 */
	
	public void run() {
		System.out.println("Welcome to the bank! what is your name");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		
		System.out.println("Hello " + name + "! We are creating checking and savings accounts for you ");
		
		//creates customer with given name
		Customer customer = new Customer(name);
		
		//get address
		System.out.println("What is your address?");
		String address = scanner.next();// this address is a local variable and belongs to the run() method, it exits only inside of run()
		
		//set the customer's address
		customer.setAddress(address);//:Call setAddress and pass the value of the local variable address into the method.”
		//You are sending the value, not the variable itself
		
		// create a checking account for customer
		
		BankAccount checkingAccount= new BankAccount("checking", customer);
		
		// create a checking account for customer
		BankAccount savingsAccount= new BankAccount("savings", customer);
		
		//get customer's info for the checking account
		System.out.println();
		System.out.println("Customer info: ");
		
		System.out.println(checkingAccount.getCustomerInfo());
		
		// get and print account info for checking account
		System.out.println("Checking account");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Saving account");
		System.out.println(savingsAccount.getAccountInfo());
		
		//deposits
		//into checking
		System.out.println();
		System.out.println("Amount (decimal) to deposit into checking");
		double amount =scanner.nextDouble();
		checkingAccount.deposit(amount);//deposit into checking
		
		
		//into savings
		System.out.println();
		System.out.println("Amount (decimal) to deposit into savings");
		amount =scanner.nextDouble();
		savingsAccount.deposit(amount);//deposit into savings
		
		//print new balances
		System.out.println();
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		//withdraw from checking
		
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from checking");
		amount =scanner.nextDouble();
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());//print customer's error message from withdraw
		}
		//withdraw from savings
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from savings");
		amount =scanner.nextDouble();
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());//print customer's error message from withdraw
		}
		
		System.out.println("New account balances:");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close();
	}
	
	

}
