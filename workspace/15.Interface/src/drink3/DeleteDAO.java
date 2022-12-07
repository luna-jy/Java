package drink3;

import java.util.Scanner;

import drink.DrinkDTO;




public class DeleteDAO extends Drink implements DrinkDAO {

	
	DeleteDAO(DrinkDTO[] drinks, Scanner sc) {
		super(drinks, sc);
	}
	void delete(int no,String name, String  price, String qty ) {
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	}
