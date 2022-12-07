package view;

import java.util.Scanner;

import product.ProductDAO;
import product.ProductDTO;
import user.UserDAO;
import user.UserDTO;

public class Order {
	private Scanner sc;
	public Order (Scanner sc) {
		this.sc = sc;
	}
	public void display() {
		UserDAO dao = new UserDAO();
		UserDTO user_dto = new UserDTO();
		String id = user_dto.getId();		
		ProductDTO product_dto = null;
		ProductDAO product_dao = new ProductDAO();
		
		
		System.out.println("================================상품주문================================");	
		View.list.display();		
		System.out.println("주문할 상품번호를 입력하세요");
		int num = sc.nextInt();	

		product_dto = product_dao.stock3(num);
		
		int qty_n = product_dto.getQty();
		
		
		System.out.println("========================================================================");
		System.out.println("주문할 상품수량을 입력하세요");
		int qty = sc.nextInt();	
		
		
		product_dao.stock3(num);
		dao.balance(id);
		
		//재고가 0이거나 0보다 적을때  
			if (qty_n == 0 || qty_n < 0 ) {
				System.out.println("재고가 없습니다. 주문이 불가합니다" );	
				System.out.println("========================================================================");
				System.out.println("[이전 화면으로 돌아갑니다]" +"\n");
				View.user.display();				
			//재고수량과 주문수량보다 많을때 
			}else if (qty_n < qty) {
				System.out.println("재고수량보다 주문수량이 많습니다. 주문이 불가합니다.");
			//재고 있을 경우
			}else if ( qty_n != 0 ) {			
				System.out.println(num + " 번 상품이 주문되었습니다."+"\n");
			}	
				System.out.println("========================================================================");
				System.out.println("[상품 주문 후 잔액]" );
				dao.order(num,id, qty);
				int now = dao.balance(View.user_dto.getId());
				System.out.println("현재 잔액은"+ now +"원 입니다."+"\n" );		
				System.out.println("========================================================================");
				System.out.println("[이전 화면으로 돌아갑니다]" +"\n");
				View.user.display();
			}
	
	
}//Order
