package dev.mendoza.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dev.mendoza.models.Breed;
import dev.mendoza.models.Cat;
import dev.mendoza.utils.JDBCConnection;

public class CatDAO implements GenericRepository<Cat> {

	private Connection conn = JDBCConnection.getConnection();
	
	@Override
	public Cat add(Cat c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cat getById(Integer id) {
		String sql = "SELECT c.id, c.name, c.age, b.id AS breed_id, b.breed FROM " 
				+ "cats c LEFT JOIN breeds b " 
				+ "ON c.breed = b.id "
				+ "WHERE c.id = ?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				Cat c = new Cat();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setAge(rs.getInt("age"));
				
				Breed b = new Breed();
				b.setId(rs.getInt("breed_id"));
				b.setBreed(rs.getString("breed"));
				
				c.setBreed(b);
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cat> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cat change) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cat c) {
		// TODO Auto-generated method stub
		
	}

}
