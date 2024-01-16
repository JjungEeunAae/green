package bank;

public class Main {
	public static void main(String[] args) {
		// 참조변수              인스턴스
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(100000);
		park.deposit(500000);
		
		yoon.withdraw(50000);
		park.withdraw(50000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
