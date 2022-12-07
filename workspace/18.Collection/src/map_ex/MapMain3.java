package map_ex;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class MapMain3 {
	public static void main(String[] args) {
		
	
		//명단 .txt 파일을  BufferedReader 사용해 읽는다. 
		String filename = "C:\\Users\\admin\\Desktop\\명단.txt"; 
		BufferedReader in = null;
	
		
			

		//HashMap에 데이터를 Key : 이름, 데이터 : StudentDTO 로 담는다. 	
		HashMap<String,StudentDTO> map = new HashMap <String,StudentDTO> ();		
	
				
		try {
			in = new BufferedReader (new FileReader(filename));		
			
		String line;	
			boolean nonExist = false;
			
			while ((line = in.readLine()) != null) {				
					String data[] = line.split(",");
					// data[0] "홍길동" data[1]"남" data[2]"1010-222"
					//StudentDTO dto= new StudentDTO("홍길동","남","010") ;
					StudentDTO dto= new StudentDTO(data[0],data[1],data[2]) ;
					
					map.put(data[0], dto);
					
	//		map.put(data[0],new StudentDTO( gender,phone));
			} //while
			
		}catch(IOException e) {					
			
		}finally {
			try {
				in.close();// 파일 닫기
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		//키보드로 학생이름을 입력한다 .		
		Scanner sc = new Scanner (System.in);			
		System.out.println("학생의 이름을 입력하세요");		
		String name = sc.next();	
		sc.close();
		
		
		//해당 학생정보를 아래와 같이 출력한다. 

		StudentDTO  student = map.get(name);		
		if(map.get(name) !=null) {
			System.out.println("이름 : " + student.name);
			System.out.println("성별 :" + student.gender);
			System.out.println("전화번호 :" + student.phone);
//		//해당 학생이 없으면 "해당 학생이 없음"을 출력한다.
		}else {
		System.out.println(name + "학생이 없습니다.");
		}
			
		
}//main()
}//class	
