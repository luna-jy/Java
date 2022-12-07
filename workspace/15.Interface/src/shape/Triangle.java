package shape;

public class Triangle implements Shapable {
	int bottom, height;
	Triangle(int bottom, int height){
		this.bottom = bottom;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return bottom * height /2;
	}

}
