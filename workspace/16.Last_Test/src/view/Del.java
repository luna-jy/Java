package view;

import java.util.Scanner;
import product.ProductDAO;

public class Del {
	private Scanner sc;
	public Del (Scanner sc) {
		this.sc = sc;
	}

	public void display() {	
		System.out.println("================================상품삭제================================");
		System.out.println("삭제할 상품번호를 입력하세요");
		int num = sc.nextInt();
	
		ProductDAO dao = new ProductDAO();
		dao.delete(num);
		System.out.println(num+"이 삭제되었습니다.");
		View.admin.display();		
}//display()
}//del
