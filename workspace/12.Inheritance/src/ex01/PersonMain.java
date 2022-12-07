package ex01;

public class PersonMain {
public static void main(String[] args) {
	//1) new Person(); //사람객체 생성
	//나그네인 사람객체 생성
	Person who = new Person();
	who.name = "나그네";
	who.age = 30;
	who.eat();
	who.sleep();
	
	Student hong= new Student();
	hong.name = "홍길동";
	hong.age = 24;
	hong.studentNo = "220005";
	hong.eat();
	hong.sleep();
	hong.gotoSchool();
	
	Worker park = new Worker();
	park.name ="박문수";
	park.age = 43;
	park.workerNo = "150042";
	park.eat();
	park.sleep();
	park.gotoWork();
	
}//main
}//class
