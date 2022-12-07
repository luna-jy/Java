package view;
import java.util.Scanner;


public class TestMain{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		View.login = new Login(sc);
		View.user = new User(sc);
		View.list = new ProductList(sc);
		View.admin = new admin(sc);
		View.name = new SearchName(sc);
		View.com = new SearchCom(sc);
		View.search = new Search(sc);
		View.add = new Add(sc);
		View.del = new Del(sc);
		View.st = new Stock(sc);
		View.money = new Money(sc);
		View.order = new Order(sc);
		
		
	
		View.login.display();
		sc.close();
				
	}
	
}
	
		

	


		


	

