package account;

public class CheckCardAccount extends Account{
	String cardNo;
//	CheckCardAccount(){
//		super();
//		System.out.println("CheckCardAccount 생성자");
//	}
	
	CheckCardAccount(String accountNo, String owner, String cardNo){
//		 this.accountNo = accountNo;
//		 this.owner = owner;
		 super(accountNo, owner);
		 this.cardNo = cardNo;
	}
	CheckCardAccount(String accountNo, String owner, String cardNo,int balance){
//		 this.accountNo = accountNo;
//		 this.owner = owner;
		this(accountNo, owner, cardNo);
		this.balance = balance;
	}
	
	
	
	
	int pay(int cost)throws Exception{
		//통장잔고보다 물품의 가격이 더 크면 결제 불가
		if(balance< cost) throw new Exception("잔고부족으로 결제 불가");		
		
		//통장에서 구입한 물품의 금액만큼 잔고가 감소한다
		balance -= cost;
		
		//영수증(구입한 금액 적혀짐) 돌려받는다. 
		return cost;
	}
}
