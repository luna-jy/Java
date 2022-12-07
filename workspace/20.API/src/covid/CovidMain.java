package covid;

import common.PublicAPI;

public class CovidMain {
	public static void main(String[] args) {
		PublicAPI api = new PublicAPI();
		//병원목록화면 생성
		HospitalList list = new HospitalList(api); 
		//목록화면 보기
		list.display();
	}
}
