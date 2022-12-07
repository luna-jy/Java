public class Test_for01 {
	public static void main(String[] args) {
	//1부터 10까지의 정수 중에서 홀수만 출력 : for(반복), if(홀수 판단)
	//단, 한 줄로 출력하시오 : println() → print()
		for(int i=1;i<=10; i++) { //반복변수 i를 1부터 10까지 1씩 증가하면서 반복
		if(i%2==1) { //i를 2로 나눈 나머지가 1이면 (홀수)
			System.out.print(i+"\t"); //i값을 출력
		}//if
		
	}//for
	}//main()
}//class
