public class FruitDTO {
	 private String Name;
	 private int Cost,Qty, Price;
	 
public FruitDTO() {}


public FruitDTO(String Name, int Cost, int Qty) {
	super();
	this.Name = Name;
	this.Cost = Cost;
	this.Qty = Qty;
}

public String getName() {
	return Name;
}

public void setName(String Name) {
	this.Name = Name;
}

public int getCost() {
	return Cost;
}

public void setCost(int Cost) {
	this.Cost = Cost;
}

public int getQty() {
	return Qty;
}

public void setQty(int Qty) {
	this.Qty = Qty;
}


public int getPrice() {
	return Price;
}


public void setPrice(int Price) {
	this.Price = Price;
}

	
}
