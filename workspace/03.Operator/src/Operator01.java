public class Operator01 {
	public static void main(String[] args) {
		//산술 연산자 : +,-,*,/ ▶ 수학식에서 다루는 사칙연산과 동일
		//나머지 연산 : % ▶짝수/홀수,배수의 판단에 사용 → 조건문에 활용
		int num1 = 10; //정수형 변수 num1을 선언하고 값(10)을 할당 ▶ 초기화
		int num2 = 3; //정수형 변수 num2를 선언하고 값(3)을 할당 ▶ 초기화

		int addResult = num1+num2; //덧셈 
		int subResult = num1-num2; //뺄셈
		int mulResult = num1*num2; //곱셈
		int divResult1 = num1/num2; //나눗셈(주의: 나눗셈의 연산 결과는 실수가 나올 수 있다)
		double divResult2 = num1/num2; //연산의 결과값을 double로 받는다.
		double divResult3 = (double)num1/num2; //연산전에 타입변환 (Casting) : int→double
		int modResult = num1%num2; //나머지
		
		System.out.println("덧셈 : "+ addResult);   //출력값 : 13
		System.out.println("뺄셈 : "+ subResult);   //출력값 :  7
		System.out.println("곱셈 : "+ mulResult);   //출력값 : 30
		System.out.println("나눗셈1 : "+divResult1);   //출력값 : 3 
		System.out.println("나눗셈2 : "+divResult2);   //출력값 : 3.0
		System.out.println("나눗셈3 : "+divResult3);   //출력값 : 3.33333
		System.out.println("나머지 : "+modResult);   //출력값 : 1

		int x= 5, y=3; //변수의 선언+할당, 초기화, 나열
		System.out.println("x + y = "+x+y); //x+y=53 ▶ 결합(Concatenation)
		System.out.println("x + y = "+(x+y)); //x+y=8 ▶ 괄호()는 최우선 순위를 갖는 연산자
		System.out.println(x+y+"=x+y"); //8=x+y ▶ 문자열 출력 전에는 덧셈
		System.out.println("x-y=" +  (x-y)); //x-y = 2 ▶ 출력문에서 +연산의 개념
		
		
	}//main()
}//class
