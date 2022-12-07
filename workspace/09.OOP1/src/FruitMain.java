public class FruitMain {
public static void main(String[] args) {
	FruitDTO[] fruit = new FruitDTO[3];
	fruit[0] = new FruitDTO("사과",1500,15);
	fruit[1] = new FruitDTO("귤",500,45);
	fruit[2] = new FruitDTO("복숭아",3000,13);
	
	FruitDAO dao = new FruitDAO();
	dao.getPrice(fruit);
	dao.display(fruit);
}//main()
}//class
