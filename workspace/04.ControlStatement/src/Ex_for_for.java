public class Ex_for_for {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) { //for i : 1부터 5까지 동작
			for(int j = 1; j<=i; j++) { //for j : 1부터 i까지 동작
				System.out.println("i값 :"+i+",j값 : "+j);
			} // for j
		}// for i
		
		/* 
		 ○중첩 반복문 (이중FOR문)을 이용한 별 찍기
		 ★
		 ★★
		 ★★★
		 ★★★★
		 ★★★★★
		 */
		 for(int i = 1; i<=5; i++) { 
			   for(int j = 1; j<=i; j++) { 
			    System.out.print("★");
			   } // for j
			   	System.out.println();
			} // for i
		 System.out.println();
		 
		 
		
		
		
		
		
		
		
		
		
		
	}//main()
}//class


/*
★중첩 반복문  :반복문 내에 다른 반복문이 존재

for (초기값; 조건식; 증감값) {
	 for(초기값;조건식;증감값){
		실행문(반복문);
	 } //안쪽 for
} //바깥쪽 for




*/