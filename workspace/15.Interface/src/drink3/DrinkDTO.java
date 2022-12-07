package drink3;

public class DrinkDTO {

	public String name;	//필드를 초기화 한다.
	public int price, qty; 
	
	public DrinkDTO (String name, int price, int qty){
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}

}
