package phone;
public class PhoneDetail {
	//선택한 Data를 조회해와 상세화면에 출력한다.
	private int idx;
	private PhoneDAO dao;
	PhoneDetail(int idx, PhoneDAO dao){
		this.idx = idx; 
		this.dao = dao;
		display();
	}
	void display() {
		//해당 Data를 조회해온다 (from DAO)
		PhoneDTO dto =dao.getPhoneOne(idx);
		//DTO  : 데이터를 조회해서 화면으로 가져오는데 사용하는 객체
		//	(Data Transfer Object) 
		//화면에 출력한다
		System.out.println("상세화면-----------------------");
		System.out.printf("이름: %s \n",dto.getName());
		System.out.printf("전화번호: %s \n",dto.getPhone());
		System.out.printf("메모: %s \n",dto.getMemo());
	}
}