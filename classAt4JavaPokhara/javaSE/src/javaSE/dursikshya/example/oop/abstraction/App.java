package javaSE.dursikshya.example.oop.abstraction;

public class App {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		dao.connect();
		dao.save(new Product());
		System.out.println(dao.getOne(0));
		dao.disconnect();
		
		DataAccessObject empDao = new EmployeeDao();
		empDao.connect();
		empDao.save(new Employee());
		System.out.println(empDao.getOne(0));
		empDao.disconnect();
	}
	

}
