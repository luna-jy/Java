package account;

public class AccountMain {
	
	public static void main(String[] args) {
		int money;
		
		try {
		Account park = new Account("5555-66-4444","박문수");
		accountConfirm(park);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=======================");
		
//		Account hong=new Account();
//		hong.accountNo ="111-22-3333";
//		hong.owner ="홍길동";
		 Account hong = new Account("1111-22-3333", "홍길동");
		accountConfirm(hong);
		System.out.println("=======================");
		
		
//		Account sim=new Account();
//		sim.accountNo ="9999-88-7777";
//		sim.owner ="심청";
//		sim.balance = "50000";
		try {
		Account sim =new Account("9999-88-7777","심청", 50000);
		accountConfirm(sim);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
				
		System.out.println("=======================");
		
		//입금
		hong.deposit(20000); 
		accountConfirm(hong);
		System.out.println("=======================");
		
		hong.deposit(30000); 
		accountConfirm(hong);
		System.out.println("=======================");
		
		
		//출금 
		try { 
		money = hong.withdraw(10000);
		accountConfirm(hong);
		System.out.printf("내손에 %d \n", money);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=======================");
		
		try {
		money = hong.withdraw(50000);
		accountConfirm(hong);
		System.out.printf("내손에 %d \n", money);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=======================");
	}
	
//		//통장 개설
//		System.out.printf("예금주 :  %s \n" ,hong.owner );
//		System.out.printf("계좌번호 : %s \n",hong.accountNo);
//		System.out.printf("잔액 :%d ",hong.balance);
//		System.out.println();
//		System.out.println("=======================");
	
	//계속 통장 확인 할 거니까 통장 확인 메소드 생성 (Main() 바깥에)
	static void accountConfirm(Account who){
		System.out.printf("예금주 :  %s \n" ,who.owner );
		System.out.printf("계좌번호 : %s \n",who.accountNo);
		System.out.printf("잔액 :%d ",who.balance);
		System.out.println();
	
	}
}
