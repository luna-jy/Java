package ex02;

public class ThreadMain {
	public static void main(String[] args) {
		SMIThread smi = new SMIThread();
		VideoThread vd = new VideoThread(); 
		//5.
		
		
		//6. 실행 
		smi.start();
		vd.start();
		
	}
}
