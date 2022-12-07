package view;

import java.awt.Desktop;
import java.io.File;
import java.io.PrintWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Scanner;

import employee.DepartmentDAO;
import employee.DepartmentDTO;


public class DepartmentList {
	private Scanner sc;
	public DepartmentList (Scanner sc) {
		this.sc = sc;
	}
	public void displayHtml() {
		ArrayList<DepartmentDTO> list
			= new DepartmentDAO().department_list();
		
		String path = "d:/io/view/", filename= "dept_list.html";
		File dir = new File(path);
		if( ! dir.exists() ) dir.mkdirs();
		
		PrintWriter out = null;
		try {
			out = new PrintWriter (path + filename);
			out.print("<html>");
			out.print("<body>");
			out.print("<h2>부서목록</h2>");
			out.print("<table border='1' style='width:800px'>");
			out.print("<tr>");
			out.print("	<th style='width:100px'>부서 번호</th>");
			out.print("	<th style='width:200px'>부서 명</th>");		
			out.print("</tr>");
	
			for (DepartmentDTO dto : list) {
				out.print("<tr>");
				out.print("	<td><a href='dept_info.html'>"+ dto.getDepartment_id() +"</a></td>");				
				out.print("	<td>"+ dto.getDepartment_name() +"</td>");
				out.print("</tr>");								
			}
			
			out.print("</table>");			
			out.print("</body>");
			out.print("</html>");
		
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
		
		DepartmentDAO dao = new DepartmentDAO();
		ArrayList<DepartmentDTO> list = dao.department_list();
		

		System.out.println("[부서목록]");
		System.out.println("부서번호\t\t\t부서명");
		for(DepartmentDTO dto : list) {
			System.out.print(dto.getDepartment_id() + "\t");			
			System.out.printf("%-13s \t \n", dto.getDepartment_name());			
		}		
		
		System.out.println("1.홈화면   2.부서정보  0.종료");
		System.out.print("선택: ");
		switch( sc.nextInt() ) {
		case 1:
			View.home.display();
			break;
		case 2:
			System.out.print("조회할 부서 번호: ");
			int department_id = sc.nextInt();
			View.dept_info.display(department_id);
			break;
		default:
			System.exit(0);
		}
	}
}


