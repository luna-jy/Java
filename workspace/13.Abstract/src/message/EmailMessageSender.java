package message;

public class EmailMessageSender extends MessageSender{
	//발신자이메일 주소
	String senderEmail;
	EmailMessageSender(String title, String senderName
					, String messageContent, String senderEmail){
		super(title, senderName, messageContent);
		this.senderEmail = senderEmail;
	}
	void sendMessage(String receiver) {
		System.out.println("이메일 발송 ---------");
		System.out.println("제목:" + title);
		System.out.printf("보내는이: %s(%s)\n", senderName, senderEmail);
		System.out.println("받는이:" + receiver);
		System.out.println("내용:" + messageContent);
		System.out.println("------------------");
	}
}
