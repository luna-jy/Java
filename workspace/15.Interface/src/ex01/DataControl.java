package ex01;

public class DataControl implements DataDAO{
	DeleteDAO dao = new DeleteDAO();
//	int width = 0;
//	String text ;
	@Override
	public void insert() {
		dao.insert(); //InsertDAO의 메소드
	}

	@Override
	public void list() {
		dao.list(); //ListDAO의 메소드가 호출됨
	}

	@Override
	public void update() {
		dao.update(); //UpdateDAO의 메소드가 호출됨
	}

	@Override
	public void delete() {
		dao.delete(); //DeleteDAO의 메소드가 호출됨
	}

}
