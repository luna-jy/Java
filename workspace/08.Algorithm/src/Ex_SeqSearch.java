import java.util.Arrays;
import java.util.Scanner;

public class Ex_SeqSearch {
//순차검색(Sequence Search): 데이터를 처음부터 끝까지 검색 :데이터 목록이 소량일 경우 사용
	public static void main(String[] args) {
		int[]arr = {30,90,10,60,20,80,70,50,100,40};
		
		Ex_SeqSearch ex= new Ex_SeqSearch();
		int searchNumber = ex.getSearchNumber();
		
		int position = ex.getSeqSearch(arr, searchNumber);
		ex.display(arr,searchNumber,position);
	
	}//main()


	//찾는 수를 입력받은 후 리턴
	public int getSearchNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾는 수를 입력하세요 : ");
		int searchNumber = Integer.parseInt(scanner.nextLine());
		scanner.close();
		return searchNumber;
	}//getSearchNumber()
	
	//순차 검색 
	public int getSeqSearch(int[]arr,int searchNumber) {
		int position = -1;  //-1은 실패(끝) 의미.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchNumber) { //찾는 데이터가 있다. 
				position = i+1; //찾는 데이터의 위치값을 구한다. 
				break;
			}//if
		}//for i
		return position;
	}//getSeqSearch()

	public void display(int[] arr, int searchNumber, int position) {
		System.out.println("데이터 목록 : " + Arrays.toString(arr));
		if(position==-1) {
			System.out.println("찾는 수는" +searchNumber+"이며,목록에 없습니다");
		}else {
			System.out.println("찾는 수는" +searchNumber+"이며,"+position+"번째에 있습니다.");
		}//if
	}//display()
}//class
