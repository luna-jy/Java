package object;

public class MemberDTO {
	//모든 클래스는 Object클래스를 상속받으므로 extends Object 필요 x super -> Object
	
	
	//메소드 오버라이딩
	public String toString() {
		return
		"이름: " + name 
		+ "\n아이디: " + id
		+ "\n비밀번호: " + pw  
		+ "\n성별: " + gender;
		}
	

	
	
	
	//같은 패키지의 다른 클래스 또는 다른 패키지에 있는 다른 클래스
	private String name, id, pw, gender;
	public MemberDTO(String name, String id, String pw, String gender){
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.pw = pw;
		}
	void setName(String name) {
		this.name = name;
		}	
	
	public String getName() {
		return name;
	}
	public String setName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
