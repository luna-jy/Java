package ex04;

public class ThreadMain {
	public static void main(String[] args) {
		
	
	SharedArea shared = new SharedArea();
	PIThread first = new PIThread(); 
	PrintThread second = new PrintThread();
	
	first.shared = shared; 
	second.shared = shared; 

	first.start();
	second.start();
	
	
	int radius = 10;	//변수에 담는다. 
	CircleAround around = new CircleAround(shared, radius); //객체를 생성
	around.start();

	CircleArea area = new CircleArea(shared, radius);
	area.start();


}
}
