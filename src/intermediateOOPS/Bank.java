package intermediateOOPS;

class BankAccount{
	
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
}

class SavingsAccount extends BankAccount{
	private double fixedDeposit;
	
	public SavingsAccount(String accountHolder, double balance, double fixedDeposit) {
		super(accountHolder, balance);
		this.fixedDeposit = fixedDeposit;
	}
	
	@Override
	public double getBalance() {
		return super.getBalance() + fixedDeposit;
	}
}

class CurrentAccount extends BankAccount{
	private double cashCredit;
	
	public CurrentAccount(String accountHolder, double balance, double cashCredit) {
		super(accountHolder, balance);
		this.cashCredit = cashCredit;
	}
	
	@Override
	public double getBalance() {
		return super.getBalance() + cashCredit;
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account1 = new SavingsAccount("Anil", 50000, 10000);
		BankAccount account2 = new SavingsAccount("Sunil", 250000, 7000);
		BankAccount account3 = new CurrentAccount("Naresh", 5000, 1000);
		BankAccount account4 = new CurrentAccount("Mahesh", 750000, 50000);
		
		System.out.println("Total ammount in " +account1.getAccountHolder()+ " Account : " + account1.getBalance());
		System.out.println("Total ammount in " +account2.getAccountHolder()+ " Account : " + account2.getBalance());
		System.out.println("Total ammount in " +account3.getAccountHolder()+ " Account : " + account3.getBalance());
		System.out.println("Total ammount in " +account4.getAccountHolder()+ " Account : " + account4.getBalance());
		
		double totalCash = account1.getBalance() + account2.getBalance() + account3.getBalance() + account4.getBalance();
		
		System.out.println("*************************");
		System.out.println("Total ammount in the bank: " + totalCash);
	}

}
