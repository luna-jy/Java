package ex01;

public class EmainMain {
	public static void main(String[] args) {
//		javaee.github.io
//		> Migrated Project : javamail 
//		> Download JavaMain Release
//		> javax.mail.jar
		
//		commons.apache.org
//		> Components : Email
//		> Release : Download now!
//		> Binaries : commons-email-1.5-bin.zip
//		> commons-email-1.5.jar
		
		EmailSender email =
				new EmailSender(
					"ojink2@naver.com", "고객센터", "비번");
//		"본인이메일주소", "고객센터", "본인이메일에대한 비번");
		//ojink@naver.com  1234
//		email.sendSimple("ojink2@naver.com", "홍길동");
//		email.sendAttach("본인이메일주소", "홍길동");
		email.sendHtml("본인이메일주소", "홍길동");
		
	}
}
