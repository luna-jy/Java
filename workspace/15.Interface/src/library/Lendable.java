package library;

public interface Lendable {
	void checkOut(String borrower, String checkOutDate) throws Exception;
	void checkIn();
	
	//대출중, 대출가능
	int STATE_BORROWED = 1; //대출불가능
	int STATE_NORMAL = 0; //대출가능
	 
}
