package ex;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		File file = new File ( "C:\\Users\\admin\\Desktop\\명단.txt");
		System.out.println("수정일시:" + file.lastModified());
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일   a hh:mm:ss ");
		String now = df.format(new Date() );
		System.out.println("현재: " + now);
		System.out.println("수정일시: "+df.format(new Date(file.lastModified())));
		File folder = new File ("src");
		File[] list = folder.listFiles();
		for(File f : list) {
			System.out.printf("%s %s %s \n",f.getName(),f.isDirectory()? "폴더":"파일",
							df.format(new Date(file.lastModified())));
		}
		//특정 위치에 데이터를 저장하고자 한다. 
		//해당 위치인 폴더가 없다면 폴더를 만들어준다
		folder = new File("d:/io");
		if (! folder.exists()) {
			folder.mkdir();
		}
		df = new SimpleDateFormat("yyyy/MM/dd");
		String today = df.format(new Date());
		
		folder = new File("d:/io/" + today);
		if(! folder.exists()) folder.mkdir();
	}
}
