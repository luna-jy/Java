import java.util.Scanner;

public class Test_Method05_2 {
//임의의 정수 2개(num1, num2)를 입력받아 
//두 정수 사이의 홀수의 합을 계산하고 리턴하는 메소드 (getOddSum())을 호출
//두 정수 사이의 짝수의 합을 계산하고 리턴하는 메소드 (getEvenSum())을 호출
//결과를 출력하는 메소드(display())를 호출
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1= Integer.parseInt(scanner.nextLine());
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2= Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		if(num1>num2) {
			System.out.println("첫 번째 정수는 작은 수, 두 번재 정수는 큰 수를 입력하세요.");
		}else {
		display(num1,num2);
		}//if
	}//main()	

	public static void display(int num1, int num2) {
		System.out.println("첫 번째 정수 :"+num1);
		System.out.println("두 번째 정수 :"+num2);
		System.out.println("홀수의 합 :"+getOddSum(num1,num2));
		System.out.println("짝수의 합 :"+getEvenSum(num1,num2));
	}//display()
	
	//홀수의 합
	public static int getOddSum(int num1, int num2) {
		int oddSum=0;
		for(int i= num1; i<=num2; i++) {
			if (i%2 !=0){
				oddSum += i;
			}//if
		}//for
		return oddSum;
	}//getOddSum;
			
	//짝수의 합
	public static int getEvenSum(int num1, int num2) {
		int evenSum=0;
		for(int i= num1; i<=num2; i++) {
			if (i%2 ==0){
				evenSum += i;
			}//if
		}//for
		return evenSum;
	}//getOddSum;
	
}//class


/*
[출력예시]
첫 번째 정수를 입력하세요 :
두 번째 정수를 입력하세요 : 

첫 번째 정수 :
두 번째 정수 : 

홀수의 합 : 
짝수의 합 : 
*/