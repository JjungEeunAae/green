package bank;

public class BankAccount {
	int money = 0;
	
	// 입금
	public void deposit(int amount) {
		money += amount;
	}
	
	// 출금
	public void withdraw(int amount) {
		money -= amount;
	}
	
	// 잔액확인
	public void checkMyBalance() {
		System.out.println("현재 잔액은 " + money + "원 입니다.");
	};
}
