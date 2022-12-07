import java.util.Scanner;

public class Ex_Scanner_Login {
	//사용자로부터 아이디(id)와 비밀번호(pw)를 입력받는다. ▶Scanner
	//입력받은 아이디 값이 'admin'이고 , 비밀번호 값이 'java1234^^'이면 '로그인 성공 메세지를 출력하고, ▶if
	//아이디 값 또는 비밀번호 값이 다른 값이 입력되면, '로그인 실패'메시지를 출력하고 재입력 받아 로그인을 실행하시오.▶while,break,continue
	//문자열의 입력은 nextLine()메소드를 사용, 문자열의 비교연산자를 사용할 수 없다. 
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
	while(true) {
		System.out.println("아이디를 입력하세요 : ");
		String id = scanner.nextLine();
		System.out.println("비밀번호를 입력하세요 :");
		String pw = scanner.nextLine();


		
		
		
		if(id.equals("admin")&&pw.equals("java1234^^")) {  //문자열은 equals() 사용 
			System.out.println("로그인 성공");
		break;
		}else {
				System.out.println("로그인 실패\n");
			}//if
		continue;
	}//while
	scanner.close();
	
	}//main()
}//class

/*
 1)Scanner scanner =new Scanner(System.in);
 2)System.out.println("아이디를 입력하세요 : ");
 		String id = scanner.nextLine();
		System.out.println("비밀번호를 입력하세요 :");
		String pw = scanner.nextLine();

 3)	if(id.equals("admin")&&pw.equals("java1234^^")) { 
			}else {
				System.out.println("로그인 실패\n");
			}//if
4)	while(true) {
	참일경우 실행문 아래에 break;
	거짓일 경우 실행문 아래에 continue;
	}//while
	scanner.close();
 */
