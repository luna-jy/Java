package map_ex;

import java.util.HashMap;

public class MapMain {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		//데이터 저장 메소드 : .put()
		map.put("홍길동", "개발자반"); 
		map.put("심청", "디자인반");
		map.put("박문수", "회계반");
		
		//데이터 조회 메소드 : .get()
		String _class = map.get("홍길동");
		System.out.println(_class); //키를 꽂아서 데이터를 확인
		
		//데이터를 삭제 : remove()
		map.remove("심청"); //심청이라는 데이터를 삭제		
		System.out.println(map.get("심청"));
		
		map.put("홍길동", "회계반");  //홍길동이란 키를 꽂고 회계반을 넣는다  
		// -> 똑같은 키 사용해서 넣는다는 것은 데이터를 바꿔버림 (홍길동 1 홍길동 2 동명이인인 경우 내용이 바뀌는것)
		//데이터가 바뀌어 담게된다. 
		System.out.println(map.get("홍길동")); //홍길동은 회계반으로 담아지게됨.
		
		
	}//main()
}
