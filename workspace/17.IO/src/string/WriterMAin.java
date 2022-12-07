package string;

import java.io.FileWriter;
import java.io.IOException;

public class WriterMAin {
	public static void main(String[] args) {
		FileWriter writer = null;
		String filename ="정리" ;				
		try {
			//Writer 시에는 해당 이름의 파일이 없으면 생성해준다. 
			//파일에 추가쓰기를 하는 경우 :
			//생성자 두번째 파라미터true = 기존 파일에 추가 
			//생성자 두번째 파라미터false= 덮어쓰기 
			
			
			//파일열기
			writer = new FileWriter(filename, true);
			
			//쓰기
			char[] datas = {'혼', '자', '공', '부', '하','는','자','바'} ;
//			for(char ch : datas) {
//				writer.write(ch);
//			}
			writer.write(datas); //배열변수데이터를 한번에 쓰기
		} catch (IOException e) {	
		} finally {
			//닫기
			try {writer.close(); 
			} catch(Exception e) {
			}
			System.out.println("쓰기 완료");	
		}
		
	}//main()
}


/*
 * 
 * char datas[] = new char[5];
 * while((count = reader.read(datas)) != -1) {
 * **char 배열변수를 문자열로 만든 후 읽어온 문자의 개수만큼 출력
 *  system.out.println(String.valueOf(datas).substring(0,count) );
 *  }
 *  
 *  
 */