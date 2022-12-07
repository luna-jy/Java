package shape;

public class Circle implements Shapable {
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	//	public abstract double getArea(); 선언되어있음
	public double getArea() {
		
		return Math.PI * Math.pow(radius, 2);
		//return 3.14 * radius * radius;
	}


}
