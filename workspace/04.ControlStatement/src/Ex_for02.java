public class Ex_for02 {
	public static void main(String[] args) {
		//1부터 10까지의 누적합을 구하시오. : for (반복)
		int sum = 0; //결과 (누적합)가 저장될 변수를 초기화
		
		for(int i=1; i<=10; i++) { //반복변수 i를 1부터 10까지 1씩 증가하면서 반복
			sum = sum+i;  //누적합 계산 :sum+=i;
			System.out.println(("i값 :" +i+ ",sum값 : "+sum));
		
		}//for
		System.out.println("누적합 :"+sum);
	}//main
}//claass
