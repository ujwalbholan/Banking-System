package BankingSystem;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The name of the Account hoder :");
		String name  = scan.nextLine();
		
		System.out.println("Enter The initial balance :");
		double amount  = scan.nextDouble();
		
	    BankAccount account = new BankAccount(name, amount);
	    
	    boolean exit = false;
	    
	    while(!exit) {
	    	System.out.println("choose one action");
	    	System.out.println("1. Deposit");
	    	System.out.println("2. withdraw");
	    	System.out.println("3. check balance");
	    	System.out.println("4. exit");
            int choice = scan.nextInt();
            
            
			switch(choice) {
	    		case 1:
	    			System.out.println("Enter diposit amount : ");
	    			double dipositAmount = scan.nextDouble();
	    			account.dipositMoney(dipositAmount);
	    			break;
	    		case 2:
	    			System.out.println("Enter withdraw amount : ");
	    			double withdrawAmount = scan.nextDouble();
	    			account.withdrawMoney(withdrawAmount);
	    			break;
	    		case 3:
	    			account.checkBalance();
	    			break;
	    		case 4:
	    			exit = true;
	    			System.out.println("Exiting .... Goodbye!");
	    			break;
	    		 default:
	                System.out.println("Invalid choice. Try again.");
			}	
	    }

	    scan.close();
	}
}
