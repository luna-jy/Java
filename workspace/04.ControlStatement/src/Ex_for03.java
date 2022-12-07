public class Ex_for03 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 3의 배수를 출력하시오.
		//단 ,한 줄에 5개의 값을 출력하시오. :println() →print(0, printCnt(출력횟수)
		int printCnt =0; //출력횟수를 저장할 변수를 초기화
		for(int i=1;i<=100;i++) { //반복변수 i를 1부터 100까지 1씩 증가하면서 반복
			if(i%3==0) { //3의 배수이면
				System.out.print(i+"\t"); //i값 출력
				printCnt++; //출력횟수를 1씩 증가
			if(printCnt%5==0) { //출력횟수가 5의 배수이면 (5번 출력되면)
				System.out.println(); //줄바꿈(빈줄삽입)
				}//if
			}//if
		}//for
	}//main
}//class
