package ex03;

public class RunnableMain {
	public static void main(String[] args) {
		AlphabetRunnable alphabet = new AlphabetRunnable();  //객체를 생성
		DigitRunnable digit = new DigitRunnable () ;
		
		//thread 객체를 생성해야 start () 사용가능
		
		Thread thread1 = new Thread(alphabet );
		Thread thread2 = new Thread(digit );
		
		// Thread third = new Thread(new DigitRunnable ());//새로 추가할 경우 
		
		thread1.start();
		thread2.start();
		
		// third.start();
		
		
		
	}
}
