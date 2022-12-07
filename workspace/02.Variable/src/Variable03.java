public class Variable03 {
	public static void main(String[] args) {
		//정수형 데이터 타입 :  byte(1), short(2), int(4), long(8)
		byte num1 = 100; // 1byte = 8bit : -128 ~ 127
		System.out.println("변수 num1의 값 : "+num1);
		
		short num2 = 10000; // 1short = 2byte = 16bit : -32,768 ~ 32,767
		System.out.println("변수 num2의 값 : "+num2);
		
		int num3 = 100000; // 1int = 4byte = 32bit : -2,147,483,648 ~ 2,147,483,647
		System.out.println("변수 num3의 값 : "+num3);
		
		long num4 =1234567890123456789L; // 1long = 8byte ▶ 값을 할당할 때 반드시 끝에 접미사 L(l)을 붙인다. 
		System.out.println("변수 num4의 값 : "+num4);
		
		
	}//main()
}//class
