package BankingSystem;

public interface IbankAccount {
	
	void dipositMoney(double amount);
	void withdrawMoney(double amount);
	void checkBalance();
	void saveAccountDetails();
	
}
