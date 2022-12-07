public class Test_if_else {
	public static void main(String[] args) {
		//성별코드(code) 값이 1또는 3이면 '남자', 그 외에는 '여자'로 출력
		int code= 1;
		System.out.println("코드값 : "+code);
		if(code==1 || code==3) {  //비교연산자, 논리연산자(논리합, ||)
			System.out.println("'남자'");
		}else {
			System.out.println("'여자'");
		}//if
		
		
		
		
	}//main()
}//class
