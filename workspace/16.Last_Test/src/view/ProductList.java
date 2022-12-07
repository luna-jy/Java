package view;

import java.util.ArrayList;
import java.util.Scanner;

import product.ProductDAO;
import product.ProductDTO;


public class ProductList {
	private Scanner sc;
	public ProductList( Scanner sc ){
		this.sc = sc;
	}
	
	
	public void display() {
	
		ProductDAO dao = new ProductDAO();
	
		
		ArrayList<ProductDTO> list = dao.product_list();
		System.out.println("===============================전체상품목록================================");
			
			for(ProductDTO dto : list) {
				System.out.println("상품번호 : "+dto.getNum());
				System.out.println("상품명 : " + dto.getName());
				System.out.println("제조사 : "+dto.getCompany());
				System.out.println("가격 : "+dto.getPrice()+"원");
				System.out.println("수량 : "+dto.getQty()+"개");
				System.out.println();
			}//for	
		System.out.println("===========================================================================");	
	}//display
}//productlist





	
	
	
	

