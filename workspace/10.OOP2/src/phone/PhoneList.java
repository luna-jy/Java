package phone;
import java.util.Scanner;

public class PhoneList {
	//Data 목록을 조회해와서 전화번호 목록을 출력한다 
	private Scanner scan;
	private PhoneDAO dao;
	PhoneList(Scanner scan, PhoneDAO dao){
		this.scan = scan;
		this.dao = dao;
		display();
	}
	void display() {
		
		//data목록을 조회해온다.
		PhoneDTO[] list = dao.getPhoneList();

		boolean exist = false;
				//전화번호 목록을 출력한다. 
//		list[0]= new PhoneDTO("01012345678","홍길동");
//		list[1]= new PhoneDTO("01078945612", "심청");
		
		for(int idx=0; idx<list.length; idx++) {
			if (list[idx]==null) continue;
			System.out.printf("%d.%s\n", idx+1, list[idx].getName());
			if(exist == false) exist = true;
		}
		if( !exist ) {
			System.out.println("등록한 연락처가 없습니다.");
			System.out.println("1.연락처 등록하기");
			int no = scan.nextInt();
			if (no == 1) {
				new PhoneNew(scan,dao);
			}
		}else {
			System.out.print("연락처 보기 : ");
			int no = scan.nextInt();
			new PhoneDetail (no, dao);
		}
	}
}//class
