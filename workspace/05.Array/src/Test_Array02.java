import java.util.Arrays;

public class Test_Array02 {
	public static void main(String[] args) {
		//초기화된 배열 (intArray[])에서 홀수의 합 (oddSum)과 짝수의 합(evenSum)을 구하여 출력하시오.
		int[]intArray;
		intArray= new int[]{3,6,1,8,4,2,5,7,9};
		
		//int[]intArray;
		//intArray= new int[]{3,6,1,8,4,2,5,7,9};
		//=int[]intArray1 = new int[]{3,6,1,8,4,2,5,7,9};
 		//=int[]intArray2 = {3,6,1,8,4,2,5,7,9};
		
		int oddSum= 0, evenSum=0;
			
		
		for (int i=0; i < intArray.length; i++) {
		
			if(intArray[i]%2!=0) {					//그냥 i가 아니라 배열된 {~} 중 i를 가져오는거니까 i%2 가 아니라 intArray[i]
				oddSum=oddSum + intArray[i];   //oddSum+=intArray[i];
			}else {
				evenSum=evenSum +intArray[i];	 //evenSum+=intArray[i];
			}//if
		}//for
		System.out.println("배열의 원소값 :" +Arrays.toString(intArray)); //배열의 원소 값만 출력해주는 클래스
		System.out.println("홀수의 합 : "+oddSum);
		System.out.println("짝수의 합 : "+evenSum);
		
	}//main
}//class

