package ex06;

public class Horse extends Thread {

	Shared shared; //공유영역에 필드 선언 
	String name;  //이름을 담을 필드선언
	int rank;

	Horse(Shared shared, String name) {
		this.name = name;
		this.shared = shared;
	} //생성자통해 필드를 초기화 ->주소값담음

	@Override
	public void run() {
		//20m 간격으로 달리고있는 지점과 경주마 이름을 출력한다. 
		for (int i = 0; i < 100; i ++) {	
			if(i == 0) {
				System.out.printf("경주마 %s , 출발합니다! \n",name);
			}else if(i % 20 == 0) {
				System.out.printf("경주마 %s  , 현재 %d 미터 통과입니다.",i ,name);
				
			}

			// 시간을 1초 간격으로 sleep처리
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} // for
		//100m 지점 도착했을때, 순위 알려준다. 
		
		++shared.rank;
		 shared.rank(name);
		 
	}

}
