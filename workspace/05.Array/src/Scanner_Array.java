import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 학생의 인원수를 입력하세요 : ");
		int cnt = Integer.parseInt(scanner.nextLine());
		String[] name = new String[cnt];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요 : ");
			name[i] = scanner.nextLine();
		}//for
		scanner.close();
		
		System.out.println("이름 : " + Arrays.toString(name));
	}//main()
}//class