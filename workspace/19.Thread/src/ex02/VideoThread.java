package ex02;

public class VideoThread extends Thread {
	@Override
	public void run() {
		//비디오 프레임 번호를 출력하기 
		int no [] = new int [] {1,2,3,4,5};
		// int no = {1,2,3,4,5};
		
		for(int idx = 0; idx<no.length; idx++) {
			System.out.println("비디오 프레임 : " + no[idx]);
		
			try {
				Thread.sleep(300);  //300ms  딜레이 주고, 예외처리
			} catch (InterruptedException e) {
			} //try
			
			
		}//for
	}
}
