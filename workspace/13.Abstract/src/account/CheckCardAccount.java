package account;

public class CheckCardAccount extends Account{
	//계좌번호, 예금주, 잔액, 카드번호
	String cardNo;
	
//	CheckCardAccount(){
//		super();
//		System.out.println("CheckCardAccount 생성자");
//	}
	
	CheckCardAccount(String accountNo, String owner, String cardNo){
//		this.accountNo = accountNo;
//		this.owner = owner;
		super(accountNo, owner);
		this.cardNo = cardNo;
	}
	CheckCardAccount(String accountNo, String owner, String cardNo, int balance){
		this(accountNo, owner, cardNo);
		this.balance = balance;
	}
	
	//입금한다
	//출금한다
	//지불한다
	int pay(int cost) throws Exception{
		//통장잔고보다 물품가격이 더 크면 결제불가
		if( balance < cost ) 
			throw new Exception("잔고부족으로 결제불가!");
		
		//통장에서 구입한 물품의 금액만큼 잔고가 감소한다		
		balance -= cost;
		return cost;
	}
}
