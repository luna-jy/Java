package animal;

public class animal {
	String breeds;
	animal(){}
	
	animal(String breeds){
		this.breeds = breeds;
	}
	
	void eat() {
		System.out.println(breeds+"는 먹는다");
	}
	void sleep() {
		System.out.println(breeds+"는 잠을 잔다");
	}

}
