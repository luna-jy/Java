import java.text.DecimalFormat;
import java.util.Scanner;

public class Test_Method04 {
//Test_Method03.java의 코드를 간소화
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = getNumber(scanner);
		int num2 = getNumber(scanner);
		scanner.close();
		display(num1,num2);
	}//main()
	
//입력 메소드 
	public static int getNumber(Scanner scanner) {
		int num;
		while(true) {
			try {
				System.out.print("정수를 입력하세요: ");
				num = Integer.parseInt(scanner.nextLine());
				break;
			} catch (Exception e) {
				System.out.print("입력값이 잘못 되었습니다!\n");
				continue;
			}//try
		}//while
		return num;
	}//getNumber()
	
	
//출력 메소드
	public static void display(int num1, int num2) {
		System.out.println("첫번째 정수 : "+num1);
		System.out.println("두번째 정수 : "+num2);
		System.out.println("덧셈의 결과: "+ add(num1,num2));
		System.out.println("뺄셈의 결과: "+ sub(num1,num2));
		System.out.println("곱셈의 결과: "+ mul(num1,num2));
		System.out.println("나눗셈의 결과: "+div(num1,num2));
	}//display()
//사칙연산을 수행하고 결과를 리턴하는 메소드 
	public static int add(int num1, int num2) {
		return num1+num2;
	}//add()
	public static int sub(int num1, int num2) {
		return num1-num2;
	}//sub()
	public static int mul(int num1, int num2) {
		return num1*num2;
	}//mul()
	public static String div(int num1, int num2) {
		DecimalFormat df = new DecimalFormat("0.00");	
		return df.format((double)num1/num2);
	}//div()
}//class
