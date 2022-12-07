package ex01;

public class EmailMain {
	public static void main(String[] args) {
		
		EmailSender email = new EmailSender ("qwd27@naver.com","고객센터", "lunapark1125" );
		
		//email.sendSimple("qwd27@naver.com", "박주영");
		
		//email.sendAttach("qwd27@naver.com", "박주영");
		email.sendHtml("qwd27@naver.com", "박주영");
		
	}
}
