import java.util.Arrays;

public class ForEach {
	public static void main(String[] args) {
	 
	int [] scores = {95,80,72,89,66};
	
	System.out.println("배열의 원소값: "+Arrays.toString(scores));
	 
	 //배열의 총합(sum) :단순 for문 : [] array 사용
	 int sum = 0;
	 for (int i = 0; i < scores.length; i++) {
		sum+=scores[i]; // sum = sum+scores[i];
	}//for
	 System.out.println("배열의 총합 : "+sum);
	
	 /*배열의 총합 (total) :향상된 for문 : <> collection 사용*/
	 int result =0;
	 for(int i:scores) {
		 result+=i ; //result = result +i;
	 }//for
	 System.out.println("배열의 총합"+result);	 
	}//main()
}//class


/* 
단순 for문:index 필요
for(초기값(시작값);조건식(최종값);증감값){
body(반복변수);
}
for(int i=0; i <arr.length; i++){
	arr[i]=10;
}

향상된 for문 : index 불필요
for(Type 식별자 :배열명){
body (식별자);
}
for(int i: arr){
syso(i);
}
*/
