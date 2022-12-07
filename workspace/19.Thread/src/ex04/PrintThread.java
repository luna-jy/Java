package ex04;

public class PrintThread extends Thread {
	SharedArea shared; 
	@Override
	public void run() {
		try {
		//	Thread.sleep(5000);

			if ( !shared.finished) {
				synchronized(shared) {
				shared.wait(); //shared에서 데이터 오기를 기다림. 
				}
				System.out.println("원주율 출력 : "  + shared.pi);
			}
		} catch (InterruptedException e) {
		}
		
		
		}//run()
}
