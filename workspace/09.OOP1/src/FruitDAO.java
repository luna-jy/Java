import java.text.DecimalFormat;

public class FruitDAO {

	public void display(FruitDTO[] fruit) {
		DecimalFormat df = new DecimalFormat("￦#,##0");
		System.out.println("과일명" + "\t" + "단가" + "\t" + "수량" + "\t" + "가격");
		
		for (FruitDTO dto : fruit) {
			System.out.println(dto.getName()+"\t");
			System.out.println(df.format(dto.getCost())+"\t");
			System.out.println(dto.getQty()+"\t");
			System.out.println(df.format(dto.getPrice())+"\n");
	}//for
}//display()
public void getPrice(FruitDTO[] fruit) {
	for(FruitDTO dto : fruit) {
		dto.setPrice(dto.getCost()*dto.getQty());
	}//for
}//getPrice()

}//DAO
