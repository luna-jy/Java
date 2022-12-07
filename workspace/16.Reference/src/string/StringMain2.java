package string;

public class StringMain2 {
	public static void main(String[] args) {
		String subject= "혼자 공부하는 자바";
		
		
		//문자열의 길이 :length
		System.out.println("길이: " + subject.length());
		
		//공백 문자를 제거 :trim
		subject = "   "+   subject;
		System.out.println(subject.trim());
		
		//문자열에서 특정문자를 변경 :replace
		subject = subject.replace("자", "Ja");
		System.out.println(subject);
		
		//영문자에서 대문자화 / 소문자화 하는 메소드 : toUpperCase / toLowerCase
		subject = subject.toUpperCase();
		System.out.println(subject);
		
		subject = subject.toLowerCase();
		System.out.println(subject);
		
		//문자열에서 특정 문자열의 시작위치를 반환하는 메소드 : indexOf
		//[   혼ja 공부하는 ja바]
		//공백도 세어준다		
		System.out.println(subject.indexOf("공부"));
		
		//문자열에서 문자열의 일부를 반환하는 메소드 :substring 
		//substring(대상, 시작인덱스, 끝위치+1)
		System.out.println(subject.substring(7,9));  //7-8 아니고 7-9!!!!!!
		
		//substring(대상, 시작인덱스) :시작위치 ~ 끝
		System.out.println(subject.substring(7));

		//문자열에서 특정 구분자로 문자열을 분리하는 메소드 : split
		String phone = "010-1234-5678"; 
		
		String[]p = phone.split("-");
		for (String data :  p) {
			System.out.println(data);
		}
		phone = String.join(" - ", p);
		System.out.println(phone);
		
		System.out.println("================");
		String subjects = " 자바, HTML, Script, css, Oracle, Servlet,Spring, Android";
		String s[]= subjects.split(",");
		for(String data :s) {
			System.out.println(data);
		}
		//배열변수의 데이터를 하나의 문자열로 만들어 반환하는 메소드: join
		 subject = String.join("/",s);
		 System.out.println(subject);
		 
		 String fruits = "사과, 배 , 귤/감";
		 String f[] = fruits.split(",");
		 for(String data : f) {
			 System.out.println(data);
		 }
		 
	}//main()
}//class
