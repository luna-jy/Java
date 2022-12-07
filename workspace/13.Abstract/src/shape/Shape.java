package shape;

//도형
abstract public class Shape {
//	1.필드: 높이 2.메소드: 넓이를 구한다 3.생성자
	int height;
	Shape(int height){
		this.height = height; 
	}
	abstract double getArea();
}
