package data;
import java.io.*;
public class ScoreMain {
	public static void main(String[] args) {
		String filename = "src/data/score.html";
		PrintWriter out = null;
		try {
			out = new PrintWriter(filename);
			out.print("<html>");
			out.print("<body>");
			out.print("<h3>성적표</h3>");
			out.println("<talbe border='1'>");
			out.println("<tr><th>성명</th><th>자바</th><th>View</th>");
			out.println("</tr>");
			out.println("<tr><th>홍길동</th><th>85</th><th>88</th>");
			out.println("</tr>");
			out.println("<tr><th>박문수</th><th>90</th><th>78</th>");
			out.println("</tr>");
			out.println("</table>");
			out.print("</body>");
			out.print("</html>");			
				
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {out.close();
			}catch(Exception e) {
			System.out.println(e.getMessage());
			}
		}
		}
	
}
