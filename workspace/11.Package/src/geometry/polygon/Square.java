package geometry.polygon;

//정사각형
public class Square {
	//한변의 길이 
	int sideLength; 
	public Square(int sideLength){
		this.sideLength = sideLength;
	}
	public int getArea() {
		return sideLength * sideLength;
	}

}
