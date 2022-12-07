package ex01;
//부모클래스에서 상속받는다. (공통내용) : extends ~
// 부모클래스 (상위클래스) super 클래스: person
// 자식 클래스 (하위클래스) sub 클래스 : student
public class Student extends Person{
//학생명, 나이, 학번
	String studentNo; 
	
	//3.학교를 간다
	void gotoSchool(){
		System.out.println(name + "학교를 간다");
		
	}
}//class
