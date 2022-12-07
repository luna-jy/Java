import java.text.DecimalFormat;

public class Student {
//멤버변수 (필드.속성) 선언 : 상태정보▶ DTO Class, VO Class, Java Beans
	String name; 
	int kor, eng, mat, sum; 
	double avg;
	
//총점 계산 멤버 메소드 정의 :행위정보▶ DAO Class
	public void getSum() {
		sum=kor+eng+mat;
	}//getSum()

//평균계산 멤버메소드 정의:행위정보▶ DAO Class
	public void getAvg() {
		//avg=sum/3; //정수값만 출력
		//avg = (double)sum/3; //나눗셈의 연산결과는 실수가 나올 수 있다. - 더블로 캐스팅 변환
		avg= sum/3.0;		
	}//getAvg()

//출력메소드 정의 (평균은 소수 둘째자리까지 출력): 행위정보▶ DAO Class
	public void display() {
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+sum);
		DecimalFormat df = new DecimalFormat("0.00");  //소수점 둘째자리까지 표시
		System.out.println("평균 : "+df.format(avg));
	}//display()
}//class
