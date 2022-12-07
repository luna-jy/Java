/*

 [if else문]
 if(){
 A
 }else{
 B
 }
 	:(조건문)이 참이면 A. 거짓이면B. 

 
[if else if문]

if(조건식1){
	조건식1이 참일때 실행되는 문장;
} else if(조건식2){
	조건식2가 참일때 실행되는 문장;
} else if(조건식n){
	조건식n이 참일때 실행되는 문장;
}else{
	거짓일때 실행되는 문장;
} //if
 	★다중if문 : 여러개의 조건을 판단하여, 해당 조건을 만족할 경우 실행
 
 */






public class Review_IF {
	public static void main(String[] args) {
		
	System.out.println("어떤 혜택을 원하세요?");
	char grade='C';
	switch(grade) {
	case 'A' : System.out.println("VVIP 혜택을 받으실 수 있습니다.");
	case 'B' : System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
	case 'C' : System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
	case 'D' : System.out.println("일반 회원 혜택을 받으실 수 있습니다.");break;
	
	default: System.out.println("혜택이 없습니다.");
	}
	System.out.println("감사합니다.");
		
	}//main
}//class

