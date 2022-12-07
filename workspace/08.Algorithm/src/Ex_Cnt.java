import java.util.Scanner;

public class Ex_Cnt {
	//두개의 정수를 입력받아 (num1,num2)
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("시작값을 입력하세요 : ");
			int num1= Integer.parseInt(scanner.nextLine());		
			System.out.println("종료값을 입력하세요 : ");
			int num2= Integer.parseInt(scanner.nextLine());		
			scanner.close();
			
			Ex_Cnt ex =new Ex_Cnt();
			int cnt= ex.getCnt(num1,num2);
			ex.display(num1,num2,cnt);
		}//main()	
	
	
	//두 수 사이의 정수의 개수(cnt)를 구하여 리턴하는 메소드를 호출
		public int getCnt(int num1, int num2) {
				int cnt=0; //결과가 저장될 변수  cnt를 선언하고 값을 할당 ->초기화함.
				for(int i= num1; i<=num2;i++) {
					cnt++;	//개수 구하기
					//cnt = cnt+1;
					//cnt+=1;
				}//for
				return cnt; //결과값을 리턴: 리턴타입 변경 (void→int)
		}//getCnt()
		
	//출력 메소드 
		public void display(int num1, int num2, int cnt) {
			System.out.println("시작값 : " +num1);
			System.out.println("종료값 : "+num2);
			System.out.println("두 수 사이의 정수의 개수 : "+cnt);
		}//display()
}//class
