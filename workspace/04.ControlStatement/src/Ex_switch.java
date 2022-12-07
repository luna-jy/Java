
public class Ex_switch {
	public static void main(String[] args) {
		int score=98;
		System.out.println("점수 : "+score);
		
		switch (score) {
		case 100:
			System.out.println("A학점");
			break;
		case 99 :
			System.out.println("A학점");
		case 98 :
			System.out.println("A학점");
		default:
			break;
		} //switch ▶case 비교값을 일일이 작성해야 하는 불편함
		
		int code = 1;
		System.out.println("성별코드 : "+code);
		switch (code) {
		case 1:
			System.out.println("남자입니다.");
			break;
		case 2:
			System.out.println("여자입니다.");
			break;
		case 3:
			System.out.println("남자입니다.");
			break;
		case 4:
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("성별코드가 잘못 입력되었씁니다.");
			break;
		}//switch
	}//main()
}//class

/*
○ 선택문(switch~case) : 다중 if문을 간략하게 표현

switch(기준값){
	 case 값1 :
	 	값1이 참일때 실행되는 문장;
	 	break;
	 case 값2 :
	 	값2가 참일때 실행되는 문장;
	 case 값N : 
	 	 값N이 참일때 실행되는 문장;
	 	 break;
	 default :
	 	 거짓일때 실행되는 문장;
	 	 break;
} //switch	 	 
	-기준값, 비교값(값1,2,N) 은 정수형의 자료여야 한다. 
	-실행문 뒤에는 반드시 break; 입력
	-제한 사항(제약조건)으로 인하여 실무에서는 거의 사용되지 않는다. 
*/