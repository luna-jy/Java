package drink3;

import java.util.Scanner;

import drink.DrinkDTO;


public class InsertDAO extends Drink implements DrinkDAO{	
	
	InsertDAO(DrinkDTO[] drinks, Scanner sc) {
		super(drinks, sc);
	}


	int checkStorage() {
		int position = -1; //빈공간 없으면 -1 리턴  (배열 0부터니까 -1 이 의미하는건 인덱스 범위 벗어난것)
		for (int idx=0; idx< drinks.length; idx++) {
			if(drinks[idx] ==null) {
				position = idx;  //빈공간 존재시 해당 인덱스 리턴
				break; 
			}//if
		}//for
		return position;
	}
	
//등록 
	public void insert(){
		//음료정보를 저장할 인덱스를 찾는다. 
		int idx = checkStorage();
		if( idx == -1) {  
			System.out.println("저장공간 부족으로 등록불가!");
			return;
		}
		
		//System.out.println("등록처리");
		
		System.out.print("음료명 : ");
		String name = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("수량 : ");
		int qty= sc.nextInt();
		
		drinks[idx] = new DrinkDTO(name, price, qty);
	
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
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



