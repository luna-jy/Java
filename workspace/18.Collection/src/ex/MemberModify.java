package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberModify {
	private Scanner scan;
	private ArrayList<MemberDTO> list;
	
	MemberModify(Scanner scan, ArrayList<MemberDTO> list){
		this.scan = scan;
		this.list = list;
	}
	
	void display(int no, MemberView view, MemberList members) {
		//회원정보수정 입력 화면
		System.out.println("회원정보수정 -----");
		
		System.out.println("1.저장  2.취소");
		int button = scan.nextInt();
		if( button==1 ) {
			//수정입력한 회원정보를 DB(배열)에 변경저장한다.			
			
			//저장후 회원정보 화면으로 연결
			view.display(no, this, members);
		}else if( button==2 ) {
		}
		System.out.println();
		
	}
}
