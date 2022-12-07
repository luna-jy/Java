import java.util.Scanner;

public class Test_Method02 {
	//임의의 정수 2개를 입력받아 
	//두 정수의 합을 구하여 리턴하는 메소드를 호출
	//리턴받은 결과를 출력 
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		//두개의 정수를 입력받는다. 
		/**
		 [기존 작성 코드]
		  System.out.print("첫번째 정수 :");
		int num1= Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 정수 :");
		int num2= Integer.parseInt(scanner.nextLine());
		*/
		
		//입력값이 잘못되었을 경우 예외 처리를 한 코드
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
	
	//getSum() 메소드를 호출하고 결과를 리턴받는다. 
		int sum=getSum(num1,num2);
	
	//결과를 출력한다.	
		System.out.println("첫번째 정수 : "+num1+", 두번째 정수 : "+num2);
		//System.out.println("두 정수의 합 : "+sum);
		System.out.println("두 정수의 합: "+ getSum(num1,num2)); /*리턴문 있는경우 바로 getSum가능 */
	}//main()
	//두개의 정수를 전달받아  합계sum를 구하여 리턴하는 메소드를 정의 
	public static int getSum(int num1,int num2) {
		//int sum= num1+num2;
		//return sum;	
		return num1+num2;
	}//getSum()
	
}//class
