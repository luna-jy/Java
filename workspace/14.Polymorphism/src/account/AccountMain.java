package account;

public class AccountMain {
	public static void main(String[] args) {
		//상속관계가 있을때
		//생성한 sub클래스 객체는 super의 타입으로 표현 가능: 다형성
		Account hong = new Account("111-22-333", "홍길동");
		
//		MinusAccount park
		Account park
		= new MinusAccount("222-33-4444", "박문수", 500000);
		
		Account sim
		= new CheckCardAccount("333-44-5555", "심청"
							, "6666-9999-1111-2222");
		
		infoAccount(hong);
		infoAccount(park);
		infoAccount(sim);
	}
	/*
	static void infoAccount(CheckCardAccount who) {
		System.out.println("통장 -----------");
		System.out.println("예금주 " + who.owner);
		System.out.println("계좌번호 " + who.accountNo);
		System.out.println("잔액 " + who.balance);
		System.out.println("카드번호 " + who.cardNo);
	}
	
	static void infoAccount(MinusAccount who) {
		System.out.println("통장 -----------");
		System.out.println("예금주 " + who.owner);
		System.out.println("계좌번호 " + who.accountNo);
		System.out.println("잔액 " + who.balance);
		System.out.println("한도 " + who.minusLimit);
	}
	*/
	static void infoAccount(Account who) {
		System.out.println("통장 -----------");
		System.out.println("예금주 " + who.owner);
		System.out.println("계좌번호 " + who.accountNo);
		System.out.println("잔액 " + who.balance);
		//실제 생성된 객체가 무엇인지에 따라
		//객체생성(생성된 객체가 메모리에 올라간다) : 인스턴스화
		if( who instanceof MinusAccount ) {
			//서브의 메소드, 필드에 대해 접근가능
			//Account -> MinusAccount 타입으로 변환: cast
			//변환된타입 변수명 = (변환될타입)원래타입의변수
			//int no1 = 10;
			//int -> byte
			//byte 변수명 = (byte)no
			//byte no2 = (byte)no1;
			//수퍼클래스의 타입을 서브클래스타입으로 형변환: downCast
			//서브클래스의 타입을 수퍼클래스타입으로 형변환: upCast
			MinusAccount minus = (MinusAccount)who;
			System.out.println("한도 " + minus.minusLimit);
		}
		if( who instanceof CheckCardAccount ) {
			CheckCardAccount check = (CheckCardAccount)who;
			System.out.println("카드번호 " + check.cardNo);
			try{
				System.out.println("카드번호 " + check.pay(1000) );
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
