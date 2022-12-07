package ex04;


public class PIThread extends Thread{
	SharedArea shared;
	
	@Override
	public void run() {
		
		//원주율 계산하기 
		double total = 0; 
		for (int i = 1; i<1000000000; i+=2) {
			if ( i/2 % 2 == 0) {
				total += 1.0 / i;
			}else {
				total -= 1.0 / i;
			}
		}//for
		total *= 4;
		
		shared.pi = total;
		//계산 후 값을 pi에 넣기
		
		shared.finished = true; 
		//계산 다 끝남(true)를 넣기
		
		//출력쓰레드가 일정시간 대기하는 것보다는
		//계산쓰레드가 계산완료되었음을 출력쓰레드에게 알려주는게 효율적
		//쓰레드간에 신호를 주고받기 위한 메소드로 동기화 처리를 해야한다 (synchronized)
		//신호를 보내는 메소드 :  notify, 
		//신호를 받는 메소드 : wait
		
		
		System.out.println("원주율 계산 : " +total);
		synchronized(shared) {
			shared.notifyAll();
		}
	}
}
