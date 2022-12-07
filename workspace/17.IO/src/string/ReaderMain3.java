package string;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain3 {
public static void main(String[] args) {
	FileReader reader = null;
	String filename = "명단.txt";
	try {
		reader = new FileReader( filename);
		char datas[] = new char[5];
		
		//5, 5, 2
		while (true) {
			int count = reader.read(datas);			
			//더이상 읽어올 데이터가 없으면 -1 , break;
			if (count== -1) break;
			System.out.print(String.valueOf(datas).trim());
		}//while
	} catch (FileNotFoundException e) {
	} catch (IOException e) {
	} finally {
		try {
			reader.close();
		} catch (IOException e) {
	
		}
	} //finally
}
}
