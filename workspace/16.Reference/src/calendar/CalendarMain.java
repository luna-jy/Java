package calendar;

import java.text.SimpleDateFormat;
import java.util.* ;

public class CalendarMain {
	public static void main(String[] args) {		
		GregorianCalendar today = new GregorianCalendar();
			int year = today.get(Calendar.YEAR); 
			int month = today.get(Calendar.MONTH)+1;  //0~11 이라서 +1해야 1부터 시작
			int date = today.get(Calendar.DATE);
			System.out.printf("%d년 %d월 %d일 \n",year, month, date);
		
		Date now = new Date();
		System.out.println(now);
		//원하는 형태(x년 x월 x일 x:x: x)로 날짜를 포맷해본다 
		//날짜 포맷하는 기능을 가진 클래스 : SimpleDateFormat
		SimpleDateFormat df 
		= new SimpleDateFormat("yyyy년 MM월 dd일 E a hh:mm:ss"); // 시간 표시 : E HH : 24시간 기준  E a hh : 12시간 ㄱ준
		String now2= df.format(now);
		System.out.println(now2);
		
		
	}//main()

}
