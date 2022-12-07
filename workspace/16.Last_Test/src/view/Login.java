package view;

import java.util.Scanner;

import user.UserDAO;
import user.UserDTO;

public class Login {
	private Scanner sc;
	public Login( Scanner sc ){
		this.sc = sc;
	}

public void display() {	
	UserDAO user_dao = new UserDAO();	
	UserDTO dto = null;	
	System.out.println("================================음료관리 시스템================================");
	System.out.println("<1. 회원가입>  					 <2.로그인>");
	switch(sc.nextInt()){
	case (1 ):
		System.out.println("================================회원가입================================");
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("PW : ");
		String pw = sc.next();
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("Email : ");
		String email = sc.next();
		System.out.println("===========================================================================");	 		
		user_dao.User(id, pw, name, email);
		System.out.println("회원가입이 완료되었습니다.");
		View.login.display();
	case(2) :	
			do {
				System.out.println("================================로그인================================");	
				System.out.println("아이디를 입력하세요");
				String login_id = sc.next();
				System.out.println("비밀번호를 입력하세요");
				String login_pw = sc.next();						
				dto = user_dao.login(login_id, login_pw);
				View.user_dto = dto ; 
				
				if(dto != null ) {	
					if(dto.getAdmin().equals("Y") && dto.getPw().equals(login_pw)) {
						System.out.println("관리자모드로 로그인 되었습니다.");
						View.admin.display();
					} else if(dto.getPw().equals(login_pw)){ 
						System.out.println(dto.getId()+"님, 로그인 되었습니다.");			 
						View.user.display();
					}	
				}//if	
			}while(dto == null);
				
				}//switch
	
}//display()
}//login