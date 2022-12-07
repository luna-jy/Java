package object;

public class RectangleMain {
// 5x10인 사각형 객체를 두 개 생성
// 두 사각형을 같은 사각형으로 출력되게  (넓이 같음)
	public static void main(String[] args) {
		Rectangle a = new Rectangle(5,10);
		Rectangle b= new Rectangle(5,10);
		
		if(a.equals(b))
			System.out.println("같은 사각형");
		else System.out.println("다른 사각형");
		
	}
	
}
