package drink;

import java.util.Scanner;

public class DrinkDAO {
	DrinkDTO[] drinks;
	Scanner sc;
	
	DrinkDAO(DrinkDTO[] drinks, Scanner sc){
		this.drinks = drinks;
		this.sc = sc;
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
	void insert(){
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
//목록보기
	void list(){
		//System.out.println("목록보기");
		
		System.out.println("--------------------------------");
		System.out.println("번호    음료명     가격   수량");
		System.out.println("--------------------------------");
		
		int no = 0;
		for(DrinkDTO dto : drinks) {
			if (dto != null) {
				System.out.printf("%d.\t %s\t %d\t %d \n", ++no, dto.name , dto.price, dto.qty);
			}//if
		}//for
		if ( no == 0) System.out.println("등록된 음료가 없습니다.");
	}
	
//변경 
	void update() {
		//System.out.println("변경처리");
		list();
		System.out.println("음료선택 : ");
		int idx = sc.nextInt() -1;
		
		System.out.printf("음료명 : %s → ", drinks[idx].name );
		String name =sc.next();
		
		System.out.printf("가격 : %d → ", drinks[idx].price);
		int price = sc.nextInt();
		
		System.out.printf("수량 : %d → ", drinks[idx].qty);
		int qty = sc.nextInt();
		
		drinks[idx].name = name;
		drinks[idx].price = price;
		drinks[idx].qty = qty;
		
		
		}
//삭제  -자체를 삭제하는게 아니라 주소값을 모르게 하는 !
	void delete() {
		//System.out.println("삭제처리");
		list();
		System.out.println("음료선택 : ");
		int idx = checkRange(sc.nextInt() -1);
		if( idx == -1) {
			System.out.println("번호를 잘못 입력했습니다");
		}else if ( idx == -2) {
			System.out.println("삭제할 음료가 없습니다.");
		} else{
			drinks[idx] = null;
		}//if
	}
	
	int checkRange(int no) {
		if (no >= drinks.length ) return -1;
		if (drinks[no] == null ) {
			//삭제할 음료정보가 없는 경우 
			return -2;
		}else {
			//삭제할 음료정보의 인덱스 값 (no)을 리턴
			return no;
		}
	}

}
