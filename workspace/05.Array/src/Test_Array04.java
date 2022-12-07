
public class Test_Array04 {
public static void main(String[] args) {
	String[][]star =new String[5][0];
/*	star[0]=new String[1]; //0번째 행의  열 (1개) 생성
	star[1]=new String[2]; 
	star[2]=new String[3]; 
	star[3]=new String[4]; 
	star[4]=new String[5]; / */
	
	for (int i = 0; i < star.length; i++) {
		//star[i] = new String[i+1];
		star[i]=new String[star.length-i];
		}//for star
	
	//각각의 요소에 ★ 할당 후 출력
	for (int i = 0; i < star.length; i++) {
		for (int j = 0; j < star[i].length; j++) {
			star[i][j] ="★";
		System.out.print(star[i][j]);
		}//for j
	System.out.println();
}//for i
	
}//main
}//class
