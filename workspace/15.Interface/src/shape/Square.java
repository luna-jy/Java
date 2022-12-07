package shape;

public class Square implements Shapable {
	int sideLength;
	Square(int sideLength){
		this.sideLength = sideLength;
	}
	
	@Override
	public double getArea() {
		return sideLength * sideLength;
	}
}
