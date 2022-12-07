public class Exception02 {
	public static void main(String[] args) {
	//준비단계 → 가스불 키기 → 요리 시작 → 요리 끝 → 가스불 끄기 → 종료
		try {
			System.out.println("준비단계");
			System.out.println("가스불 키기");
			System.out.println("요리 시작");
			//int result=10/0; //예외 발생  → catch 넘어감 
			System.out.println("요리 끝");
			//System.out.println("가스불 끄기");
			//System.out.println("종료");
		} catch (Exception e) {
			System.out.println("예외 발생!");
			//System.out.println("가스불 끄기");
			//System.out.println("종료");
		} finally {
			System.out.println("가스불 끄기");
			System.out.println("종료");
		} //try 
	
	
	
	}//main()
}//class
