package inner;

public class Outer {
	//클래스 내부에 또 다른 클래스를 선언할 수 있다 : 중첩클래스
	int field = 10;
	Outer() {
		System.out.println("Outer 클래스의 생성자");
	}
	void method() {
		System.out.println("Outer 클래스의 메소드");
	}
	
	
	class Inner1{
		int field = 20;
		Inner1() {
			System.out.println("Outer 클래스의 멤버인 Inner1의 생성자");
		}//Inner1()
		void method() {
			System.out.println("Outer 클래스의 멤버인 Inner1의 메소드");
		}//method()
	}//Inner1 class
	
	
	
	static class Inner2{
		int field = 30;
		Inner2(){
			System.out.println("Outer 클래스의 멤버인 Inner2의 생성자");
		}//Inner2()
		void method() {
			System.out.println("Outer 클래스의 멤버인 Inner2의 메소드");
		}//Inner2 method()
	}//Inner2 class
}//outer class 
