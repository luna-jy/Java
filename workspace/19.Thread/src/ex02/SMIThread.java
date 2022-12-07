package ex02;

public class SMIThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(50); //2.비디오 thread가 먼저 실행되도록 일정시간 대기하기 
			
		} catch (InterruptedException e) {
		} //3.예외처리
		
		//4.자막번호  하나~다섯 으로 출력. 
		String subtitle[] = {"하나","둘","셋","넷","다섯"};
		
		//4-1.반복문
		for(String title :subtitle) {
			System.out.println("자막: " + title);  //4-2자막에 해당하는 title 출력
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			} //4-3 0.3초 딜레이 & 예외처리
		}
	
	}  //1. run + ctrl+space
}
