package view;
import java.util.Scanner;

import product.ProductDAO;
import product.ProductDTO;


public class Stock {
	private Scanner sc;
	public Stock (Scanner sc){
		this.sc = sc;
	}

	public void display() {
		ProductDAO dao = new ProductDAO();		
		int input = 0;		
		
		do {
		System.out.println("====================================재고관리====================================");		
		View.list.display();	
		System.out.println("1.재고 수량 차감 2.재고 수량 증가 0.나가기");
		System.out.println("================================================================================");
		System.out.println("실행할 기능을 선택하세요: ");
		input = sc.nextInt();
		
		switch(input) {	
		case 1:			
			System.out.println("차감할 상품번호를 입력하세요");
			int num = sc.nextInt();
			System.out.println("차감할 수량을 입력하세요");
			int mqty = sc.nextInt();
			dao.stock(mqty, num);
			System.out.println(num+"번 상품의 재고가 "+ mqty +" 개 차감되었습니다");			
			break;
			
		case 2:
			System.out.println("증가시킬 상품번호를 입력하세요");
			num = sc.nextInt();
			System.out.println("증가시킬 수량을 입력하세요");
			int iqty = sc.nextInt();
			dao.stock2(iqty, num);
			System.out.println(num+"번 상품의 재고가 "+iqty+" 개 증가되었습니다.");
			break;			
			}		
		}while(input != 0); {
			View.admin.display();
		}
	}//display()
}//class


