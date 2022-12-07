package account;

public class MinusMain {
	public static void main(String[] args) {
	MinusAccount sim = new  MinusAccount("555-88-7897", "심청", 1000000);
	
	sim.deposit(100000);
	try {
		
	int out = sim.withdraw(500000);
		System.out.println("출금액 :"+out);
		System.out.println("통장잔고: " +sim.balance);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
}
