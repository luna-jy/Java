package drink3;

import java.util.Scanner;

import drink.DrinkDTO;

public class DrinkMain {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    //배열변수
    DrinkDTO[] drinks = new DrinkDTO[10];

    InsertDAO insert = new InsertDAO(drinks, sc);
    ListDAO list = new  ListDAO(drinks, sc);
    UpdateDAO update = new UpdateDAO(drinks, sc);
    DeleteDAO delete = new DeleteDAO(drinks, sc);
    
    System.out.println("[음료관리 프로그램]");
    int fnKey = 0;

    do {
       System.out.println("----------------------------------------------------------");
       System.out.println("1.음료등록   2.음료목록보기   3.음료변경   4.음료삭제" );
       System.out.println("0.프로그램 종료");
       System.out.println("----------------------------------------------------------");
       System.out.print("기능번호 선택: ");
       fnKey = sc.nextInt();
       
       if(fnKey==1) {
    	   insert.insert();
       }else if(fnKey==2) {
    	   list.list();
       }else if(fnKey==3) {
    	   update.update();
       }else if(fnKey==4) {
    	   delete.delete();
       }else if (fnKey==0) {
          System.out.println("프로그램을 종료합니다.");
       }else {
          System.out.println("잘못된 번호입니다 다시 입력하세요.");
       }
    }while(fnKey != 0);
	}
 }




