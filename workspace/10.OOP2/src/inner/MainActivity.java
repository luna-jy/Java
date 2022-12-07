package inner;

public class MainActivity extends AppCompatActivity {
	
	protected void onCreate() {
		//화면이 만들어지면 어떤 처리를 할 것인지를 작성
		Button button = new Button();
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
			//이곳에는
			}//데이터 출력하기, 다른화면으로 전환하기 등 필요한 기능을 넣는다. 
			
			
		});
	}//void onCreate()
	public static void main(String[] args) {
		new MainActivity().onCreate();
	}//main()
}
