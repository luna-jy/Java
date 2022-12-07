
public class CircleDAO {
	Circle c1;
	CircleDAO(Circle c1){
		this.c1 = c1;
	}
	void display() {
	System.out.printf("반지름: %d ---------\n  ", c1.getRadius() );
	System.out.printf("원의 둘레: %.2f \n", c1.getAround() );
	System.out.printf("원의 넓이: %.2f \n", c1.getArea() );
	System.out.println("=================================");
	}


//	void display(Circle c1) {
//		System.out.printf("반지름: %d ---------\\n  ", c1.getRadius());
//		System.out.printf("원의 둘레: %.2f \n", c1.getAround());
//		System.out.printf("원의 넓이: %.2f \n", c1.getArea());
//		System.out.printf("=================================");
//		}

}



//DAO Data Access Object