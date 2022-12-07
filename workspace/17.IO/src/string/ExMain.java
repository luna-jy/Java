package string;
import java.io.*;
import java.util.Scanner;


/*
1.스캐너 클래스를 사용한다
2.저장할 문자열을 키보드로 입력한다 
3.입력한 문자열을 파일에 저장한다
4.저장된 파일을 읽어서 콘솔에 출력한다. 
 */
public class ExMain {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); //스캐너 클래스를 사용한다
	System.out.println("문장을 입력하세요");
	//저장할 문자열을 키보드로 입력한다 
	String line = scan.nextLine();	
	scan.close(); //스캐너 클래스 닫기
	
	String Filename = "문자열실습";
	//입력한 문자열을 파일에 저장한다
		FileWriter writer = null;
	//파일 열기
		try {
			writer = new FileWriter(Filename);
			writer.write(line);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				writer.close();}
			catch(Exception e){
				}
			System.out.println("쓰기완료");
		}
		
	//쓰기 작업
		FileReader reader = null;
		try {
			reader = new FileReader(Filename);
			//읽기
			int data;
			while(true) {
				data = reader.read();
				if (data == -1 ) break;
				//콘솔에 출력해서 눈으로 확인
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());			
		}finally {
			try {
				reader.close();
			} catch (Exception e) {
				
			}
		}
		System.out.println("\n읽기 완료");	
		}
		}
		
	
