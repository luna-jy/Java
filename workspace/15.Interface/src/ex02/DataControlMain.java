package ex02;

import ex01.DataControl;

public class DataControlMain {
public static void main(String[] args) {
	DataControl control = new DataControl();
	control.insert();
	control.list();
	control.update();
	control.delete();
}
}
