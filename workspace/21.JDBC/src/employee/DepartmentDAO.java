package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DepartmentDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	//DB 연결처리	
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn
			= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "0000");
		}catch(Exception e) {
		}
	}
	
	//부서 목록 조회
	public ArrayList<DepartmentDTO> department_list(){
		    ArrayList<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		
	connect();
	
	String sql
	="select  department_id, department_name"
	+" from departments";
	
	try {
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while( rs.next() ) {
			DepartmentDTO dto = new DepartmentDTO();
			dto.setDepartment_name(rs.getString("department_name"));
			dto.setDepartment_id(rs.getInt("department_id"));			
			list.add(dto);
		}
		
	}catch(Exception e) {
	}finally {
		disconnect();
	}return list;
	}
	
	public void disconnect() {
		if( rs!=null ) { try{rs.close();}catch(Exception e) {} }		
		if( ps!=null ) { try{ps.close();}catch(Exception e) {} }		
		if( conn!=null ) { try{conn.close();}catch(Exception e) {} }		
	}
			
	
	//특정 부서의 부서정보를 조회 
	public DepartmentDTO department_info (int department_id) {
		DepartmentDTO dto  = null;
		connect();
		String sql
		="select  d.department_id, d.department_name, e.first_name, l.city "
		+" from departments d, employees e, locations l "
		+"where e.department_id = d.department_id "
		+"and d.location_id = l.location_id "
		+"and d.department_id = ? ";
		
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, department_id);
			rs = ps.executeQuery();
			if( rs.next() ) {
				dto = new DepartmentDTO();
				dto.setDepartment_name( rs.getString("department_name") );
				dto.setDepartment_id( rs.getInt("department_id") );	
				dto.setFirst_name(rs.getString("first_name"));
				dto.setCity(rs.getString("city"));	
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return dto; //특정 부서의 정보 반환
	}
	
		

}
