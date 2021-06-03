package dev.mendoza.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.mendoza.models.Breed;
import dev.mendoza.utils.JDBCConnection;

public class BreedDAO implements GenericRepository<Breed>{

	private Connection conn = JDBCConnection.getConnection();
	
	@Override
	public Breed add(Breed b) {
		String sql = "INSERT INTO breeds VALUES (default, ?);";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getBreed());
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				b.setId(rs.getInt("id"));
				return b;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Breed getById(Integer id) {
		String sql = "SELECT * FROM breeds WHERE id = ?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id); // replaces 1st ? in sql String
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Breed b = new Breed();
				b.setId(rs.getInt("id"));
				b.setBreed(rs.getString("breed"));
				return b;
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Breed> getAll() {
		List<Breed> breeds = new ArrayList<Breed>();
		String sql = "SELECT * FROM breeds;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Breed b = new Breed();
				b.setId(rs.getInt("id"));
				b.setBreed(rs.getString("breed"));
				breeds.add(b);
			}
			return breeds;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update(Breed change) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Breed b) {
		// TODO Auto-generated method stub
		
	}

}
