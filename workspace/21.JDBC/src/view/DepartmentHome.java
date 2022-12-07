package view;

import java.awt.Desktop;
import java.io.File;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Scanner;

public class DepartmentHome {
	private Scanner sc;
	public DepartmentHome( Scanner sc) {
		
	}
	void displayHtml() {
		String path = "d:/io/view/", filename="home.html";
		File dir = new File(path);
		if( ! dir.exists() ) dir.mkdirs();
		
		PrintWriter out = null;
		try {
			out = new PrintWriter( path + filename );
			out.print("<html>");
			out.print("<body>");
			out.print("<ul>");
			out.print("<li><a href='emp_list.html'>사원목록</a></li>");
			out.print("<li><a href='dept_list.html'>부서목록</li>");
			out.print("</ul>");			
			out.print("</body>");
			out.print("</html>");
			out.flush();
		}catch(Exception e) {
		}finally {
			try{ out.close(); }catch(Exception e) {}
		}
		try {
			Desktop.getDesktop().browse( 
					new URI("file://" + path + filename ) );
		} catch (Exception e) {
		}
		
	}
	public void display() {
		displayHtml();
		
		System.out.println("1.사원목록   2.부서목록   0.종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		if( menu == 1 ) {
			View.list.display();
		}else if( menu == 2 ) {
			View.dept_list.display();
		}else if( menu == 0 ) {
			System.exit(0);
		}
	}
}

