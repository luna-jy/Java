package string;

public class StringMain {
	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "자바";
		
		//"자바"라는 문자열 데이터가 존재하는 주소를 참조
		if (str1 == str2 ) System.out.println("같은 인스턴스");
		else System.out.println("다른 인스턴스");
		// str1 ="자바", str2="자바" 같은 이유 : 똑같은 데이터가 있으면 새로 생성하지 않고 주소를 공유함 =>주소값 동일하게 참조 =>같은 인스턴스
		
		
		
		int no1  = 10, no2 = 10;
		if( no1 == no2) System.out.println("같은 값");
		else System.out.println("다른 값");
		
		String str3 = new String("자바");
		String str4 = new String("자바");

		
			
			
		if (str3 == str4 ) System.out.println("같은 인스턴스"); 
		else System.out.println("다른 인스턴스");
		
		//문자열이 같은 값인지 비교하려면 equals 메소드 사용한다 
		if(str3.equals(str4))
			System.out.println("같은 문자열");
		else System.out.println("다른 문자열");

	
	}//main()
}
