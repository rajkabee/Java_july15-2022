package j2se.dursikshya.abstraction;

public interface DAO {
	public void connect();
	public void disconnect();
	public void save();
	public void getOne();
}
