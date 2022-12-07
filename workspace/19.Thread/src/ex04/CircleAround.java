package ex04;

public class CircleAround extends Thread {
	SharedArea shared; //공유영역의 주소
	int radius;  //원의 둘레에 해당하는 값에 대한 필드 생성
	
	CircleAround(SharedArea shared, int radius) {
		this.shared = shared;
		this.radius = radius;
	} //두 필드를 초기화 할 생성자를 선언
	
	
	
	//원의 둘레를 출력
	@Override
	public void run() {
		
	if (! shared.finished)  {   
		try {
			synchronized (shared) {
				shared.wait();
			}
		} catch (InterruptedException e) {
		}
	}
	double around = shared.pi * 2 * radius;
	System.out.printf("반지름 %d인 원의 둘레: %.3f \n",radius, around);	
}
}
