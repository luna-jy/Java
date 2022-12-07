package view;
import java.util.Scanner;
import product.ProductDAO;
import product.ProductDTO;

public class SearchCom {
	private Scanner sc;
	public SearchCom(Scanner sc) {
		this.sc = sc;
	}
	public void display(String company) {
		ProductDAO dao = new ProductDAO();
		ProductDTO dto = dao.SearchCom(company);
		
		System.out.println("[음료 정보]");
		if(dto==null) {
			System.out.println("음료 정보가 없습니다.");
		}else{
			System.out.println("상품번호 : "+ dto.getNum());
			System.out.println("상품명 : "+ dto.getName());
			System.out.println("제조회사 : "+ dto.getCompany());
			System.out.println("가격 : "+ dto.getPrice()+"개");
			System.out.println("수량 : "+ dto.getQty()+"원");
		}View.search.display();
		
	}


}
