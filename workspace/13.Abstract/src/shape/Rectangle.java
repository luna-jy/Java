package shape;

public class Rectangle extends Shape{
	int width;
	Rectangle(int height, int width){
		super(height);
		this.width = width;
	}
	double getArea() {
		return width * height;
	}
}
