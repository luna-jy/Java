package ex02;

public class DataConrtol {
	DataDAO dao;
	public void insert() {
		//InsertDAO dao = new InsertDAO();
		//Data dao = new InsertDAO(); //다형성에 의해 가능함
		dao = new InsertDAO();
		dao.insert();
	}
	public void list() {
		//ListDAO dao = new ListDAO();
		dao = new ListDAO();
		dao.list();
	}
	public void update() {
		//UpdateDAO dao = new UpdateDAO();
		dao = new UpdateDAO();
		dao.update();
	}
	public void delete() {
		//DeleteDAO dao = new DeleteDAO();
		dao = new DeleteDAO();
		dao.delete();
	}
	
}
