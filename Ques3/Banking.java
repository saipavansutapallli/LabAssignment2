
import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String Name = s.next();
		String accountType = s.next();
		double initialBalance = s.nextDouble();

		if (accountType.equalsIgnoreCase("current")) {

			CurrentAcount current = new CurrentAcount(Name, initialBalance);
			System.out.println("Current account created with the following details:");
			System.out.println(current.toString());

			while (true) {
				System.out.println("Enter 1 : deposit");
				System.out.println("Enter 2 : withdraw");
				System.out.println("Enter 3 : display balance");
				System.out.println("Enter 0 : exit the system");

				String knowBalance;
				int amountToBeDeposited;
				int amountToWithdraw;

				int num = s.nextInt();

				switch (num) {
				case 1:
					System.out.println("Do you want to display balance Yes/No");
					knowBalance = s.next();

					if (knowBalance.equalsIgnoreCase("yes")) {
						System.out.println("Current balance: ");
						current.getBalance();
						System.out.println("Enter amount to diposit");
						amountToBeDeposited = s.nextInt();
						current.deposit(amountToBeDeposited);
						System.out.println("New balance: ");
						current.getBalance();
					} else {
						System.out.println("Enter amount to diposit");
						amountToBeDeposited = s.nextInt();
						current.deposit(amountToBeDeposited);
					}
					break;

				case 2:
					System.out.println("Do you want to display balance Yes/No");
					knowBalance = s.next();

					if (knowBalance.equalsIgnoreCase("yes")) {
						System.out.println("Current balance: ");
						current.getBalance();
						System.out.println("Enter amount to withdraw");
						amountToWithdraw = s.nextInt();
						current.withDraw(amountToWithdraw);
						System.out.println("New balance: ");
						current.getBalance();
					} else {
						System.out.println("Enter amount to withdraw");
						amountToWithdraw = s.nextInt();
						current.withDraw(amountToWithdraw);
					}
					break;
				case 3:
					System.out.println(current.toString());
				default:
					break;
				}
				if (num == 0) {
					System.out.println("Exit!");
					break;
				} else if (num > 3 || num < 0) {
					System.out.println("Wrong choice! Enter value again!!");
				}
			}
		} else if (accountType.equalsIgnoreCase("savings")) {

			SavingsAccount saving = new SavingsAccount(Name, initialBalance);
			System.out.println("Savings account created with the following details:");
			System.out.println(saving.toString());

			while (true) {
				System.out.println("Here is the menu!!");

				System.out.println("Enter 1 to deposit");
				System.out.println("Enter 2 to withdraw");
				System.out.println("Enter 3 to display balance");
				System.out.println("Enter 0 to exit the system");

				String knowBalance;
				int amountToBeDeposited;
				int amountToWithdraw;

				int num = s.nextInt();

				switch (num) {
				case 1:
					System.out.println("Do you want to display balance Yes/No");
					knowBalance = s.next();

					if (knowBalance.equalsIgnoreCase("yes")) {
						System.out.println("Current balance: ");
						System.out.println(saving.getAccountBalance());
						System.out.println("Enter amount to diposit");
						amountToBeDeposited = s.nextInt();
						saving.deposit(amountToBeDeposited);
						System.out.println("New balance: ");
						System.out.println(saving.getAccountBalance());
					} else {
						System.out.println("Enter amount to diposit");
						amountToBeDeposited = s.nextInt();
						saving.deposit(amountToBeDeposited);
					}
					break;

				case 2:
					System.out.println("Do you want to display balance Yes/No");
					knowBalance = s.next();

					if (knowBalance.equalsIgnoreCase("yes")) {
						System.out.println("Current balance: ");
						System.out.println(saving.getAccountBalance());
						System.out.println("Enter amount to withdraw");
						amountToWithdraw = s.nextInt();
						saving.withDraw(amountToWithdraw);
						System.out.println("New balance: ");
						System.out.println(saving.getAccountBalance());
					} else {
						System.out.println("Enter amount to withdraw");
						amountToWithdraw = s.nextInt();
						saving.withDraw(amountToWithdraw);
					}
					break;
				case 3:
					System.out.println(saving.toString());
				default:
					break;
				}
				if (num == 0) {
					System.out.println("Exit!");
					break;
				} else if (num > 3 || num < 0) {
					System.out.println("Wrong choice!");
				}
			}

		}
	}
}
