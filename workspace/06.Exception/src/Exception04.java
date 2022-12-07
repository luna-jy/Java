
public class Exception04 {
	public static void main(String[] args) {
		//1부터 100까지 누적합(sum) 출력 :for (반복)
		int sum=0;
	
		for (int i = 1; i<=100; i++) {
			sum+=i; //sum=sum+i;
		
		//단, 누적합이 906이상이 되면 계산을 중지하고 결과를 출력 : if(조건), break (중지)
			if (sum>=906) {
				System.out.println("누적합이 906이상이 되었습니다.");
				System.out.println("누적합 : "+sum+", i값 : "+i);
			break;
			}//if
		}//for
	//try ~catch 이용하여 예외처리 ▶ throw
	//throw:강제로 예외를 발생시켜 catch 블럭으로 예외를 던진다(넘긴다)
		try {
			int total = 0;
			for(int i = 1; i<=100; i++) {
				total += i ; //total = total +i;
				if (total>=906) {
					System.out.println("누적합 : "+total+", i값 : "+i);
					throw new Exception("누적합이 906 이상이 되었습니다.");
				}//if
			}//for
		} catch (Exception e) {
			e.printStackTrace(); //예외를 상세하게 출력 
			System.out.println(e.getMessage());  //예외 메세지만 출력 
		}//try 
	}//main
}//class
