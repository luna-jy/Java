package person;

public class Student extends Person{
	String studentNo;
	Student(String name, int age
				, String studentNo){
		super(name, age); //수퍼클래스 Person생성자 호출
		this.studentNo = studentNo;
	}
	void go() {
		System.out.println(name + " 학교에 간다");
	}
}
