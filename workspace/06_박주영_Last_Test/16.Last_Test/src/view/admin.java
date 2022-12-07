package view;
import java.util.Scanner;
public class admin {
	private Scanner sc;
	public admin (Scanner sc) {
		this.sc = sc;
	}
	
	public void display() {		
		
		System.out.println("================================관리자 모드================================");	
		System.out.println("0.전체 상품 목록 조회 1.상품검색 2.상품추가 3.상품삭제 4.재고관리 5.로그아웃");
		System.out.println("===========================================================================");
		System.out.println("실행할 기능을 선택하세요: ");	
		switch(sc.nextInt()) {
		case 0:
			View.list.display();
			break;
		case 1:			
			View.search.display();
			break;
		case 2:
			View.add.display();
			break;
		case 3:
			View.del.display();
			break;
		case 4:
			View.st.display();
			break;
		case 5:	
			System.out.println("============================로그아웃============================");	
			System.out.println("1.로그아웃 2.다시 로그인하기");
			int menu = sc.nextInt();
			if(menu == 1) {				
				System.out.println( "계정이 로그아웃되어 프로그램이 종료되었습니다.");
				System.exit(1);
			}else if (menu ==2) {
			View.login.display();
			}
			}//switch					
	}//display
}//admin