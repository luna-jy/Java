public class Variable05 {
	public static void main(String[] args) {
		//단일 문자 데이터 타입 : char(2byte) ▶ 하나의 글자만 저장 : UniCode
		//값을 할당할 때는 반드시 홑따옴표를 사용한다. 
		char ch1= 'A'; 
		char ch2= '가'; 
		char ch3= '★'; 
		char ch4= '家'; 
		
		System.out.println("변수 ch1의 값 : "+ch1);
		System.out.println("변수 ch2의 값 : "+ch2);
		System.out.println("변수 ch3의 값 : "+ch3);
		System.out.println("변수 ch4의 값 : "+ch4);
	
		//String : 문자열을 저장할 수 있는 클래스 ▶ 참조형 데이터 타입
		//값을 할당할 때는 반드시 쌍따옴표를 사용한다. 
		String str1 = "ABCD";
		String str2 = "대한민국";
		System.out.println("변수 string 1의 값 : "+str1 );
		System.out.println("변수 string 2의 값 : "+str2 );
	}//main()
}//class
