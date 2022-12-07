package ex03;

public class DigitRunnable implements Runnable {

	@Override
	public void run() {
		 
		
		for (int no = 1; no <=20 ; no++) {
			System.out.print(no);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}//구체적 처리내용을 적는 것은 같다.

}
