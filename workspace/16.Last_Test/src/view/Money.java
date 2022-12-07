package view;

import java.util.Scanner;

import user.UserDAO;


public class Money {
	private Scanner sc;
	public Money (Scanner sc) {
		this.sc = sc;
	}	
public void display() {
	System.out.println("================================금액입력================================");
	System.out.println("금액을 추가할 유저 아이디를 입력하세요");
	String id = sc.next();	
	System.out.println("추가할 금액을 입력하세요");
	int input = sc.nextInt();	
	UserDAO dao = new UserDAO();
	dao.money(input, id);
	System.out.println("추가가 완료되었습니다."+"\n" );
	System.out.println("================================================================================");

	dao.balance(id);
	int money = dao.balance(id);
	
	System.out.println(id+"님의 현재 잔액 입니다 : " + money);
	
	System.out.println("================================================================================");
	System.out.println("[이전 화면으로 돌아갑니다]" +"\n");
	View.user.display();
}//display()
}//money
