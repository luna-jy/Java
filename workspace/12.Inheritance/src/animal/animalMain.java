package animal;

public class animalMain {
 public static void main(String[] args) {
	dog a1= new dog("진돗개");
	a1.eat();
	a1.sleep();
	a1.run();
	
	System.out.println("======================");

	bird b1 = new bird("앵무새");
	b1.eat();
	b1.sleep();
	b1.fly();

	System.out.println("======================");

	cat c1 = new cat("고양이");
	c1.eat();
	c1.sleep();
	c1.grooming();
}
}
