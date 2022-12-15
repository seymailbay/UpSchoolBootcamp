
public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double Deposit(double deposit) {
		return balance = balance + deposit;
	}

	public double Withdrawal(double withdrawal) {
		return balance = balance - withdrawal;
	}

	public double Transfer(double transfer, AccountClient client) {
		double transferPay = 0;
		client.setBalance(client.getBalance() + transfer);
		if (transfer < 100) {
			transferPay = 2;
		} else {
			transferPay = transfer * (2 / 100);
		}
		balance = balance - transfer - transferPay;
		return transferPay;
	}

}
