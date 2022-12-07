package square;
public class Square {
	//필드 너비, 높이 선언
	int width,height ;

//생성자 : 너비와 높이를 초기화 하고 
//			너비나 높이가 0이하이면 사각형 생성할 수 없도록 exception 처리를한다.	
Square(int width, int height)throws Exception{
	if(width<0 ||  height<0){
	throw new Exception("사각형 생성 불가");
	}
	this.width = width;
	this.height= height;
}
	
	  
	//넓이를 반환하는 메소드
	
    int getarea() {
	 int area = width*height;
	return area;
	}//area() 
	
	
	//둘레를 반환하는 메소드
	int getaround(){
	int	around = 2*(width+height);
	return around;
	}//around()
	
}//class
