package worker;

public class DailyEmployee extends Employee{
	int workDays; 
	
	DailyEmployee(String empNo, String name, String workType, int pay, int workDays){
		super(empNo, name, workType, pay);
		this.workDays = workDays;
	}
	int getMonthlyPay() {
		return workDays * pay;
	}
}
