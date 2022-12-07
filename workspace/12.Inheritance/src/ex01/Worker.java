package ex01;

//근로자 
public class Worker extends Person {
	//근로자명, 나이, 사번	
		String  workerNo;

	//근로자명,나이, 먹는다, 잠을잔다 : 공통내용
	
		//3.출근한다
		void gotoWork(){
			System.out.println(name + "출근한다");
			
		}
}
