package ex01;

public class ThreadMain01 {
	public static void main(String[] args) {
		
		//1.알파벳 출력하기 	-> run()안에 넣었으니까 필요 없음. 	
//		for (char alphabet = 'A'; alphabet <='Z'; alphabet ++ ) {
//			System.out.println(alphabet);
//		}
		AlphabetThread alphabet = new AlphabetThread(); 
		alphabet.start();  //4.start 메소드 로 호출해서 시작.
		
		//2. 숫자를 1~20 까지 출력하기 
//		for (int no = 1; no <= 20; no++) {
//			System.out.print(no);		
		DigitThread digit = new DigitThread();
		digit.start();
		
		//thread 객체를 여러개 생성하면 
		//여러개의 thread를 각각 실행할 수 있다. 		
		DigitThread digit2 = new DigitThread();
		digit2.start();
		
		System.out.println("Main Thread");
		}
		
	}

