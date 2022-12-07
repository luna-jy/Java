package ex01;

public class AlphabetThread extends Thread{
	public void run() { // 3. 어떤기능을 수행할 것인지 run()내에 구현한다. 
		for (char alphabet = 'A'; alphabet <='Z'; alphabet ++ ) {
			System.out.print(alphabet);
		
			//처리시간을 넣는다. (1000(ms) = 1s)
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		
		
		}
		
	}
}
