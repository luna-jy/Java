import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception03 {
	public static void main(String[] args) {
		try {
			int result = 10/5 ;//ArithmeticException: 미확인 예외(실행예외) 발생
			System.out.println("Result : "+ result);
			FileInputStream fis = new FileInputStream("abc.txt");
			fis.close();
		}catch (ArithmeticException e) {
			System.out.println("입력값이 잘못 되었습니다!");
		}catch (FileNotFoundException e){ 
			System.out.println("해당 파일이 존재하지 않습니다!");
		
		}catch (Exception e) { 
			e.printStackTrace();
		}
	}//main()
}//class
