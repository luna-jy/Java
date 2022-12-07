package drink3;

import java.util.Scanner;

import drink.DrinkDTO;



public class UpdateDAO extends Drink implements DrinkDAO {
	DrinkDTO[] drinks;
	Scanner sc;
	
	UpdateDAO(DrinkDTO[] drinks, Scanner sc) {
		super(drinks, sc);
	}

	

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
	 
				//System.out.println("변경처리");
						System.out.print("음료선택 : ");
						int idx = Integer.parseInt(sc.nextLine()) -1;
						
						System.out.printf("음료명 : %s → ", drinks[idx].name );
						drinks[idx].name =sc.next();
						
						System.out.printf("가격 : %d → ", drinks[idx].price);
						drinks[idx].price = sc.nextInt();
						
						System.out.printf("수량 : %d → ", drinks[idx].qty);
						drinks[idx].qty = sc.nextInt();
						
					
						
						}
		
	

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	}

	