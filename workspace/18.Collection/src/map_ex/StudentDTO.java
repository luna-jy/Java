package map_ex;

public class StudentDTO {
	
	String name, gender, phone;
	
	public StudentDTO (String name, String gender, String phone){
			this.name = name;
			this.gender = gender;
			this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
