package drink3;

import java.util.Scanner;

import drink.DrinkDTO;



public class ListDAO extends Drink implements DrinkDAO {

	
	ListDAO(DrinkDTO[] drinks, Scanner sc) {
		super(drinks, sc);
	}



	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		System.out.println();
		//System.out.println("목록보기");
		int no = 0;
				System.out.println("--------------------------------");
				System.out.println("번호    음료명     가격   수량");
				System.out.println("--------------------------------");
				
				
				for(DrinkDTO dto : drinks) {
					if (dto != null) {
						System.out.printf("%d.\t %s\t %d\t %d \n", ++no, dto.name, dto.price, dto.qty);
					}//if
				}//for
				if ( no == 0) System.out.println("등록된 음료가 없습니다.");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
			
	}