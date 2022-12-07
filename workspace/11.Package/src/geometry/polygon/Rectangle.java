package geometry.polygon;

public class Rectangle {
	public int width, height;
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	//넓이를 구하는 메소드
	public int getArea () {
		return width * height;
	}
}
