package phone;
import java.util.Scanner;

public class PhoneNew {
	//이름,전화번호,메모를 등록하는 화면
	private Scanner scan; 
	private PhoneDAO dao;
	PhoneNew(Scanner scan,PhoneDAO dao){
		this.scan = scan;
		this.dao = dao;
		display();
	}
void display() {
	System.out.print("이름 : ");
	String name = scan.next();
	System.out.print("전화번호 : ");
	String phone = scan.next();
	System.out.print("메모 : ");
	String memo = scan.next();
	
	PhoneDTO dto= new PhoneDTO(phone,name,memo);
	PhoneDTO[] list = dao.getPhoneList();
	//데이터를 담는 처리시에는 일반적인 배열을 사용한다. 
	//데이터를 접근하기위해 사용시에는 향상된 for문 사용 가능
	for(int idx=0; idx<list.length; idx++) {
		if (list[idx]==null) {
			list[idx] = dto;
			break;
		}
	}
	//연락처 등록 후 연락처 목록을 확인할 수 있도록 
	//연락처 목록 화면을 연결
	new PhoneList(scan,dao);
	
}
	
}//class
