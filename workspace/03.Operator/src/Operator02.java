public class Operator02 {
	public static void main(String[] args) {
		//증감 연산자 : 변수의 값을 1씩 증가(++), 감소(--) ▶반복문에서 활용
		//연산의 위치가 변수의 앞인지 뒤인지에 따라 결과값이 다르다.
		//단항 연산 : 변수 자기 자신이 연산을 수행하고 결과를 받는다
		int num1 = 0;
		int num2 = 10;
		
		
		System.out.println("++num1 : " + (++num1)); //출력값 : 1
		System.out.println("num1 : " + num1); //출력값 : 1
		System.out.println("--num2 : " + (--num2)); //출력값 : 9
		System.out.println("num2 : " + num2); //출력값 : 9
		
		System.out.println(); //빈줄 삽입
		
		int num3 = 0;
		int num4 = 10;
		System.out.println("num3++ : " + (num3++)); //출력값 : 0
		System.out.println("num3 : " + num3); //출력값 : 1
		System.out.println("num4-- : " + (num4--)); //출력값 : 10
		System.out.println("num4 : " + num4); //출력값 : 9
		
		
		//X=5, Y=10일 경우, 'x++ + ++x + y++'의 결과값과 
		//연산이 수행된 후 'x+y'의 결과값은?
		int x= 5, y= 10;
		
		
		System.out.println("x++ + ++x + y++ : " + (x++ + ++x + y++));
		/*
		 x++ : 출력 ) 5 . 메모리 ) 6
		 ++x : 출력 ) 7 . 메모리 ) 7
		 y++ : 출력 ) 10. 메모리 ) 11	
		 x++:5 ++x:7 y++:10
	 	 */
				
		System.out.println("x+y : " + (x+y)); // x= 7 , y= 11
		
		
		
	}//main()
}//class
