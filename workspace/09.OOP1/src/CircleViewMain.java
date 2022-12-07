import java.util.Scanner;

public class CircleViewMain {
	public static void main(String[] args) {
		
		Circle[] circles = new Circle[6];
		circles[0] = new Circle(5);
		circles[1] = new Circle(10);
		//circles[2] = new Circle(15);
		circles[3] = new Circle(20);
		circles[4] = new Circle(25);
		circles[5] = new Circle(30);
	
		//for 문을 사용해 주소를 담는 처리를 한다. 
//		for(int i=0; i<circles.length-1; i++){
//			circles[i] = new Circle(5*(i+1));
//		}
		//0: 5, 1:10, 2:15 .....
		System.out.println("============================");
		System.out.println("원 목록");
		System.out.println("============================");
		
	
		for (Circle c : circles) {  
			if (c == null) continue; 
				CircleDAO dao = new CircleDAO(c);
				dao.display();		
		}
		
		
		
//		if(c != null ) {
//		CircleDAO dao = new CircleDAO(c);
//		dao.display();
//		}
//		}//for
		
		
		for(int i=0; i<circles.length; i++) {
			if (circles[i] == null) continue; 
			System.out.printf("%d. 반지름 %d 인 원\t ", i+1 , circles[i].getRadius());
		}
		System.out.print("\n확인할 원의 번호를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();  
		
		
		//circles [no-1] 
		if (no<=circles.length) {
			if(circles[no-1] != null){
				CircleDetailMain detail = new CircleDetailMain(); //상세화면
				detail.displayCirclce(circles[no-1]);
			}else {
				System.out.println("생성된 원이 없습니다.");
			}			
		}else {
			System.out.printf("번호는 %d까지 입력 가능합니다.", circles.length);
		
		}		
		System.out.println("1.신규 등록 화면");
	}//main
	
}//class
