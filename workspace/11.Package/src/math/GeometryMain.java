package math;

import geometry.Circle;
import geometry.polygon.Rectangle;

public class GeometryMain {
	public static void main(String[] args) {
		//반지름 5인 원, 4x5인 사각형 생성하기
		Circle c = new Circle(5);
		Rectangle r =new Rectangle(4,5);
		
		if(c.getArea() >= r.getArea())
			System.out.println("원의 넓이가 더 넓다");
		else 
			System.out.println("사각형의 넓이가 더 넓다");
			
	}
}
