package geometry;

public class Circle {
//hrd.go.kr > kr > go > Hrd.java
	int radius;
	public Circle (int radius) {
		this.radius = radius;
	}
	
	//원의 넓이를 구한다
	public double getArea() {
		double area=3.14 * radius * radius;
		return area;
	}
}
