package library;

public class AppendixCD extends CD implements Lendable{
	String borrower, checkOutDate;
	int cdState;
	AppendixCD(String registeredNo, String title){
		super(registeredNo, title);
	}
	
	public void checkOut(String borrower, String checkOutDate) throws Exception{
		
		//이미 누군가 대출한 상태라면 대출 할 수 없다.
		if(cdState==STATE_BORROWED) 
			throw new Exception (title + ": 대출중으로 대출 불가");
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;		
		this.cdState = STATE_BORROWED;
		System.out.printf("[%s] CD가 대출되었습니다 \n ", title);
		System.out.println("대출자 : " + borrower);
		System.out.println("대출 일자 : " + checkOutDate);
	
	}
	public void checkIn() {
		// 대출정보 초기화
		this.borrower = null;
		this.checkOutDate = null;
		this.cdState = STATE_NORMAL;
		System.out.printf("[%s] CD가 반납되었습니다 \n ", title);
				
	}
}
