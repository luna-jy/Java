package ex05;

public class ThreadMain {
	public static void main(String[] args) {
//		Account hong = new Account("홍길동", "1111-22-3333",1000000);
//		Account park = new Account(("홍길동", "1111-22-3333",1000000);
		
		SharedAccount shared = new SharedAccount();
		shared.hong = new Account ("홍길동", "1111-22-3333",1000000);
		shared.park = new Account ("박문수", "3333-44-3333",1500000);
		
		
		TransferThread transfer  = new TransferThread (shared);
		BalanceThread balance = new BalanceThread (shared);
		
		transfer.start();
		balance.start();
		System.out.println("MainThread 끝");
	}
}
