package view;

import java.util.Scanner;

import product.ProductDAO;

public class Add {
	private Scanner sc;
	public Add (Scanner sc) {
		this.sc = sc;
	}
	public void display() {	
		
		System.out.println("================================상품등록================================");
		System.out.println("등록할 상품이름, 상품 제조사명, 상품 가격, 상품 수량을 순서대로 입력하세요");
		System.out.println("===========================================================================");	 

				
		System.out.println("상품 이름을 입력하세요");
		String name = sc.next();
		
		System.out.println("상품 제조사명을 입력하세요");
		String company = sc.next();		
		
		System.out.println("상품 가격을 입력하세요");
		int price = sc.nextInt();
			
		System.out.println("상품 수량을 입력하세요");
		int qty = sc.nextInt();			
		
		ProductDAO dao = new ProductDAO();
		dao.Insert(name, company, price, qty);		
		System.out.println("상품 등록이 완료되었습니다.");
		System.out.println("전체 상품 목록을 조회합니다." +"\n");
		View.list.display();
		
	}//display
}//Add
		
	

