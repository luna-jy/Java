package ex06;

public class Shared {
	
	int rank;
	//int 0부터 시작이니까  ++this.rank 복합연산자로 시작하게끔한다. i++ 이면 0,1,2,---

	//순위
	
		synchronized 
		void rank(String name) {
			System.out.println(name + ++this.rank +"입니다.");		


	
		}
		
}//class
