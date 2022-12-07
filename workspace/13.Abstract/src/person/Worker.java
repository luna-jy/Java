package person;

public class Worker extends Person{
	String workerNo;
	Worker(String name, int age, String workerNo){
		super(name, age);
		this.workerNo = workerNo;
	}
	void go() {
		System.out.println(name +" 회사에 간다");
	}
}
