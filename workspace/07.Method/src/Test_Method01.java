/**
 public class Test_Method01 {
 	public static void main(String[] args) {
	
	//1부터 50까지의 누적합 (sum) : num1(1)~num2(50)
	int num1 = 1, num2 = 50;
	int sum=0;
	for(int i = num1;i<=num2; i++) {
		sum+=1; 
	}//for
	System.out.println(num1+"부터"+num2+"까지의 누적합: "+sum);
	
	//51부터 100까지의 누적합(sum) : num3(51)~num4(100)
	int num3=51, num4= 100;
	sum=0;
	for(int i=num3; i<=num4; i++) {
		sum+=i;
	}//for
	System.out.println(num3+"부터"+num4+"까지의 누적합: "+sum);
	}//main()
}//class
*/

public class Test_Method01{
	public static void main(String[] args) {
		int num1=1, num2=50, num3=51, num4=100;
		getSum(num1,num2);	//1~50누적합
		getSum(num3,num4);	//51~100누적합
		getSum(num1,num4);	//1~100누적합		
	}//main
	//두개의 정수를 전달받아 누적합을 계산하고 출력하는 메소드를 정의
	public static void getSum(int x, int y) {
		int sum=0;
		for(int i = x; i<=y; i++ ) {
			sum+=i; 
		}//for
		System.out.println(x+"부터 "+y+"까지의 누적합 : "+sum);
	}//getSum()
}//class
