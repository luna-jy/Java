package ex04;

public class CircleArea extends Thread{
	SharedArea shared;
	int radius; 
	
	CircleArea(SharedArea shared, int radius) {
		this.shared = shared;
		this.radius = radius;
	}
	@Override
	public void run() {
		 //원의 넓이를 출력
		if (! shared.finished)  {   
			try {
				synchronized (shared) {
					shared.wait();
				}
			} catch (InterruptedException e) {
			}
		}//완료되지않았다면 대기
		double area = shared.pi * radius * radius;   //계산 완료시
		System.out.printf("반지름 %d인 원의 넓이 : %.3f  \n" ,radius, area);
	 }
}
