package string;

import java.util.StringTokenizer;

public class TokenMain2 {
public static void main(String[] args) {
	//문자열 "사과=5,배=30,귤=20"
	//토큰을 분리해 다음처럼 출력한다
	//사과=5
	//배=30
	//귤=20
	
	
	String fruits = "사과=5,배=30,귤=20" ;	
	
	StringTokenizer token = new StringTokenizer(fruits, ",");
		while(token.hasMoreTokens()) {
			String data = token.nextToken();
				System.out.println(data);
		}

		System.out.println("======또는=============");
		token 
		= new StringTokenizer(fruits, ",");			
		int count = token.countTokens();
				for(int i = 0; i < count; i++) {
			System.out.println(token.nextToken());
		}

}//main
}//class
