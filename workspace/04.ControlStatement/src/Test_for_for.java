
public class Test_for_for {
	public static void main(String[] args) {
		
		/* 
		 ○중첩 반복문 (이중FOR문)을 이용한 별 찍기
		 ★★★★★
		 ★★★★
		 ★★★
		 ★★
		 ★
		 */
		 for(int i = 1; i<=5; i++) { 
			    for(int j=5; j>=i; j--) {
			    System.out.print("★");
		 } 
		 System.out.println();
		 }
		
		 for(int i = 5; i>=1; i--) {
			 for(int j = 1; j<=i; j++) {
				 System.out.print("★");
			 }
			 System.out.println();
		 }
		
	}//main
}//class
