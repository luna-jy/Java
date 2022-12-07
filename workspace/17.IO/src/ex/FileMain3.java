package ex;

import java.io.*;

public class FileMain3 {
	public static void main(String[] args) {
		//13명의 정보가 있는 명단.txt 파일의 정보를 읽어서 
		//d:/io/202호 만든 뒤, student.html파일로 
		//이름, 성별, 전화번호 
		//표의 형태로 출력되게끔 하시오. 
 
	
		File file = new File ( "C:\\Users\\admin\\Desktop\\명단.txt"); //명단.txt를 불러오고 
		BufferedReader in = null;	 
		FileReader reader = null;
		String path = "d:/io/202호";
		File folder = new File ("d:/io");
		folder = new File("d:/io/202호");
			if(! folder.exists()) folder.mkdirs();			
	
		PrintWriter out = null;		
	
		try {		
			in = new BufferedReader (new FileReader("C:\\Users\\admin\\Desktop\\명단.txt"));
			String line; 
			boolean nonExist = false;
			out  = new PrintWriter(path+"/student.html");			
			out.print("<html>");
			out.print("<body>");
			out.print("<table border = '1'>");
			out.print("<thead><th>성명</th><th>성별</th><th>전화번호</th>");	
			out.print("</thead>");
			
			//반복되어지는것만 while{}문에 담는다. 
			while((line =in.readLine()) != null){				
				String data[] = line.split(",");
				//out.print("<tr><td>"+data[0]+"</td><td>"+data[1]+"</td><td>"+data[2]+"</td></tr>");				
				out.printf("<tr><td>%s</td><td>%s</td><td>%s</td></tr>",data[0],data[1],data[2]);
			
			}
			out.print("</table>");
			out.print("</body>");
			out.print("</html>");
				
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
		 try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 out.close();
		}
	
		}//main()		
}//class
	

