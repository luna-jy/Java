package shape;

public class ShapeMain {
	public static void main(String[] args) {
		int bottom =10, height = 5;
		Triangle t = new Triangle(bottom, height);
		System.out.printf("밑변 %d, 높이 %d인 직각삼각형의 넓이는 %.1f \n"
				, bottom, height, t.getArea());
		int width = 10;
		Rectangle r = new Rectangle(width, height);
		System.out.printf("너비 %d, 높이 %d인 직사각형의 넓이는 %.1f \n"
				, width, height, r.getArea());
		
		
		
		
	}
}
