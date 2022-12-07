
//행위 정보 (기능, 동작, 함수)를 저장하는 Class → 메소드 집합 
//DAO class를 통해 DataBase에 접속하고 사용자의 요청을 처리
public class PersonDAO {
	//출력 메소드  : Getters Method 사용
	public void display(PersonDTO[] person) {
		
	//단순 for문을 이용한 출력	
		for (int i = 0; i < person.length; i++) {
			System.out.print(person[i].getName()+"\t");
			System.out.print(person[i].getAge()+"\t");
			System.out.print(person[i].getGender()+"\t");
			System.out.print(person[i].getTel()+"\t");
			System.out.print(person[i].getAddr()+"\n");
		}//for
		System.out.println("=================================================");
	//향상된 for문을 이용한 출력
		for (PersonDTO  dto : person) {
			System.out.println(dto.getName()+"\t");
			System.out.println(dto.getAge()+"\t");
			System.out.println(dto.getGender()+"\t");
			System.out.println(dto.getTel()+"\t");
			System.out.println(dto.getAddr()+"\n");
		}
	}//display()
}
