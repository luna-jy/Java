package wrapper;

import java.sql.Date;

public class WrapperMain {
	public static void main(String[] args) {
		
		Date birth = Date.valueOf("2022-09-30"); //String ->Date
		
		int sum = 0;
		for (String data : args  ) {
			//String -> int : Integer.parseInt(), Integer.valueOf 
			sum +=Integer.parseInt(data);
			System.out.println(data);
		}
		System.out.println("합 : " + sum);
		System.exit(0);
		
		String no1 = "10";
		String no2 = "20";
		System.out.println(no1 + no2); //값은 1020 임. 
		

		
		//특정클래스를 사용해야함 (Wrapper class)		
		//byte 변환 가능한 Wrapper class : Byte
		//short   : Short
		//int : Integer
		//long : Long
		//float : Float
		//double : Double 
		//char : Character
		//boolean : Boolean
		
		
		int no = 10; //변환하려면
		Integer no3 = new Integer(no);
		System.out.println(no3); 
		System.out.println("--------------------");
		//no1 : String -> Integer
		//Integer 와 같은 Wrapper 클래스가 문자열을 숫자로 변환하는 기능(=메소드)을 갖고있다. 
		// = Wrapper클래스에는 변환가능한 메소드 포함  (.valueof() )
		Integer s1 =Integer.valueOf(no1);  
		System.out.println("s1:" + s1);
		
		
		int s2 = Integer.parseInt(no2);
		System.out.println("s2:" + s2);
		
		//Integer 타입과 int 타입과의 산술연산
		int s3 = s1 + s2; // Integer타입의 s1  + int 타입의 s2 => int 타입으로 결과 나옴.
							// Auto unBoxing (inter 에서 int로 의 변환)
		//int -> Integer 변환 : Boxing (wrapper class 통해 wrapping 함)
		
		
		
	}
}
