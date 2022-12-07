package drink;

import java.util.Scanner;

public class DrinkMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열변수 
		DrinkDTO[] drinks = new DrinkDTO[10];
		drinks[0] = new DrinkDTO("콜라",1250, 10);
		drinks[1] = new DrinkDTO("캔커피",1500, 5);
		drinks[2] = new DrinkDTO("코코팜",1300, 15);
		//drinks[3...9] = new DrinkDTO("코코팜",1300, 15);
	
	
		DrinkDAO dao = new DrinkDAO (drinks, sc);
		
		int fnKey = 0;		
		System.out.println("음료관리 프로그램");
		do {
		System.out.println("-----------------------------------------------------");
		System.out.println("1.음료 등록  2.음료목록보기  3.음료변경  4.음료삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------------------------------------------");
		System.out.println("기능 번호 선택 : ");
		fnKey = sc.nextInt();
		
		if(fnKey == 1) {
			dao.insert();
		}else if(fnKey == 2){
			dao.list();
		}else if(fnKey == 3){
			dao.update();
		}else if(fnKey == 4){
			dao.delete();
		}//if
		}while (fnKey !=0); //do-while 0이 아닌 동안은 계속 실행 
	}
}
