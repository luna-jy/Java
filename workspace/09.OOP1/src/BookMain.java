public class BookMain {
	public static void main(String[] args) {
		Book b1 = new Book();	
		b1.title= "JAVA";
		b1.name= "신용권";
		b1.company= "한빛미디어";
		b1.cost= 24000;
		b1.qty= 14;
		b1.getPrice();
		b1.display();

		Book b2 = new Book();	
		b2.title= "View";
		b2.name= "김은옥";
		b2.company= "삼양미디어";
		b2.cost= 28000;
		b2.qty= 13;
		b2.getPrice();
		b2.display();
		
		Book b3 = new Book();	
		b3.title= "SQL";
		b3.name= "개발팀";
		b3.company= "한울";
		b3.cost= 15000;
		b3.qty= 20;
		b3.getPrice();
		b3.display();
	}//main()
}//class
