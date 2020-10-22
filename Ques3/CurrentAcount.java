
public class CurrentAcount extends Account {
	private int tradeLicenseNumber;
	private static final double MIN_BALANCE = 500.0;
	
	public CurrentAcount() {
		
	}
	
	public CurrentAcount(String Name, double Balance) {
		super(Name, Balance);
	}
	
	public void getBalance() {
		System.out.println(getAccountBalance());
	}

	public void withDraw(double amount) {
		if((getAccountBalance() - amount) >= MIN_BALANCE ) {
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}
}
