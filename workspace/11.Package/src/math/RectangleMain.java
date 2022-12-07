package math;

import geometry.polygon.Rectangle;

public class RectangleMain {
	public static void main(String[] args) {
		
	
//10X5인 사각형
//접근 제한자 (접근제어자) default: 같은 package 내에서만 접근 가능
//서로 다른 package 에 있는 클래스의 구성요소(필드,생성자,메소드)에 접근하려면
//접근 허용필요 → public 으로 
	Rectangle r =new Rectangle(10,5); 

	System.out.printf("사각형 : %d X %d \n", r.width, r.height);
	System.out.printf("넓이 : %d",r.getArea());
}
}