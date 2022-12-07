
public class Ex_if_else_if {
	public static void main(String[] args) {
		//점수(score)가 90이상이면 'A학점', 점수가 90미만이면서 80이상이면 'B학점', 
		//점수가 70이상이면 'C학점', 점수가 60 이상이면  'D학점', 그외의 경우에는 'F학점' 출력
		
		int score=78;
		System.out.println("점수 : "+score);
		
		if(score>=90) {
			System.out.println("학점 : A학점");
		} else if(score>=80) {
			System.out.println("학점 : B학점");
		} else if(score>=70) {
			System.out.println("학점 : C학점");
		} else if(score>=60) {
			System.out.println("학점 : D학점");
		} else {
			System.out.println("학점 : F학점");
		}
		
	}//main()
}//class



/*
★다중if문 : 여러개의 조건을 판단하여, 해당 조건을 만족할 경우 실행

if(조건식1){
	조건식1이 참일때 실행되는 문장;
} else if(조건식2){
	조건식2가 참일때 실행되는 문장;
} else if(조건식n){
	조건식n이 참일때 실행되는 문장;
}else{
	거짓일때 실행되는 문장;
} //if

*/