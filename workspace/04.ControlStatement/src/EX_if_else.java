public class EX_if_else {
	public static void main(String[] args) {
		int num=9;
		System.out.println("입력값 : " + num);
		if(num%2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		} else {
			System.out.println(num + "는 홀수입니다.");
		}//if
	}//main()
}//class





/*
★블록 if문 : 조건을 판단하여 참일때 또는 거짓일때의 명령을 실행 

if(조건식){
	참일때 실행되는 문장; 
} else{
	거짓일때 실행되는 문장;
}//if
*/