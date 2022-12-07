package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;


public class ProductDAO {
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
			}
		} 
		public void disconnect() {
			if( rs!=null ) { try{rs.close();}catch(Exception e) {} }		
			if( ps!=null ) { try{ps.close();}catch(Exception e) {} }		
			if( conn!=null ) { try{conn.close();}catch(Exception e) {} }		
		}
		
		
			
	//전체상품목록 출력
	public ArrayList<ProductDTO> product_list(){
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		connect();
		String sql
		= "select * "
		+ " from TBL_JAVA_PRODUCT"
		+ " order by 1 ";
	try {
	ps = conn.prepareStatement(sql);
	rs = ps.executeQuery();
		while(rs.next()) {
			ProductDTO dto = new ProductDTO();
			dto.setNum(rs.getInt("num"));
			dto.setName(rs.getString("name"));		
			dto.setCompany(rs.getString("company"));
			dto.setPrice(rs.getInt("price"));
			dto.setQty(rs.getInt("qty"));
			list.add(dto);
		}
	}catch(Exception e) {
	}finally{		
	} disconnect();
	return list;
	}
	
	
	
	//음료이름으로 검색
	public ProductDTO SearchName(String name) {	
		ProductDTO dto= null;
		connect();
		String sql
		= "select * "
		 +" from TBL_JAVA_PRODUCT"
		 +" where name = ? " 
		 +" order by 1 ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);		
			rs = ps.executeQuery();
			if(rs.next()) {
				dto = new ProductDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));		
				dto.setCompany(rs.getString("company"));
				dto.setPrice(rs.getInt("price"));
				dto.setQty(rs.getInt("qty"));
			}
		}catch(Exception e) {
			System.out.println("음료이름 검색 오류 발생!");
		}finally {
			disconnect();
		}
		return dto; 				
	}

	
	
	//음료 제조사로 검색 
	public ProductDTO SearchCom(String company) {
		ProductDTO dto= null;
		connect();
		String sql
		= "select * "
		 +" from TBL_JAVA_PRODUCT"
		 +" where company = ? " 
		 +" order by 1 ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, company);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto = new ProductDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));		
				dto.setCompany(rs.getString("company"));
				dto.setPrice(rs.getInt("price"));
				dto.setQty(rs.getInt("qty"));
			}
		}catch(Exception e) {
			System.out.println("제조사 검색 오류 발생!");
		}finally {
			disconnect();
		}
		return dto; 				
	}

	//상품 등록	
	public void Insert(String name, String company, int price, int qty) {
	connect();
	String sql 
	= "insert into TBL_JAVA_PRODUCT"
	+ "(num, name, company, price, qty )" 
	+ "values (TBL_JAVA_PRODUCT_seq.nextval,?,?,?,?)" ;
	
	try {	
		ps = conn.prepareStatement(sql);		
		ps.setString(1, name);
		ps.setString(2, company);
		ps.setInt(3, price);
		ps.setInt(4, qty);					
		ps.executeUpdate();
		
	}catch(Exception e) {
		System.out.println("상품등록시 오류 발생!");
	}//try-catch		
}
	
	//상품 삭제 
	public void delete(int num) {		
		connect();
		String sql
		= "delete "
				+ " from TBL_JAVA_PRODUCT"
				+ " where num = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);				
			ps.executeUpdate();	
			conn.commit();
		}catch(Exception e) {			
			
		}//try-catch
	}//delete
	
	
	
	
	
	//상품의 재고 (관리자) 차감 
	public void stock(int mqty, int num) {			
		connect();
		String sql
		= "Update TBL_JAVA_PRODUCT"
		+ " set qty = qty - ?"
		+ " where num = ?";
		try  {
			ps = conn.prepareStatement(sql);			
			ps.setInt(1, mqty);
			ps.setInt(2, num);
			ps.executeUpdate();	
			
		}catch(Exception e) {			
			
		}//try-catch
	}//stock	
	
	//상품의 재고증가 
	public void stock2(int iqty, int num) {		
		connect();
		String sql
		= "Update TBL_JAVA_PRODUCT"
		+ " set qty = qty + ?"
		+ " where num = ?";
		try  {
			ps = conn.prepareStatement(sql);			
			ps.setInt(1, iqty);
			ps.setInt(2, num);
			ps.executeUpdate();	
			
		}catch(Exception e) {			
			
		}//try-catch
	}//stock	

	//상품의 재고 조회
	public ProductDTO stock3(int num) {
		ProductDTO dto = null;
		connect();
		String sql
		= "select qty"
		+ " from TBL_JAVA_PRODUCT"
		+ " where num = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();					
			if(rs.next()) {
					dto = new ProductDTO();				
					dto.setQty(rs.getInt("qty"));	
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				disconnect();
			}
			return dto; 	
		}//stock3
	
	
}
	
	
	
	
	
	
	
	
	
	
	


