package account;

public class MinusAccount extends Account {
	int minusLimit;
	MinusAccount(String accountNo, String owner,int minusLimit){
		super(accountNo,owner);
		this.minusLimit = 1000000;
	}
	MinusAccount(String accountNo, String owner, int balance, int minusLimit){
		super(accountNo,owner,balance);
		this.minusLimit = 1000000;
		
	}
	//출금한다 
	//super 메소드를 override된 상태
	//메소드 오버라이딩 주의  : 
	//시그니처(파라미터 개수, 데이터 타입), 리턴타입 이 모두 동일
	//접근 제어자는 super의 메소드의 접근 제어자와 같거나 더 넓어야 한다
	public int withdraw(int money ) throws Exception{
		if(balance + minusLimit< money )
			throw new Exception("잔고부족으로 출금불가!");
		balance -= money;
		return money;
	}
}
