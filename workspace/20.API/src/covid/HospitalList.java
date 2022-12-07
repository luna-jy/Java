package covid;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONArray;
import org.json.JSONObject;

import common.PublicAPI;

//병원목록화면
public class HospitalList {
	private PublicAPI api; //필드의 초기화: 생성자, setter메소드
	public HospitalList(PublicAPI api) {
		this.api = api;
	}
	public void display() {
		//API 를 요청한다.
		//https://api.odcloud.kr/api/apnmOrg/v1/list
		//?serviceKey=data-portal-test-key
		//&returnType=JSON
		StringBuffer url = new StringBuffer();
		url.append("https://api.odcloud.kr/api/apnmOrg/v1/list");
		url.append("?serviceKey=").append(api.getKey());
		
		
		//응답받은 정보 보기
		//1. 병원목록을 콘솔로 보기
		//viewConsole( url );
		
		//2. 병원목록을 웹파일로 보기
		viewHtml( url );
	}
	
	private void viewHtml( StringBuffer url ) {
		JSONArray array = api.covidAPItoJSON( url );
		
		String path = "d:/io/api/covid";
		File dir = new File( path );
		if( ! dir.exists() ) dir.mkdirs();
		String filename = "hospital.html";
		PrintWriter  out = null;
		try {
			out = new PrintWriter( path + "/" + filename );
			out.print("<html>");
			out.print("<body>");
			out.print("<h3>코로나 예방접종 사전예약 의료기관</h3>");
			out.print("<table border='1' style='width:1000px'>");
			out.print("<tr><th style='width:320px'>병원명</th>");
			out.print("<th style='width:140px'>전화번호</th><th>주소</th></tr>");
			
			for(int idx=0; idx<array.length(); idx++) {
				JSONObject hospital = array.getJSONObject(idx);
			out.printf("<tr><td>%s</td><td>%s</td><td>%s</td></tr>"
						, hospital.getString("orgnm")
						, hospital.getString("orgTlno")
						, hospital.getString("orgZipaddr"));
			}
			out.print("</table>");
			out.print("</body>");
			out.print("</html>");
			out.flush();
		}catch(IOException e) {
		}finally {
			out.close();
		}
		
		String link = "file://" + path + "/" + filename ;
		try {
			Desktop.getDesktop().browse( new URI(link) );
		} catch (Exception e) {
		}
		
	}
	
	
	private void viewConsole( StringBuffer url ) {
		System.out.println("병원명 \t 전화번호 \t 주소");
		JSONArray array = api.covidAPItoJSON( url );
		for(int idx=0; idx<array.length(); idx++) {
			JSONObject hospital = array.getJSONObject(idx);
			System.out.printf("%s \t %s \t %s \n"
							, hospital.getString("orgnm") 
							, hospital.getString("orgTlno") 
							, hospital.getString("orgZipaddr") 
							);
		}
		
	}
}
