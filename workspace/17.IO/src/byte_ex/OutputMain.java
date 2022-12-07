package byte_ex;


import java.io.*;

public class OutputMain {
	public static void main(String[] args) {
		String filename = "data.out";
		FileOutputStream out = null;
		try {
			out  = new FileOutputStream (filename);
			byte[] data = { 1,2,3,4,5,6,7,8,9,10};
			out.write(data);
		} catch (IOException e) {
		}finally {
			try { out.close(); 
			}catch(Exception e) {
			}
		}
		System.out.println("쓰기완료");
		
		FileInputStream in = null;
		
		try {
		 in = new FileInputStream(filename) ;
//		 while(true) {
//			int data = in.read();
//			if (data == -1 ) break;
//		 }
		 int data;
		 while ((data =in.read())!= -1) {  
			System.out.println(data);
			 
		 }
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}finally {
			try {
				in.close();
			} catch (Exception e) {
				
			}
		}
	}//main()
}
