package object;

public class Rectangle {
	//필드 : 너비 , 높이 private
	//생성자 선언  :public
	//getter, setter메소드
	
	
	private int width, height; 

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {   //사각형인지 확인 --> 생성된 obj가 rectangle??-->
			Rectangle c = (Rectangle) obj;  //obj를 (사각형)으로 만듦	
			//너비와 높이가 같은 사각형
			if(width == c.width && height == c.height) {  //너비도 같고 && 높이도 같으면
				return true; //true
			} else {
				return false;// false
			}
		}else {
			return false;  //-->rectangle 아니면 false
		}
		
		
	}
}
