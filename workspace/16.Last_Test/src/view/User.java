package view;

import java.util.Scanner;

public class User {
	private Scanner sc;
	public User (Scanner sc) {
		this.sc = sc;
	}
	
	public void display() {
		System.out.println("================================사용자 모드================================");
		System.out.println("0.전체 상품 목록 조회 1.금액 입력 2.상품 주문 3.로그아웃");
		System.out.println("===========================================================================");
		System.out.println("실행할 기능을 선택하세요: ");
	
		switch(sc.nextInt()) {
		case 0:
			View.list.display();
			break;
		case 1:			
			View.money.display();			
			break;
		case 2:
			View.order.display();
			break;
		case 3:
			System.out.println("============================로그아웃============================");	
			System.out.println("1.로그아웃 2.다시 로그인하기");
			int menu = sc.nextInt();
			if(menu == 1) {			
				System.out.println("계정이 로그아웃되어 프로그램이 종료되었습니다.");
			System.exit(1);
			}else if (menu ==2) {
			View.login.display();
			}	
	}//switch
}//display()
}//user
