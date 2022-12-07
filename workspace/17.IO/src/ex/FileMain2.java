package ex;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain2 {
	public static void main(String[] args) {
		//특정 폴더 안에 파일로 문자데이터 쓰기 작업을 해서 내보내자.
		//Reader / Writer (문자데이터 쓰기작업)  -> FileReader/FileWirter (파일로 쓰기 작업)
		//문자데이터 쓰기에 특화되어있는 클래스 : PrintWirter
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd"); // 포맷
			String today = df.format(new Date());
			String path = "d:/io/" + today;
		File dir = new File (path);
		if( ! dir.exists() ) dir.mkdirs();
		PrintWriter out = null;
		try {
		out = new PrintWriter(path + "/명단.html");
		out.print("<html>");
		out.print("<body>");
		out.print("<h3>202호</h3>");
		out.print("<table border = '1'>");
		out.print("<thead><th>이름</th><th>성별</th><th>전화번호</th>");
				
		out.print("</thead>");
		out.print("</table>");
		
		out.print("</body>");
		out.print("</html>");
		
	}catch(IOException e) {
		
	}finally {
		out.close();
		
	}
	}
}
