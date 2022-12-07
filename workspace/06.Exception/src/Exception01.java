import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {
public static void main(String[] args) {
	//1.3개의 길이(크기)를 갖는 정수형 배열(intArray[])을 선언 및 생성한 후 
	//2.임의의 값 (10,20,30)을 할당하고 출력
	int [] intArray = new int[3]; //배열을 선언 = 배열을 생성 ;
	intArray[0] = 10;
	intArray[1] = 20;
	intArray[2] = 30;
	//intArray[3] = 40; //ArrayIndexOutOfBoundsException  :미확인 예외 (실행예외)
	
	System.out.println("intArray[0]의 값: "+intArray[0]);
	System.out.println("intArray[1]의 값: "+intArray[1]);
	System.out.println("intArray[2]의 값: "+intArray[2]);
	//System.out.println("intArray[3]의 값: "+intArray[3]); //예외 발생 → 프로그램 강제종료
	
	//String str1 = 100; //에러 
	String str1 = "100"; //문자 100을 초기화
	System.out.println("str1의 값 : " +str1);  //문자 100
	
	int pstr1 = Integer.parseInt(str1); //문자 100을 정수타입으로 변환 ▶Wrapper Class 
	System.out.println("pastr1의 값 : "+pstr1); //정수 100

	String str2 = "100a";
	System.out.println("str2의 값 : "+str2);
	//int pstr2 = Integer.parseInt(str2); //NumberFormatException :미확인 예외(실행예외) 발생
	//System.out.println("pstr2의 값 : "+pstr2);
	
	int x=10;
	int y=0;
	System.out.println("y/x: "+ (y/x));  //출력 값 : 0
	//System.out.println("x/y: "+ (x/y));  //ArithmeticException: 미확인 예외(실행예외) 발생

	//"abc.txt"파일을 읽어들이시오 :  FileInputStream Class (IO project)→확인 예외 발생 : 반드시 예외처리 할 것!
	try {
		FileInputStream fis = new FileInputStream("abc.txt");
	} catch (FileNotFoundException e) {
		e.printStackTrace(); //예외가 발생한 시점을 메모리에서 추적하여 상세하게 출력
		System.out.println(e.getMessage()); //예외 메세지만 간략하게 출력 
		System.out.println("해당 파일이 존재하지 않습니다."); //예외 메세지를 직접 작성		
	}//try
	
	/*
	 try{
	 	예외가 발생할 가능성이 있는 코드(정상코드)
	 }catch(exception e){
	 	예외가 발생할 시 처리할 코드(대안코드)
	 }finally{
	 	무조건 실행되어야 할 코드 → 생략가능
	 }//try
	 
	 
	 */
	
	
	
	
	}//main()
}//class
