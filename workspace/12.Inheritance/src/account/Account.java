package account;

//final class : 상속 금지 
public class Account {
	String accountNo, owner; 
	int balance;
	
//	Account () {
//		System.out.println("Account 생성자");
//	}
	
	Account(String accountNo, String owner){
		this.accountNo = accountNo;
		this.owner = owner;
	}
	Account(String accountNo, String owner,int balance){
		this(accountNo,owner); 
		this.balance = balance;
	}
	
	//입금한다
	void deposit(int money) {
		balance += money;
	}
	
	//출금한다
	int withdraw(int money) throws Exception{
		if(balance < money ) throw new Exception("잔고부족으로 출금불가!");
		balance -= money;
		return money;
	}
}
