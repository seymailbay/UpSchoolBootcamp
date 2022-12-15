
public class AccountTest {
	public static void main(String[] args) {
		AccountClient client1 = new AccountClient();
		AccountClient client2 = new AccountClient();
		client1.setID(12);
		client1.setPassword(1290);
		client2.setID(15);
		client2.setPassword(1234);

		client1.setBalance(150);
		client2.setBalance(1500);

		double tax = client1.Transfer(20, client2);
		System.out.println("Client1 transferred money to client2.After the transfer, client1 has: "
				+ client1.getBalance() + ", client2 has: " + client2.getBalance() + " >>>>>>>> " + "Client1 paid " + tax
				+ " for the transfer.");

		client1.Deposit(50);
		System.out.println("client1 balance: " + client1.getBalance());
		client2.Deposit(80);
		System.out.println("client2 balance: " + client2.getBalance());
		client1.Withdrawal(56);
		System.out.println("client1 balance: " + client1.getBalance());

	}

}
