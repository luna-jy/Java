package animal;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog("진돗개");
		dog.sound();
		
		Animal dog2 = new Dog("말티즈");
		dog2.sound();
		//상속의 관계가 있을때 호출된 메소드가 override 되어 있다면
		//override된 메소가 호출된다
		
//		Cat cat = new Cat("코리안 숏헤어");
//		cat.sound();
//		
//		Chicken chicken = new Chicken("오골계");
//		chicken.sound();
	}
}
