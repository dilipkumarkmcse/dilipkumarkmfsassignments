package corejava;
class BankAccount{
	void deposit() {
		System.out.println("Deposit");
	}
	void withdraw() {
		System.out.println("withdraw");
	}
}
class SavingsAccount extends BankAccount{
	void withdraw() {
		System.out.println("Withdrawed");
	}
}
public class bank1 {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.deposit();
		s.withdraw();
	}
}