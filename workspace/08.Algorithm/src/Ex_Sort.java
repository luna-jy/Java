import java.util.Arrays;

public class Ex_Sort {
	//정수형 배열 (arr[])의 원소값을 오름차순으로 정렬하고 결과를 리턴받는 메소드를 호출 : getAscSort
	//정수형 배열 (arr[])의 원소값을 내림차순으로 정렬하고 결과를 리턴받는 메소드를 호출 : getDescSort
	//결과를 출력하는 메소드를 호출 :display()
	public static void main(String[] args) {
		int[]arr= {3,2,4,1,5};		 //정수형int 배열 arr[]을 선언하고 = 값을 할당{} : 초기화
		System.out.println("배열의 원소값 : "+Arrays.toString(arr));
		Ex_Sort ex= new Ex_Sort(); //객체 생성
				
		arr=ex.getAscSort(arr);
		System.out.println("오름차순 정렬 : "+Arrays.toString(arr));
		arr=ex.getDescSort(arr);
		System.out.println("내림차순 정렬 : "+Arrays.toString(arr));
		
		Arrays.sort(arr); //오름차순 정렬 (원소값이 하나씩 나열된경우만 사용)
		System.out.println("배열의 원소값 : "+Arrays.toString(arr));
	}//main()
	
	//오름차순 정렬
	public int[] getAscSort(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {  // 선택정렬: i=0 , j= i+1
				if(arr[i] > arr[j]) {  //오름차순 :i>j  내림차순:i<j
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for j
		}//for i
		return arr;		
	}//getAscSort()
	
	//내림차순 정렬
	public int[] getDescSort(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) { 
				if(arr[i] < arr[j]) {  
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for j
		}//for i
		return arr;	
		
	}//getDescSort()
	
	//출력메소드
	public void display() {
		
	}//display()
	
}//class
