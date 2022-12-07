package account;

public class AccountMain {
	public static void main(String[] args) {
		CheckCardAccount park
		= new CheckCardAccount("999-55-3333", "박문수", "6666-7894-4561-1245");


		park.deposit(100000);
		try {
		int cost = park.pay(50000);
			System.out.println(park.owner + "의 통장----");
			paidDisplay(cost,park);
			System.out.println("통장잔액: "+ park.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
		int cost = park.pay(70000);
			paidDisplay(cost, park);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("=================");
		
		
		Account hong = new Account("111-22-3333 ", "홍길동");
		
		hong.deposit(50000);
		try {
		int out = hong.withdraw(20000);
		System.out.println("출금된 금액: " + out);
		System.out.println("통장잔액: " + hong.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());	
		}
	}	
	static void paidDisplay(int cost, CheckCardAccount who) {
		System.out.println(who.owner + "의 통장----");
		System.out.println("결제금액: "+ cost);
		System.out.println("통장잔액: "+ who.balance);
	}
		

}