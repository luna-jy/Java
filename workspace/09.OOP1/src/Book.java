import java.text.DecimalFormat;

public class Book {
	String title, name, company;
	int cost, qty, price;
public void getPrice() {
	price = cost * qty;
}	//getPrice
	public void display() {
		DecimalFormat df= new DecimalFormat("￦#,##0"); 
		System.out.println("도서명: "+ title);
		System.out.println("저자: "+ name);
		System.out.println("출판사: "+ company);
		System.out.println("단가: "+ df.format(cost));
		System.out.println("수량: "+ qty);
		System.out.println("가격: "+ df.format(price));
		System.out.println();
	}//display	
}//class
