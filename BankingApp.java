package exception;

class InsufficientBalanceException extends Exception
//here we define a custom exception class name  InsufficientBalanceException.
{
	String msg;// declaring string variable.

	// constructor with parameters.
	public InsufficientBalanceException(String msg) {
		super();// calls the constructor of the super class.
		this.msg = msg;
	}
}

public class BankingApp {
	// declaring variables.
	int accountNo;
	int balance;

	// constructor with parameters,that initializes accountNo and balance
	public BankingApp(int accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// for depositing amount to the account.
	void deposit(int amt) {
		balance += amt;// adds the deposit amount to the balance
		System.out.println("Account no:" + accountNo);
		System.out.println("New Balance:" + balance);
	}

	// for withdrawing amount.
	void withDraw(int amt) throws InsufficientBalanceException {
		if (balance > amt) {// checks if balance is greater than withdrawal amount
			balance -= amt;
			System.out.println("Amount withdrawn successfully:" + amt + " \n New Balance:" + balance);
		} else
			throw new InsufficientBalanceException("Insufficient balance");
		// throws custom exception if balance is insufficient.

	}
	// main method to test the banking application

	public static void main(String[] args) throws InsufficientBalanceException {

		// object creation.
		BankingApp b = new BankingApp(1234567, 3000);
		b.deposit(1000);// deposits 1000 into the account
		try {
			b.withDraw(3000);// attempts to withdraw 3000 from the account

		} catch (InsufficientBalanceException e) {
			System.out.println(e);// catches and prints the InsufficientBalanceException

		}
	}
	
	}

