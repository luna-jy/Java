package view;
import java.util.Scanner;

import product.ProductDAO;
import product.ProductDTO;



public class Search {
	private Scanner sc;
	public Search( Scanner sc ){
		this.sc = sc;
	}
		
	public void display() {		
		ProductDAO dao = new ProductDAO();
		int input = 0;
		
		
		System.out.println("================================상품검색================================");	 
		System.out.println("1.음료이름으로 검색  2.음료회사로 검색 3.홈 화면으로 돌아가기 ");
		System.out.println("==========================================================================");
		System.out.println("실행할 기능을 선택하세요: ");			
		input = sc.nextInt();
		
		switch(input){
			case 1: 
				System.out.println("검색할 음료 이름 : ");	
				String name = sc.next();
				ProductDTO dto1 = dao.SearchName(name);
				new SearchName(sc).display(name);
				break;				
			
			case 2:
				System.out.println("검색할 음료 회사 :");	
				String company = sc.next();
				ProductDTO dto2 = dao.SearchCom(company);
				new SearchCom(sc).display(company);
				break;
			
			case 3:
				System.out.println("홈 화면으로 돌아갑니다.");
				View.admin.display();	
				break;
				}//switch
	
		
	}//display()
}//search
	
	
	
	


