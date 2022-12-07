package inner;

public class Button {
	
	static interface OnClickListener {
		void onClick();
	} //버튼클릭했을때 void () 이벤트 발생 
	
	public OnClickListener listener;
	
	//필드에 데이터 담는다 (필드에 데이터 초기화) - 생성자 or setter메소드 
	
	
	void click() {
		listener.onClick();
//		System.out.println("버튼클래스 클릭");
	}//클릭 이벤트 발생시 호출

	public OnClickListener getListener() {
		return listener;
	}

	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
}
