package worker;

public class TempEmployee extends Employee{
	int period; //계약기간
	
	TempEmployee(String empNo, String name, String workType, int pay, int period){
		super ( empNo, name, workType, pay);
		this.period = period;
	}
	int getMonthlyPay() {
		return  pay / 12;
	}
}
