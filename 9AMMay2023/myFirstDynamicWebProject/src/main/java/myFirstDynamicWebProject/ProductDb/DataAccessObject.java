package myFirstDynamicWebProject.ProductDb;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DataAccessObject<S> {
	public void connect() throws ClassNotFoundException, SQLException;
	public void disconnect() throws ClassNotFoundException, SQLException;
	public int save(S t) throws ClassNotFoundException, SQLException;
	public S getOne(Long id) throws ClassNotFoundException, SQLException;
	public ArrayList<S> getAll() throws ClassNotFoundException, SQLException;
	public int update(S t) throws ClassNotFoundException, SQLException;
	public int delete(long id) throws ClassNotFoundException, SQLException;
}
