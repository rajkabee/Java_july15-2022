package coreJava.basics.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PlantDao extends AbstractDao<Plant> {
	String sql;
	PreparedStatement pstm;
	int i ,id;
	ResultSet rs;
	@Override
	public int save(Plant p) throws ClassNotFoundException, SQLException {
		sql = "insert into plants (name, price) values (?,?)";
		connect();
		pstm = con.prepareStatement(sql);
		pstm.setString(1, p.getName());
		pstm.setFloat(2, p.getPrice());
		i= pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Plant getOne(int id) throws ClassNotFoundException, SQLException {
		sql = "select * from plants where id = ?";
		connect();
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		Plant plant = new Plant();
		if(rs.next()) {
			plant.setId(rs.getInt("id"));
			plant.setName(rs.getString("name"));
			plant.setPrice(rs.getFloat("price"));
		}
		disconnect();
		return plant;
	}

	@Override
	public ArrayList<Plant> getAll() throws ClassNotFoundException, SQLException {
		sql = "select * from plants";
		connect();
		pstm = con.prepareStatement(sql);
		rs = pstm.executeQuery();
		ArrayList<Plant> plants = new ArrayList<>();
		Plant plant = new Plant();
		while(rs.next()) {
			plant.setId(rs.getInt("id"));
			plant.setName(rs.getString("name"));
			plant.setPrice(rs.getFloat("price"));
			plants.add(plant);
		}
		disconnect();
		return plants;
	}

	@Override
	public int update(Plant plant) throws ClassNotFoundException, SQLException {
		connect();
		sql = "update plants set name = ?, price = ? where id = ?";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, plant.getName());
		pstm.setFloat(2, plant.getPrice());
		pstm.setInt(3, plant.getId());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		connect();
		sql = "delete from plants where id = ?";
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

}
