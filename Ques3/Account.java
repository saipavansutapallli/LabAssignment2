import java.util.Random;

class Account{
	
	private String Name;
	private double Balance;
	Random random = new Random();
	private String accountNumber = "" + random.nextInt(10);
	
	public Account() {
		
	}
	
	public Account(String Name, double Balance) {
		this.Name = Name;
		this.Balance = Balance;
	}

	public double getAccountBalance() {
		return Balance;
	}

	public void setAccountBalance(double Balance) {
		this.Balance = Balance;
	}

	public void deposit(double amount) {
		setAccountBalance(getAccountBalance()+amount);
	}
	
	@Override
	public String toString() {
		return "Account [Name=" + Name + ", Balance=" + Balance + ", accountNumber="
				+ accountNumber + "]";
	}
}
