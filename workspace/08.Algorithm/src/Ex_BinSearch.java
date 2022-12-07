import java.util.Arrays;
import java.util.Scanner;

public class Ex_BinSearch {
	//이진검색 (Binary Search) : low, middle, high 값을 사용
	//찾고자하는 데이터를 중앙에 위치한 중간값과 비교하는 방법
	//데이터 목록은 반드시 사전에 ★ 오름차순★ 으로 정렬되어 있어야 한다. 
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100} ; //데이터 목록이 저장된 배열(오름차순으로 정렬)
		
		Ex_BinSearch ex = new Ex_BinSearch();
		int searchNumber = ex.getSearchNumber();
		int position = ex.getBinSearch(arr,searchNumber);
		ex.display(arr, searchNumber, position);
	}//main()
	
	
	//찾는 수를 입력받은 후 리턴
		public int getSearchNumber() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("찾는 수를 입력하세요 : ");
			int searchNumber = Integer.parseInt(scanner.nextLine());
			scanner.close();
			return searchNumber;
		}//getSearchNumber()

		//이진 검색
		private int getBinSearch(int[] arr, int searchNumber) {
			int position = -1;
			int low = 0, middle = 0, high = arr.length -1;
			while(low<=high) {
				middle = (low + high)/2 ; //중간값이 저장된 배열의 index
				if(arr[middle]==searchNumber) {
					position = middle + 1; //검색 성공
					break;
				}else if (arr[middle]<searchNumber){
					low = middle +1; // low 포인터 변경 : 중간값을 기준으로 왼쪽 부분을 제외 
				}else {
					high = middle -1;  // high 포인터 변경 : 중간값을 기준으로 오른쪽 부분제외
				}
			}//while
			return position;
		}//getBinsearch()
//출력
		public void display(int[] arr, int searchNumber, int position) {
			System.out.println("데이터 목록 : " + Arrays.toString(arr));
			if(position==-1) {
				System.out.println("찾는 수는" +searchNumber+"이며,목록에 없습니다");
			}else {
				System.out.println("찾는 수는" +searchNumber+"이며,"+position+"번째에 있습니다.");
			}//if
		}//display()
}//class
