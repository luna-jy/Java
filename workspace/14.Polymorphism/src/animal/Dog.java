package animal;

public class Dog extends Animal{
	//String kind;
	Dog(String kind){
		super(kind);
		//this.kind = kind;
	}
	void sound() {
		System.out.println(kind + " 멍멍멍!");
	}
}
