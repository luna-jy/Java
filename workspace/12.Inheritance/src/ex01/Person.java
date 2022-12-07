package ex01;
//부모클래스 (상위클래스) super 클래스: person
//공통내용을 담고있다. 

public class Person {
	//사람이름, 나이	
			String name;
			int age;
		
		//메소드 선언	
			//1.먹는다
			void eat(){
				System.out.println(name + "먹는다");
			}
			//2.잠을 잔다
			void sleep(){
				System.out.println(name + "잠을 잔다");
			}	
}
