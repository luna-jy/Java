import java.text.DecimalFormat;
import java.util.Scanner;

public class Test_Method03 {
	//임의의 정수 2개를 입력받아 (num1, num2) ▶Scanner (입력)
	//사칙연산을 수행하는 메소드를 호출 : add(), sub(), mul(), div()
	//결과값은 리턴받아 출력하시오. 
	//단, 나눗셈의 결과는 실수 형태로 출력 ▶double 타입으로 casting   (double)
	//단, 나눗셈의 결과는 소수 둘째자리까지 표시 ▶ DecimalFormat Class(표시형식)
	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		while(true) {
			try {
				System.out.print("첫번째 정수 :");
				num1= Integer.parseInt(scanner.nextLine());
				System.out.print("두번째 정수 :");
				num2= Integer.parseInt(scanner.nextLine());
				break;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("입력값이 잘못 되었습니다!");
				continue;
			}//try
		}//while		
		scanner.close();
		
		
		//출력		
		int addResult = add(num1,num2);
		
		System.out.println("덧셈의 결과: "+ add(num1,num2));
		System.out.println("뺄셈의 결과: "+ sub(num1,num2));
		System.out.println("곱셈의 결과: "+ mul(num1,num2));
		System.out.println("나눗셈의 결과: "+ div(num1,num2));
		System.out.println("나눗셈의 결과: "+ divFormat(num1,num2));
	} //main()

	
	//메소드 정의 : add(), sub(), mul(), div()
	public static int add(int num1, int num2) {
		return num1+num2;
	}//add()
	public static int sub(int num1, int num2) {
		return num1-num2;
	}//sub()
	public static int mul(int num1, int num2) {
		return num1*num2;
	}//mul()
	public static double div(int num1, int num2) {
		return (double) num1/num2;
	}//div()
// 출력되는 표시형식을 변경하는 메소드 
	public static String divFormat(int num1, int num2) {
		DecimalFormat df = new DecimalFormat("0.00");
		//double result =(double)num1/num2;
		//return df.format(result);
		return df.format((double)num1/num2);
	}//divFormat()




}//class




/* 
DecimalFormat Class :출력되는 표시형식을 변경   #, 0 사용  / 타입의 속성은 String으로 변환된다.

# : 의미없는 0값은 표시하지 않는다. 

0 : 0의 개수만큼 화면에 표시
===================================================================
3.14	##.###	3.14
3.14	00.000	03.140
0.45	#.#		.5  (반올림)
0.45	0.0		0.5
===================================================================
★ 0.00 ▶ 소수 둘째자리까지 표시  :3.40
★ #,##0 ▶ 천 단위 구분기호 표시 : 1,234
★ ￦#,##0 ▶ 통화기호 표시 : ￦1,000,000 (통화기호는 ㄹ+한자)
*/