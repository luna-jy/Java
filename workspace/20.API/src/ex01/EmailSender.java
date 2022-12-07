package ex01;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;


public class EmailSender {
	//메일보내는이의 메일주소, 보내는이 이름, 메일서비스 비번
	private String emailAddress, senderName, emailPassword;
	EmailSender(String emailAddress, String senderName, String emailPassword){
		this.emailAddress = emailAddress; //hong@gmail.com
		this.senderName = senderName;
		this.emailPassword = emailPassword;
	}
	
	//메일보내기
	void sendHtml(String email, String name) {
		HtmlEmail mail = new HtmlEmail();
		mail.setHostName( 
			emailAddress.substring(emailAddress.indexOf("@")+1 ));
		mail.setAuthentication(emailAddress, emailPassword);
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom(emailAddress, senderName);
			mail.addTo(email, name);
			
			mail.setSubject("생일 축하 메시지");
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<h2>").append(name).append("님 생일 축하</h2>");
			msg.append("<div>생일 축하 쿠폰이 발급되었습니다</div>");
			msg.append("<a target='_blank' href='https://www.naver.com/'>네이버</a>");
			msg.append("<img src='https://cdn.pixabay.com/photo/2022/09/03/14/32/airplane-7429725__340.jpg'>");
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg( msg.toString() );
			
			EmailAttachment file = new EmailAttachment();
			file.setURL(new URL("https://imgnews.pstatic.net/image/025/2022/10/13/0003230371_001_20221013104001089.jpg?type=w647") );
			mail.attach(file);
			
			mail.send();			
		}catch(Exception e) {
			
		}
		
		
	}
	
	void sendAttach(String email, String name) {
		MultiPartEmail mail = new MultiPartEmail();
		
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		//메일서버지정
		mail.setHostName( "smtp."+
				emailAddress.substring(emailAddress.indexOf("@")+1));
		mail.setAuthentication(emailAddress, emailPassword);
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom(emailAddress, senderName); //보내는이
			mail.addTo(email, name); //받는이 지정
			
			mail.setSubject("생일 축하 메시지-첨부파일 확인요망");
			mail.setMsg( name+ "님! 생일 축하합니다 \n생일쿠폰이 발급되었습니다\n"
						+ "당사 사이트에서 쿠폰함을 확인하세요!");
			
			EmailAttachment file = new EmailAttachment(); //첨부파일객체
			file.setPath( "D:\\DevProgram\\NanumGothicCoding-2.5.zip");
			mail.attach(file); //첨부하기버튼 클릭
			
			file = new EmailAttachment();
			file.setURL( new URL("https://cdn.pixabay.com/photo/2022/08/22/16/40/dragon-fly-7404035_960_720.jpg"));
			mail.attach(file);
			
			//보내기 버튼 클릭
			mail.send();
			
		}catch(Exception e) {			
		}
		
		
	}
	
	
	void sendSimple(String email, String name) {
		//메일 수신하는 이의 이메일주소, 이름
		SimpleEmail mail = new SimpleEmail();
		mail.setCharset("utf-8");
		mail.setDebug(true); //메일전송과정 확인하도록 로그출력
		
		String host = emailAddress.substring( 
							emailAddress.indexOf("@")+1 );
		mail.setHostName("smtp." + host);
		
		//아이디/비번을 입력한후 로그인버튼 클릭하기
		mail.setAuthentication(emailAddress, emailPassword);
		mail.setSSLOnConnect(true);
		
		try {
			//메일 보내는이 지정
			mail.setFrom(emailAddress, senderName);
			//메일 받는이 지정
			mail.addTo( email, name );
//			mail.addTo("email2@naver.com");
		
			//메일제목
			mail.setSubject("생일을 축하합니다");
			
			//메일내용
			mail.setMsg(name + "님! 10% 할인쿠폰이 발행되었습니다");
			
			//메일보내기 버튼 클릭
			mail.send();
			
		}catch(Exception e) {
		}
	}
	
}
