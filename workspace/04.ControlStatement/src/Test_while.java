public class Test_while {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 짝수의 누적합(forevenSum)을 구하여 출력하시오.
		int forevenSum=0;
		for(int i=1; i<=100;i++){
			if(i%2==0) {
				forevenSum+=i;
			}//if
		}//for
		System.out.println("for 짝수의 합:"+forevenSum);
	
		//1부터 100까지의 정수 중에서 짝수의 누적합(whileEvenSum)을 구하여 출력하시오.
		int whileEvenSum=0;
		int i=1;
		while(i<=100) {
			if(i%2==0) {
				whileEvenSum+=i;
			}//if
			i++;
		}//while
		System.out.println("while 짝수의 합:"+whileEvenSum);
	}//main()
}//class
