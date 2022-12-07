package phone;

public class PhoneDTO {
	//전화번호, 성명, 메모
	private String phone, name, memo;  
	// 생성자에서 메소드를 호출하기
		//	setPhone(phone);
		//	setName(name);
			
	public PhoneDTO(String phone, String name, String memo) {
		this(phone,name); 	// 생성자에서 생성자를 호출하기 :클래스명이 아니라 this로 호출.
							// 					다른 처리는 생성자 호출문 뒤에 한다.
		this.memo = memo;
	}
	public PhoneDTO(String phone, String name) {
		this.phone = phone;
		this.name = name;
	} 
	

		
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	

	
	
	

}//class
