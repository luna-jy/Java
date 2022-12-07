package shape;

public class Triangle extends Shape{
	int bottom;
	public Triangle(int bottom, int height) {
		super(height);
		this.bottom  = bottom;
	}
	double getArea() {
		return bottom * height / 2;
	}

}
