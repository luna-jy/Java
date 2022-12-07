package label;

public class LabelMain {
	public static void main(String[] args) {
		Label java 
		= new Label("혼자 공부하는 자바", 200, 50, "white","black");
	
		System.out.printf("%s : %d X %d 크기로 %s 배경색에 %s텍스트로 출력"
			,java.text, java.width , java.height, java.background , java.foreground);
	
	
	java.setBackground("yellow");
	System.out.printf("%s : %d X %d 크기로 %s 배경색에 %s텍스트로 출력"
			,java.text, java.width , java.height, java.background , java.foreground);
			
	}
}
