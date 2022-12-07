package account;
public class Account {
 //1. 계좌번호(123-45-6789), 예금주, 잔고 필드 선언
	 String accountNo, owner;
	 int balance;
 
//3. 생성자 : 필드의 초기화 
	 Account(String accountNo, String owner){
		 this.accountNo = accountNo;
		 this.owner = owner;
	 } //
	 
	 Account(String accountNo, String owner,int balance) throws Exception{
		 //생성자 선언문에서 중복되는 생성자를 호출
//		 this.accountNo = accountNo;
//		 this.owner = owner;
		 this (accountNo, owner);
		 this.balance = balance;
		 if (balance<0) {
			 throw new Exception("통장 개설 불가!");
		 }
		 
	 } //
	
	 
	
 //2. 입금, 출금 동작 메소드 생성
	void deposit(int balance) {
		this.balance += balance;
	}
	int withdraw(int money) throws Exception{
		//잔액이 출금요청액보다 부족하면 오류 발생 ->exception
		if (balance < money) {
			throw new Exception("잔고부족으로 출금 불가!");
		}
		balance -= money;
		return money;
		/*
		if(balance >=money) {
		balance -=money;
		return money;
		}else {
			return 0;
		*/
		}
	} // class (Account)

 
