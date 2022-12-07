package ex05;

public class TransferThread extends Thread {
	SharedAccount shared;
	TransferThread(SharedAccount shared){
		this.shared = shared;
	}
		@Override
		public void run() {
			for(int i = 0; i<10; i++) {
				//홍길동 ->박문수 500000 이체
				
				shared.transfer(50000);
				/*
				 * try {
				
					synchronized(shared) {
					int money = shared.hong.output(50000);
					System.out.print("홍길동계좌에서 5만원 출금 -> ");					
					shared.park.addMoney(money);
					System.out.println("박문수계좌로 5만원 입금");
					}
					//출금에서부터 입금까지 처리부분을 임계 영역이라 한다. 
					//shared 영역 데이터를 사용하는 중에는 
					//다른 thread에게로 제어권이 넘어가지 못하도록
					//(다른 thread가 shared 데이터를 사용할 수 없도록)
					//접근을 제한해야만 한다  = 임계 영역의 동기화 (synchronized)
					//동기화 처리
					//: 동기화 블럭, 동기화메소드 
				} catch (Exception e) {
				} 
				*/
				
			}
		}
}
