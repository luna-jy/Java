package view;

import java.awt.Desktop;
import java.io.PrintWriter;
import java.net.URI;

import java.util.Scanner;

import employee.DepartmentDAO;
import employee.DepartmentDTO;



public class DepartmentInfo {
	private Scanner sc;
	public DepartmentInfo (Scanner sc) {
		this.sc = sc;
	}
	
	public void displayHtml(int department_id) {
		DepartmentDAO dao = new DepartmentDAO();
		DepartmentDTO dto = dao.department_info(department_id);
		
		String path = "d:/io/view/", filename = "dept_info.html";
		View.makeFolder( path );
		
		PrintWriter out = null;
		try {
			out = new PrintWriter( path + filename );
			out.print("<html>");
			out.print("<body>");
			out.print("<h2>부서정보</h2>");
			out.print("<table border='1' style='width:600px'>");
			out.print("	<tr>");
			out.printf("<th style='width:160px'>부서번호</th><td>%d</td>"
						, dto.getDepartment_id());
			out.print("	</tr>");
			out.printf("<tr><th>부서명</th><td>%s</td></tr>"
					, dto.getDepartment_name());
			out.printf("<tr><th>부서장명</th><td>%s</td></tr>"
					, dto.getFirst_name());
			out.printf("<tr><th>도시</th><td>%s</td></tr>"
					, dto.getCity());			
			out.print("</table>");
			out.print("</body>");
			out.print("</html>");
			out.flush();
		}catch(Exception e) {
		}finally {
			out.close();
		}
		
		try {
		Desktop.getDesktop().browse( 
			new URI("file://" + path +filename) );
		}catch(Exception e) {}
	}

	public void display(int department_id) {
		displayHtml(department_id);
		DepartmentDAO dao = new DepartmentDAO();
		DepartmentDTO dto = dao.department_info(department_id);
		
		System.out.println("\t\t\t[ 부서정보 ]");
		if( dto==null ) {
			System.out.println("부서정보 없습니다");
		}else {
			System.out.printf("%-15s\t: %d\n",
							"부서번호", dto.getDepartment_id());	
			System.out.printf("%-15s\t: %s\n",
					"부서명", dto.getDepartment_name());
			System.out.printf("%-15s\t: %s\n",
					"부서장명",dto.getFirst_name());
			System.out.printf("%-15s\t: %s\n",
					"도시",dto.getCity());	
			
		}
		System.out.println("1.홈화면  2.부서목록  0.종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		if( menu==1 ) {
			View.home.display();
		}else if( menu==2 ) {
			View.dept_list.display();
		}else if( menu==0 ) {
			System.exit(0);
		}
	}
	
	}

		