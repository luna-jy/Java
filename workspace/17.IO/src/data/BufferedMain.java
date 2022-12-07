package data;

import java.io.*;

public class BufferedMain {
	public static void main(String[] args) {		
		String readFilename = "D:\\view 텍스트파일\\뷰-GIT2.txt";
		String writeFilename = "src/data/실습2.txt";
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		
		try {
			out = new BufferedOutputStream(new FileOutputStream(writeFilename));
			in = new BufferedInputStream(new FileInputStream(readFilename));
			
			byte[] buf = new byte[1024];
			int count;
			while((count = in.read(buf)) != -1) {
				out.write(buf,0,count);
				
			} 
			out.flush();
		}catch (FileNotFoundException e) {
		}catch (IOException e) {
		}finally {
			try {in.close();	} catch (Exception e) {			}	
			try {out.close();	} catch (Exception e) {			}
		}
		
	}
}
