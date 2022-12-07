package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain01 {
	public static void main(String[] args) {
		//사원 테이블에 새로운 사원정보 등록
		//키보드로 입력해서 등록한다
//		--성:홍, 명:길동, 이메일:hong@naver.com, job_id: IT_PROG
//		-- 부서코드 : 60
		System.out.println("사원정보등록 -------");
		Scanner sc = new Scanner(System.in);
		System.out.print("성: ");
		String last_name = sc.next();
		System.out.print("명: ");
		String first_name = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("업무코드: ");
		String job_id = sc.next();
		System.out.print("부서코드: ");
		int department_id = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.0.38:1521:xe"
					, "hr", "0000");
			String sql 
			= "insert into employees "
			+ "			(employee_id, last_name, first_name, email "
			+ "				, job_id, department_id) "
			+ "values (employees_seq.nextval, ?, ?, ?, upper(?), ? )";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, last_name);
			ps.setString(2, first_name);
			ps.setString(3, email);
			ps.setString(4, job_id);
			ps.setInt(5, department_id);
			int count = ps.executeUpdate();
			if( count>0 ) {
				System.out.println("삽입저장 완료");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}






