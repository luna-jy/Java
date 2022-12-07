package data;

import java.io.Serializable;

public class Person implements Serializable {
	String name;
	int age;
	char gender;
	
	


	Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
