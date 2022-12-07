package message;

abstract public class MessageSender {
	String title, senderName, messageContent;
	MessageSender(String title, String senderName
					, String messageContent){
		this.title = title;
		this.senderName = senderName;
		this.messageContent = messageContent;
	}
	abstract void sendMessage(String receiver);
}
