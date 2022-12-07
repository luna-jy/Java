package drink3;

import java.util.Scanner;

import drink.DrinkDTO;

public class Drink {
	DrinkDTO[] drinks; //변수를 선언하고
	Scanner sc;
	Drink(DrinkDTO[] drinks, Scanner sc) { //생성자 -매개변수를  선언한다. 
		this.drinks = drinks; //클래스의 다른 생성자를 호출한다
		this.sc = sc;

	}
}
