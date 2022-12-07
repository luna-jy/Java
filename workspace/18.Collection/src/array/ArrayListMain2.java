package array;

import java.util.ArrayList;

public class ArrayListMain2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add( 20 );
		list.add( 30 );
		//Integer -> int : unBoxing
		for(int no : list ) {
			System.out.println(no);
		}
	}
}
