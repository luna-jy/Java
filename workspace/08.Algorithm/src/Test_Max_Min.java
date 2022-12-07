import java.util.Arrays;
import java.util.Scanner;

public class Test_Max_Min {
	//입력하고자 하는 숫자의 개수를 입력받은 후, 배열arr[]을 생성하고
	//배열arr[]의 크기에 맞게 임의의 정수를 입력받아 배열에 할당 한 후 리턴하는 메소드 호출 : getInput()
	//배열arr[]의 최대값(max)을 구하여 리턴하는 메소드를 호출: get MaxMachine()
	//배열arr[]의 최소값(min)을 구하여 리턴하는 메소드를 호출: get MinMachine()
	//배열의 원소값과 최대값, 최소값을 출력하는 메소드를 호출 : display()
	
	public static void main(String[] args) {
		Test_Max_Min test= new Test_Max_Min();
		int[]arr=test.getInput();
		int max=test.getMaxMachine(arr);
		int min=test.getMinMachine(arr);
		test.display(arr,max,min);
	}//main
	
	public int[]getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력할 수의 개수를 입력하세요 : ");
		int cnt= Integer.parseInt(scanner.nextLine());
		int[] arr= new int[cnt];
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1)+"번째 정수를 입력하세요 :");
			arr[i]=Integer.parseInt(scanner.nextLine());
		}//for
		System.out.println("입력이 완료되었습니다.");
		scanner.close();
		return arr;
	}//getInput
	
	public int getMaxMachine(int[]arr) {
		int max =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) { 
			max= arr[i];
			}//if
		}//for
		return max;
	}//getMaxMachine

	public int getMinMachine(int[]arr) {
		int min =arr[0];
		for (int i = 0; i < arr.length; i++) {	
			if(min > arr[i]) { 
				min= arr[i];
			}//if
		}//for
		return min;
	}//getMinMachine
		
	
	public void display(int arr[], int max, int min) {
		System.out.println("입력한 수의 목록 : "+Arrays.toString(arr));
		System.out.println("최대값: "+ max);
		System.out.println("최소값: "+ min);
	}//display
	
}//class
