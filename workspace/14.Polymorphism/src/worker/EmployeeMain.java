package worker;

import java.text.DecimalFormat;

public class EmployeeMain {
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#,###,###,###");
	
	//RegularEmployee hong
	RegularEmployee hong = new RegularEmployee("22001","홍길동","정규직", 24000000, 10);
		employeeInfo(hong, df);
		
	//	TempEmployee park
	 TempEmployee park =new TempEmployee("22101","박문수","비정규직", 20000000, 2);
	 employeeInfo(park, df);
	
		
	//	DailyEmployee 
	 DailyEmployee lim =new DailyEmployee("22001","임꺽정","일용직", 80000, 15);
	 employeeInfo(lim,df);
		
		
	
		
		
	
	}//main()
	//사원정보를 출력하는 메소드
	static void employeeInfo (Employee what, DecimalFormat df)  {		
		System.out.println("사번 : " + what.empNo);
		System.out.println("성명 : " + what.name);
		System.out.println("근로형태 : " + what.workType);
		System.out.println("월 급여 : " + df.format(what.getMonthlyPay()));
	
		
	//정규직 직원의 보너스가 몇 %인지	보너스 출력
	
	if(what instanceof RegularEmployee) {
		//what : Employee → RegularEmployee  
		RegularEmployee emp = (RegularEmployee)what;
		System.out.println("보너스: " + emp.bonus + "%" );
	}//비정규직 직원의 근로계약기간이 몇 년인지 근로기간도 출력
	else if  (what instanceof TempEmployee ) {   
		//what : Employee →TempEmployee 
		TempEmployee emp = (TempEmployee)what; 
		System.out.println("계약기간: " + emp.period + "년");
	
	}  //일용직 직원의 일당이 얼마인지 일당도 출력
		else if (what instanceof DailyEmployee) {
		//what : Employee →DailyEmployee
		DailyEmployee emp = (DailyEmployee)what;
		System.out.println("일당: " + df.format(emp.pay) + "원");
	}
	}//employeeInfo()	
	
	}//class
