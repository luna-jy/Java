package phone;
//DAO (데이터와 연결하여 사용하는 Object)
public class PhoneDAO {
	//전화번호를 20개까지 등록할 수 있다. 
	private PhoneDTO phoneList[] = new PhoneDTO[20];

	
	//전화번호 목록(phoneList)을 조회한다
	public PhoneDTO[] getPhoneList() {
		return phoneList;
	}
	
	public void setPhoneList(PhoneDTO[] phoneList) {
		this.phoneList = phoneList;
	}
	
	//선택한 전화번호 상세 정보를 조회한다.
	public PhoneDTO getPhoneOne(int no)  {
		return phoneList[no-1];
	}
	//

}//class

