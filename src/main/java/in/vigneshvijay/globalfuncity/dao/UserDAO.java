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
	public Set<User> findAll() throws RuntimeException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Set<User> userList = new HashSet<>();
		try {
		    String query = "SELECT * FROM users WHERE isActive = 1";
		    conn = ConnectionUtil.getConnection();
		    ps = conn.prepareStatement(query);
		    rs = ps.executeQuery();
		    while(rs.next()) {
		    	User user = new User();
		    	user.setId(rs.getInt("id"));
		    	user.setFirstName(rs.getString("first_name"));
		    	user.setLastName(rs.getString("last_name"));
		    	user.setEmail(rs.getString("email"));
		    	user.setPassword(rs.getString("password"));
		    	user.setActive(rs.getBoolean("is_active"));
		    	userList.add(user);
		    }
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}
		finally {
			ConnectionUtil.close(conn, ps, rs);
		}
		return userList;
	}

	@Override
	public User findById(int userId) {
		Set<User> userList = UserList.listOfUsers;
		User userMatch = null;

		for (User user : userList) {
			if (user.getId() == userId) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}

	@Override
	public void create(User newUser) {
		Set<User> arr = UserList.listOfUsers;
		arr.add(newUser);
	}
	
	@Override
	public void update(User updatedUser) {
		Set<User> userList = UserList.listOfUsers;
		for (User user : userList) {
			if (user.getId() == updatedUser.getId()) {
				user.setFirstName(updatedUser.getFirstName());
				user.setLastName(updatedUser.getLastName());
				user.setPassword(updatedUser.getPassword());

				break;
			}
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