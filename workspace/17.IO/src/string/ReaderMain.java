package string;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain {
	public static void main(String[] args) {
	//파일을 연다 → 내용을 읽는다 → 파일을 닫는다
		
	//1. 파일 열기  : "파일명" 지정 
		FileReader reader = null;
		try {
			reader = new FileReader("명단.txt");
	//2. 내용 읽기
		while(true) {		
				int data = reader.read();  //문자 한 개
				//더 이상 읽어올 문자가 없으면 -1  - 빠져나가므로break;
				if(data == -1) break;
				
				System.out.print((char)data);
		} 
			
		} catch (FileNotFoundException e){		
		} catch (IOException e){
			System.out.println(e.getMessage());
		} finally {
			//3. 파일 닫기 
			try {
				reader.close();
			} catch (Exception e) {
			
			}
			
		}
		
		

		
			
	}//(main)
	
}
