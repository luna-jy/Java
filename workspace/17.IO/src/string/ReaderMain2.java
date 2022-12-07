package string;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain2 {
	public static void main(String[] args) {
		String filename ="명단.txt";
		FileReader reader = null;		
		try {
			reader = new FileReader(filename);
			char[] datas = new char[100];
			//읽어온 문자열의 갯수가 반환됨
			int count = reader.read(datas); 
			System.out.println("총 문자수 : " + count);
			System.out.println(String.valueOf(datas).trim() );
			// 빈 문자열제거 : trim
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			
		}finally {
			try { reader.close();
			} catch(Exception e) {
				
			}
		
		}
	}
}
