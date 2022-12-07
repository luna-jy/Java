package ex06;


public class HorseMain {
	public static void main(String[] args) {
		
	Shared shared = new Shared();	
	
	Horse name1 = new Horse (shared,"골든위너");
	Horse name2 = new Horse (shared,"닥터카슨");
	Horse name3 = new Horse (shared,"대망의길");
	Horse name4 = new Horse (shared,"도미네이션");
	Horse name5 = new Horse (shared,"마하");
	
		
	name1.start();
	name2.start();
	name3.start();
	name4.start();
	name5.start();
	
		//shared.rank();				
		//RankThread rank = new RankThread(shared);					
	
	}//main()
}//class
