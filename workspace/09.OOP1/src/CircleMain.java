public class CircleMain {
	//프로그램 실행의 시작점 : main메소드 
	public static void main(String[] args) {
		//CircleDAO dao = new CircleDAO();
		
		Circle c1 = new Circle(10); //생성자 호출문 
		CircleDAO dao = new CircleDAO(c1);
		new CircleDAO(c1).display();
		//dao.display(c1);
		//c1.display();
		/*System.out.printf("반지름: %d ---------\n ", c1.getRadius());
		System.out.printf("원의 둘레: %.2f", c1.getAround());
		System.out.printf("원의 넓이: %.2f", c1.getArea());
		System.out.printf("=================================");
		*/
		
		 c1 = new Circle(5);
			new CircleDAO(c1).display();
		// dao.display(c1);
			//c1.display();
		 /*System.out.printf("반지름: %d ---------\n  ", c1.getRadius());
		System.out.printf("원의 둘레: %.2f \n", c1.getAround());
		System.out.printf("원의 넓이: %.2f \n" , c1.getArea());
		System.out.printf("=================================");
		*/
		 
		c1 = new Circle(15);
		new CircleDAO(c1).display();
		//dao.display(c1);
		//c1.display();
		/*System.out.printf("반지름: %d ---------\\n  ", c1.getRadius());
		System.out.printf("원의 둘레: %.2f \n", c1.getAround());
		System.out.printf("원의 넓이: %.2f \n", c1.getArea());
		System.out.printf("=================================");
		*/
		



	}//main
}//class





 