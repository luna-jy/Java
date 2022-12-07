public class Test {
	
int add(int no1, int no2) {
	int no = no1 + no2;
	return no;
//	System.out.println(no);
}
}


/*
public class Test Main {
	public static void main(String[] args){
	Test test = new Test();
	int no = test.add(10,5);
	System.out.println(no);
	
	
}
10은 test 클래스 내부의 add 메소드 파라미터 no1, 
5는 test 클래스 내부의 add 메소드 파라미터 no2, 

test클래스의 add메소드는 결과가 얼마인지 안다.
System.out.println(no);  를 통해 결과 값 15 출력됨.

TestMain에서 결과값을 가져오고 싶으므로 
return으로 반환 시켜 (대신 void는 return값없으니까 안돼 )


*/