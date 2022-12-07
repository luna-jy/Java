public class Operator08 {
	public static void main(String[] args) {
		//Escape Sequence : 프로그램에서 사용되는 특수기호 연산자 ▶ 출력문
		//역슬래쉬(\)를 먼저 입력하고 사용한다. 
		//코딩 후 실행할 때 가급적이면 CMD에서 실행
		// 1.*.class 파일이 있는 위치(폴더)주소를 복사▶ D:\Study_Java\workspace\03.Operator\bin
		// 2.CMD(명령프롬프트)창을 실행▶Windows Logo Key + R >cmd 
		// 3.드라이브 경로 변경▶d:
		// 4.디렉토리(폴더) 변경 ▶cd D:\Study_Java\workspace\03.Operator\bin
		// 5.*.class 실행 ▶java Operator08
		System.out.println("1. HelloWorld");
		System.out.println("2. Hello"+"\t"+"World"); // \t : Tab →일정 간격 띄어쓰기
		System.out.println("3. Hello\tWorld"); //문자열 출력문 안에서 연결하여 사용 가능
		System.out.println("4. Hello"+"\b"+"World"); // \b : Back Space 	 :cmd 창이 옳은 표시
		System.out.println("5. Hello"+"\r"+"World"); // \r : Carriage Return(행의 처음으로 커서를 이동)	:cmd 창이 옳은 표시
		System.out.println("6. Hello"+"\n"+"World"); // \n : New Line(줄바꿈)
		System.out.println("7. Hello"+"\'"+"World"); // \' : 홑따옴표를 표시 
		System.out.println("8. Hello"+"\""+"World"); // \" : 쌍따옴표를 표시
		System.out.println("9. Hello"+"\\"+"World"); // \\ : 역슬래쉬 기호를 표시
	
		
		System.out.println("\n번호"+"\t"+"이름"+"\t"+"주소");
		System.out.println("1"+"\t"+"홍길동"+"\t"+"광주광역시 서구 농성동");
		System.out.println("100"+"\t"+"허준"+"\t"+"광주시 서구 경열로3");
		
		
		// 입력 값 한 줄 띄기 방법 : \n 붙이거나 ,  System.out.println();
				
		
		System.out.println("\n나는 자바를 공부하고있습니다!");
		System.out.println("나는 '자바'를 공부하고있습니다!");
		System.out.println("나는 \"자바\"를 공부하고있습니다!"); 
		System.out.println("나는 "+"\""+"자바"+"\""+"를 공부하고있습니다!"); // 따옴표 앞에 \ 붙이면 쌍따옴표로도 출력 가능 ("\"" = " )
		
		
		
	}//main()
}//class
