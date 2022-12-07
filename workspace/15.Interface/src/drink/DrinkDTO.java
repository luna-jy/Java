package drink;

public class DrinkDTO {
	//음료명, 가격, 수량
	 public String name;
	 public int price, qty; 
	
	public DrinkDTO (String name, int price, int qty){
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
