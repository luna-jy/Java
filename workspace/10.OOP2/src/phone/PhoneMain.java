package phone;
import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		PhoneDAO dao = new PhoneDAO();
		System.out.println("1.연락처목록");
		Scanner scan = new Scanner(System.in);
		if (scan.nextInt() == 1 ) {
			//연락처 목록 화면 연결
			new PhoneList(scan,dao);
		}
	}//main
}//class
