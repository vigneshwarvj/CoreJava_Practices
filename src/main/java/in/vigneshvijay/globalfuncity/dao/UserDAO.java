package in.vigneshvijay.globalfuncity.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import in.vigneshvijay.globalfuncity.interfaces.UserInterface;
import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.util.ConnectionUtil;

public class UserDAO implements UserInterface {
	@Override
	public Set<User> findAll() throws RuntimeException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Set<User> userList = new HashSet<>();
		try {
			String query = "SELECT * FROM user WHERE is_active = 1";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);
			// rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("is_active"));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		} finally {
			ConnectionUtil.close(conn, ps, rs);
		}
		return userList;
	}

	@Override
	public User findById(int userId) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;

		try {
			String query = "SELECT * FROM user WHERE id = 1 AND id = ?";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);

			ps.setInt(1, userId);
			rs = ps.executeQuery();

			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("is_active"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		} finally {
			ConnectionUtil.close(conn, ps, rs);
		}
		return user;
	}

	@Override
	public void create(User newUser) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
        try {
        	String query = "INSERT INTO user (first_name, last_name, email, password) VALUES (?, ?, ?, ?)";
        	conn = ConnectionUtil.getConnection();
        	ps = conn.prepareStatement(query); 
        	
        	ps.setString(1, newUser.getFirstName());
        	ps.setString(2, newUser.getLastName());
        	ps.setString(3, newUser.getEmail());
        	ps.setString(4, newUser.getPassword());
        	
        	ps.executeUpdate();
        	
        	System.out.println("User has been created Successfully!");
        	
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } finally {
        	ConnectionUtil.close(conn, ps);
        }
	}

	@Override
	public void update(User updatedUser) {
          Connection conn = null;
          PreparedStatement ps = null;
          ResultSet rs = null;
          
       try {
        String query = "UPDATE ";
      	conn = ConnectionUtil.getConnection();
      	ps = conn.prepareStatement(query); 
      	
      	ps.setString(1, updatedUser.getFirstName());
      	ps.setString(2, updatedUser.getLastName());
      	
      	ps.executeUpdate();
      	
      	System.out.println("User has been updated Successfully!");
      	
      } catch (Exception e) {
      	e.printStackTrace();
          System.out.println(e.getMessage());
          throw new RuntimeException();
      } finally {
      	ConnectionUtil.close(conn, ps);
      }

	}

	@Override
	public void delete(int userId) {
		Set<User> userList = UserList.listOfUsers;
		for (User user : userList) {
			if (user == null) {
				continue;
			}
			if (user.getId() == userId) {
				user.setActive(false);
				break;
			}
		}
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated metho
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}