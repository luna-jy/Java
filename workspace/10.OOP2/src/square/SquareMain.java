package square;
public class SquareMain {
 public static void main(String[] args) {
	 
try {	 
Square s1 =new Square(10,5) ;
gets1(s1);
}catch(Exception e) {
	System.out.println(e.getMessage());
}
System.out.println();	
try {
Square s2 =new Square(-5,10) ;	
gets2(s2);
}catch(Exception e) {
	System.out.println(e.getMessage());
}

}//main()
 
static void gets1 (Square s1) {	
	 System.out.printf("너비 : %d \t",s1.width);
	 System.out.printf("높이 : %d \n",s1.height);
	 System.out.printf("넓이 : %d \t" ,s1.getarea()); //넓이 메소드 호출
	 System.out.printf("둘레 : %d \n" ,s1.getaround()); //둘레 메소드 호출

}
static void gets2 (Square s2) {	
	System.out.printf("너비 : %d \t",s2.width);
	System.out.printf("높이 : %d \n",s2.height);
	System.out.printf("넓이 : %d \t",s2.getarea()); //넓이 메소드 호출
	System.out.printf("둘레 : %d \n" ,s2.getaround()); //둘레 메소드 호출
	
}




}//class()
