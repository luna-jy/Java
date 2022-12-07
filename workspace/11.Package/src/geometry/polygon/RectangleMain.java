package geometry.polygon;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r =new Rectangle(4,5);
			System.out.printf("사각형 : %d X %d \n", r.width, r.height);
			System.out.printf("넓이 : %d",r.getArea());
			
	}
}
