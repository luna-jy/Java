package string;

public class EmailMain {
	public static void main(String[] args) {
		String emails[] = {
				"hong2022@naver.com",
				"park901082@daum.net",
				"sim@hrd.go.kr" };
	
//for문 {}
	
	for(String email : emails) {
		int at = email.indexOf("@");  //@ 까지 가져옴
		System.out.printf("이메일 : %s 아이디: %s 서비스: %s /n", 
				email,email.substring(0,10), email.substring(at+1));
	}
	
	
//이메일 :hong2022@naver.com
//
////아이디 :hong2022 
//
for (String email : emails){
System.out.println(email);
String datas[] = email.split("@");
for (String e : datas) {
	System.out.println(e+" ");
}

//	
////서비스 :hong2022@naver.com




//
////아이디 : hong2022 서비스 :naver.com
//System.out.printf("%"+"@"+"%", id, service);

	}//main()
	}
}//class	

