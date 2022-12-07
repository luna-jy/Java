package ex05;

public class BalanceThread extends Thread {
	SharedAccount shared;
	BalanceThread (SharedAccount shared){
		this.shared = shared;
	}
	@Override
	public void run() {
		
		// 두 통장의 잔고 합계를 출력
		for(int i=0; i<5; i++) {
			/*
			synchronized(shared){
			int balance 
			= shared.hong.balance + shared.park.balance;
			System.out.println("두 계좌잔고 합계: " + balance);
			}
			//동기화 처리 synchronized(shared)
			*/
			shared.balance();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
}
