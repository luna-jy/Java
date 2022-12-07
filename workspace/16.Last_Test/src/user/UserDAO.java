package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class UserDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	
//DB 연결처리	
			public void connect() {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn
					= DriverManager.getConnection(
							"jdbc:oracle:thin:@211.223.59.99:1521:xe", "smart06", "0000");
				}catch(Exception e) {					
					System.out.println(e.getMessage());					
				}
			} 

			public void disconnect() {
				if( rs!=null ) { try{rs.close();}catch(Exception e) {} }		
				if( ps!=null ) { try{ps.close();}catch(Exception e) {} }		
				if( conn!=null ) { try{conn.close();}catch(Exception e) {} }		
			}	
	
			
// 로그인 (id와 pw가 일치하는 회원정보를 조회)
		public UserDTO login(String id, String pw) {
			UserDTO dto = null;
			connect();
			String sql 
			= "select id,pw,admin"
			+ " from TBL_JAVA_USER "
			+ " where id = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				rs = ps.executeQuery();
				if( rs.next() ) {
					dto = new UserDTO();
					dto.setId( rs.getString("id") );
					dto.setPw( rs.getString("pw") );				
					dto.setAdmin(rs.getString("admin"));						
				}				
			}catch(Exception e) {
				System.out.println("로그인 오류 발생!");
			}finally {
				disconnect();
			}
			return dto; 
		}//login
		
//회원가입
		public void User(String id, String pw, String name, String email) {
			connect();
			String sql 
			= "insert into TBL_JAVA_User"
			+ "( id, pw, name, email )" 
			+ "values (?,?,?,?)" ;
			
			try {	
				ps = conn.prepareStatement(sql);		
				ps.setString(1, id);
				ps.setString(2, pw);
				ps.setString(3, name);
				ps.setString(4, email);
				ps.executeUpdate();
				
			}catch(Exception e) {
				System.out.println("회원가입시 오류 발생!");
			}//try-catch		
		}
		

//주문 전 추가 금액 입력 	
	public void money (int input, String id) {
		connect();
		String sql
		= "update TBL_JAVA_USER"
		+ " set money = money + ? "
		+ " where id = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,input);
			ps.setString(2,id);
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("금액 추가시 오류 발생!");
		}
	}//order
		
	

	
	
	
		
//주문시 소지하고 있는 금액 변동과 재고수량 변동	
		public void order(int num, String id, int qty) {			
			connect();
			String sql
			= "update TBL_JAVA_USER"
			+ " set money = money - (select price from TBL_JAVA_PRODUCT where num=?) "
			+ " where id = ?" ;
			
			String sql2
			="update TBL_JAVA_PRODUCT"
			+" set qty = qty - ?"
			+" where num = ?"; 
			
			
		try {
			ps = conn.prepareStatement(sql);		
			ps.setInt(1, num);
			ps.setString(2, id);
			ps.executeUpdate();	
					
			ps = conn.prepareStatement(sql2);				
			ps.setInt(1,qty);
			ps.setInt(2,num);	
			ps.executeUpdate();	
			
		}catch(Exception e) {
			System.out.println("금액 또는 재고수량 변동 시 오류 발생!");
		}
		

	}//order
	
	
//주문 후 현재 잔액을 조회
		public int balance(String id) {
					int money = 0;
					connect();
					String sql 
					= "select money"
					+ " from TBL_JAVA_USER "
					+ " where id = ?";
					try {
						ps = conn.prepareStatement(sql);
						ps.setString(1, id);
						rs = ps.executeQuery();
						if( rs.next() ) {							
							money = ( rs.getInt("money") );
						}						
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}finally {
						disconnect();
					}return money;
		}//balacne		
		
//주문 전 현재 소지 금액 조회
		public int money_now (String id) {
			connect();
			int money = 0;
			String sql
			= "select id, money "
			+ " from TBL_JAVA_USER "
			+ " where id = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, id);				
				rs = ps.executeQuery();
				if( rs.next() ) {
					money = (rs.getInt(money));
				}						
			}catch(Exception e) {
				System.out.println("잔액 조회 시 오류 발생!");
			}finally {
				disconnect();
			}
			return money;
		}//money_now	
}//UserDAO






	




		