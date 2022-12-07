import java.util.Random;
import java.util.Scanner;


public class HighLowGame {
	public static void main(String[] args) {
	
		
		//1~100 사이의 임의의 정수값을 할당하여 comNumber 변수에 저장 : random 객체
		 Random random= new Random();//random객체 생성
		 int comNumber=random.nextInt(100) + 1; //1~100사이의 임의의 정수값 할당
		//System.out.println("conNumber: " +  comNumber);  :테스트 코드 주석 처리
		 
		//사용자로부터 숫자를 입력받기 위한 준비 : scanner
		Scanner scanner= new Scanner(System.in);
		int userNuber = 0; //사용자가 입력한 값을 저장 할 변수를 초기화
		int count = 0; //시도 횟수를 저장할 변수를 초기화
		
		
	
		//게임시작 : comNumber와 userNumber를 비교하여 메세지  출력 
		do {
			System.out.println("1부터 100사이의 정수값을 입력하세요  :");
			userNuber = Integer.parseInt(scanner.nextLine());
			count++;
			
			
		if(userNuber>comNumber) {
			 System.out.println("더 작은 수를 입력하세요.");
			 System.out.println("시도 횟수는 "+count+"번 입니다.\n");
			 continue;
		}else if (userNuber<comNumber) {
			System.out.println("더 큰 수를 입력하세요.");
			System.out.println("시도 횟수는 "+count+"번 입니다.\n");
			continue;
			 
		}else {
			System.out.println("맞췄습니다.");
			System.out.println("시도 횟수는 "+count+"번 입니다.\n");
			break;
		}

		}while(true);
		
				 	
	}//main	
}//class



/*[출력예시] 
comNumber :1~100사이의 임의 정수값 할당 →70  
1부터 100사이의 정수값을 입력하세요  : 50		; 
더 큰 수를 입력하세요								if(int comNumber >1 && int comNumber <100 ){
														}else{
														}
시도 횟수 : 1번

1부터 100사이의 정수값을 입력하세요  : 80
더 작은 수를 입력하세요
시도 횟수 : 2번

1부터 100사이의 정수값을 입력하세요  : 70
맞췄습니다
시도 횟수 : 3번


*/