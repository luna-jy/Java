import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); //입력을 받기 위한 객체 생성
	Random random = new Random(); //무작위로 숫자를 할당하기 위한 객체 생성
	
	while(true) {
	
	//Intro
	System.out.println("게임시작:1,게임종료:-1을 입력하세요 ▶");
	int inputNumber =Integer.parseInt(scanner.nextLine());
	
	//1,-1 이외 숫자가 입력되면 오류메세지 출력하고 재입력
	if(inputNumber !=1 && inputNumber!=-1) {
	 System.out.println("숫자를 잘못 입력하셨습니다!!!");
	 	continue;
	}//if
	//intro 끝
	
	
	//-1이 입력되면 게임을 종료
	if(inputNumber==-1) {
		System.out.println("게임을 종료합니다!!!");
		break;
	}//if
	
	
	//1이 입력되면 게임을 시작: 사용자의 숫자를 무작위로 할당
	System.out.println("주사위 게임을 시작합니다!!!");
	System.out.println("사용자가 주사위를 굴립니다");
	System.out.print("Enter Key를 입력하세요!");
	scanner.nextLine();
	int userNumber=random.nextInt(6) + 1;  //1~6사이의 정수를 무작위로 할당 0부터 시작이므로 +! 해준다.
	
	System.out.println("사용자의 숫자는 "+userNumber+"입니다");
	
		
	System.out.println();
	
	//컴퓨터의 숫자를 무작위로 할당
	System.out.println("주사위 게임을 시작합니다");
	System.out.println("컴퓨터가 주사위를 굴립니다");
	System.out.print("Enter Key를 입력하세요!");
	scanner.nextLine();
	//int comNumber=random.nextInt(6) + 1;  //1~6사이의 정수를 무작위로 할당 0부터 시작이므로 +! 해준다.
	
	
	
	int comNumber= 0;
	if(userNumber ==6) {
		comNumber=6;
	}else {
		comNumber = random.nextInt(6- userNumber)+userNumber;
	}
	System.out.println("컴퓨터의 숫자는 "+comNumber+"입니다");
	
	
	/*
	//사용자의 숫자와 컴퓨터의 숫자를 비교해서 결과를 출력
	if(userNumber>comNumber) {
			System.out.println(("Result: You win!"));
	}else if(userNumber<comNumber) {
			System.out.println(("Result: You Lose!"));
	}else {
		System.out.println("Result: DRAW!");
	}//if
	*/
	System.out.println("=======================================================");
	System.out.println();
	
	
	}//while
	scanner.close();
	
	
	
	}//main()
}//class



/*1. INTRO먼저 작성
 * 2.while 작성+scanner.close
 * 3. //-1 입력+break1
 * 4.//1 입력 */
