package goods;
public class GoodsInfo {
	String company, code, name;
	int standard, discount;
	
	
	//할인율을 제외한 필드를 모두 초기화하는 생성자
	GoodsInfo(String name,String company,String code, int standard){
		this.name = name;
		this.company = company;
		this.code = code;
		this.standard = standard;
	}
	
	//모든 필드 초기화 하는 생성자 
	GoodsInfo(String name,String company,String code, int standard,int discount){
		this(name,company,code,standard);	
		this.discount = discount;
	}
	
	
	//할인율을 변경하는 메소드
	int discountChange (int discount) {
		this.discount = discount;
		return discount;
	}
	
	//판매가를 반환하는 메소드
	int sale () {
		return (standard/100)*(100-discount);
	}
}
