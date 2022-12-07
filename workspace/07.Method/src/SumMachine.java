import java.util.Scanner;

public class SumMachine {
//시작값(startNum)과 종료값(endNum)을 입력 받은 후, 
//시작값부터 종료값까지의 누적합을 구하고 출력하는 메소드를 호출 : makeSum()
	public static void main(String[] args) {	
		Scanner scanner= new Scanner(System.in);
		System.out.println("시작값을 입력하세요 : ");
		int startNum = Integer.parseInt(scanner.nextLine());
		System.out.println("종료값을 입력하세요 : ");
		int endNum = Integer.parseInt(scanner.nextLine());
		scanner.close();
	
		//makeSum(startNum,endNum); //②makeSum메소드에 static 지우면 오류남
		SumMachine sm=new SumMachine();//③SumMachine 객체 생성
		sm.makeSum(startNum, endNum); //④생성된 객체 안에 있는 sm.makeSum();메소드 호출
}//main()
	
	//시작값부터 종료값까지 누적합 (sum)을 구하고 출력하는 메소드를 정의
	public  void makeSum(int startNum, int endNum) { //①static 제거
		int sum=0;
		for(int i= startNum; i<=endNum; i++) {
			sum+=i;
		}//for
		System.out.println("시작값 : "+startNum);
		System.out.println("종료값 : "+endNum);
		System.out.println("누적합 : "+sum);
	}//makeSum()
}//class
