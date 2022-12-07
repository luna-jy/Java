public class Circle {
//	-필드 :반지름 (private)
//			필드는 초기화하지 안아도 데이터 타입의 결과값을 갖고 있다. 	
private int radius ;   
//	-반지름을 초기화하는 생성자

public Circle(int radius){ 
	
	this.radius = radius;
}

//반지름을 반환하는 메소드 
int getRadius() {
	return radius ;  
}//리턴 데이터의 데이터타입을 메소드의 리턴타입으로 결정


//원의 둘레를 반환하는 메소드 
double getAround() {
	return 2 * 3.14 * radius; 
}

//원의 넓이를 반환하는 메소드 
double getArea() {
	return 3.14 * radius * radius;
}

//void display() {
//System.out.printf("반지름: %d ---------\\n  ", getRadius());
//System.out.printf("원의 둘레: %.2f \n", getAround());
//System.out.printf("원의 넓이: %.2f \n", getArea());
//System.out.printf("=================================");
//}



}//class


/*	
 접근제어자(접근제한자) private<default<protected<public* 
 private : 클래스 내부에서만 접근가능
 default : 동일한 패키지 내부에서만 접근 가능
 public: 다른 패키지에서도 접근 가능
 


	
	
}//class
*/