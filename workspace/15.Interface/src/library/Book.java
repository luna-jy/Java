package library;

public class Book implements Lendable {

	String requestNo, title, author, borrower, checkOutDate;
	int bookState;
	Book (String requestNo, String title, String author){
		this.requestNo = requestNo;
		this.title = title;
		this.author = author;
	}
	
	//public static final int
	
	public void checkOut(String borrower, String checkOutDate) {
		if (bookState==STATE_BORROWED) return;
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.bookState = STATE_BORROWED;
		System.out.printf("[%s] 도서가 대출되었습니다 \n ", title);
		System.out.println("대출자 : " + borrower);
		System.out.println("대출 일자 : " + checkOutDate);
	}
		
	
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.bookState = STATE_NORMAL;
		System.out.printf("[%s] 도서가 반납되었습니다 \n ", title);
	}
}
