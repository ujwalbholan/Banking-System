package BankingSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BankAccount implements IbankAccount{

	private String accountHolder;
	private double balance;
	
	public BankAccount( String accountHolder , double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
		
		System.out.println("Account is creted for "+accountHolder +" with the initial balance of "+ balance );
	}
	
	@Override
	public void dipositMoney(double  amount) {
		
		if(amount > 0) {
		 balance = balance + amount;
		 System.out.println("Diposited amount is : " + amount);
		 checkBalance();
		 saveAccountDetails();
		}else {
			System.out.println("Please enter the amount greater then 0");
		}
		
	}

	@Override
	public void withdrawMoney(double amount) {
		if( amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("withdrawl amount is : " + amount);
			checkBalance();
			saveAccountDetails();
		}else {
			System.out.println("insuffent amount!");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("your balance is : " +balance);
	}

	@Override
	public void saveAccountDetails() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\ujwal/acount_detail.txt", true))) {
			writer.write("Account holder : "+accountHolder +" , balance is : "+balance);
			writer.newLine();
		}catch(Exception e) {
			System.out.println("An error occure while saving the account details");
		}
	}
}
