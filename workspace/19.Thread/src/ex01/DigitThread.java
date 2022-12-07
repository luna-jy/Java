package ex01;

public class DigitThread extends Thread{

	public void run () {
		for (int no = 1; no <= 20; no++) {
			System.out.print(no);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			} //0.5초 간격으로 실행 텀
			
		}
	}
}
