
public class Ex_Array04 {
public static void main(String[] args) {
	int[][] intArray = new int[3][];
	intArray[0] = new int[1];
	intArray[1] = new int[2];
	intArray[2] = new int[3];
	 for (int i = 0; i < intArray.length; i++) {
		 for (int j = 0; j < intArray.length; j++) {
			 intArray[i][j]		=10;
		     System.out.print("intArray["+i+"]["+j+"]의 값 : " + intArray[i][j] + "\t");
		 
		 
		 }
		System.out.println();
	 }
	}
}
