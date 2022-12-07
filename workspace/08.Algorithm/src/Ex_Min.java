import java.util.Arrays;

public class Ex_Min {
	//초기화된 배열(arr)의 원소값의 최소값을 구하여 리턴하는 메소드를 호출 : getMIn()
	//배열의 원소값과 최소값의 결과를 출력하는 메소드를 호출 : display()
	
	public static void main(String[] args) {
		int[] arr= {3,2,4,1,5};
		
		Ex_Min ex= new Ex_Min();
		int min= ex.getMin(arr);
		ex.display(arr,min);
	}//main
	public int getMin(int[]arr) {
		int min =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}//if
		}//for
		return min;
	}//getMin
	public void display(int[] arr, int min) {
		System.out.println("배열의 원소값: " +Arrays.toString(arr));
		System.out.println("원소의 최소값: " +min);
	}//display
	
}//class

