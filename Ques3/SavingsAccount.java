class SavingsAccount extends Account{

	private final static double RATE = 6;
	private final static double MIN_BALANCE = 1000.0;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(String Name, double Balance) {
		super(Name, Balance);
	}
	
	public double getBalance() {
		double interest;
		if(getAccountBalance() >= MIN_BALANCE) {
			interest = getAccountBalance() * RATE;
		} else 
			interest = 0.0;
		return interest;
	}
	
	public void withDraw(double amount) {
		if((getAccountBalance() - amount) >= MIN_BALANCE ) {
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}
}