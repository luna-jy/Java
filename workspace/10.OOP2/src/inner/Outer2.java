package inner;

public class Outer2 {

	Button button = new Button() {
		void click() {
		System.out.println("버튼 클래스 클릭");
			
		}//click()
	};//익명 클래스는 반드시 선언을 ;으로 끝낸다.
	
	Button method() {
		/*
		 Button no = new Button() {
		 
			void click() {
				System.out.println("익명클래스의 클릭 메소드");
				
			}//click()
		}; //익명 클래스는 반드시 선언을 ;으로 끝낸다.
		return no;
		*/		
		return new Button () {
			void click() {
				System.out.println("익명클래스의 클릭 메소드");
			}
			
		}; 
	}//button method 바로 리턴값 가져오기 
	
	
}//class
