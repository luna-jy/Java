package data;
import java.io.*;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
	String filename = "C:\\Users\\admin\\Desktop\\명단.txt";
//	String filename = "src/data/명단.txt";
	
	Scanner scan = new Scanner(System.in);	
	System.out.println("이름을 입력하세요");
	String name = scan.next();
	
	BufferedReader in = null;
	
		scan.close();
				
		try {
			in = new BufferedReader (new FileReader(filename));
//			while(true) {
//				String line = out.readLine();
//				if(line == null) break; //13번 반복문 실행 후에는 읽어올 데이터 없으므로
//				System.out.println(line);
//			}
			String line;	
			boolean nonExist = false;
			
			while ((line = in.readLine()) != null) {	
				
					String data[] = line.split(",");
				
					
					if(data[0].equals(name)) {
						System.out.println("성명"+data[0]);
						System.out.println("성별"+data[1]);
						System.out.println("전화번호"+data[2]);
						nonExist = false;
				}
					
				if(nonExist) {
					System.out.println(name + "씨의 정보는 없습니다.");
				}

						
			}
		}catch(FileNotFoundException e) {			
	
		}catch (IOException e) {
			
		}finally {
		try {
			in.close();
			//파일 닫기
		}catch	(Exception e){}
		}

		
		System.out.println();
	}//main()
}//class
		




