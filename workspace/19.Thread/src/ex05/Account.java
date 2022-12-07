package ex05;

public class Account {
	String accountNO, owner;
	int balance;
	
	Account(String accountNo, String owner, int balance) {
		this.accountNO = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	void addMoney (int money ) {
		balance += money;
	}
	int output(int money ) throws Exception{
		if(balance <money) 
			throw new Exception("잔고 부족으로 출금 불가");
		balance -= money;
		return money;
		
		
	}
	
}
