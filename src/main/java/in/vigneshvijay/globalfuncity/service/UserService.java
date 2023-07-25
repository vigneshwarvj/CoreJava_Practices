package in.vigneshvijay.globalfuncity.service;

import java.util.Set;

import in.vigneshvijay.globalfuncity.dao.UserDAO;

import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.validation.UserValidator;

public class UserService {
	public Set<User> getAll() {

		UserDAO userDao = new UserDAO();

		Set<User> userList = userDao.findAll();

		for (User user : userList) {
			System.out.println(user);
		}

		return userList;

	}

	public void create(User newUser) throws Exception {
		
		UserValidator.validate(newUser);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);

	}
	
	public void update() {
		User updatedUser = new User();
		updatedUser.setFirstName("Vignesh");
		updatedUser.setLastName("V");
		updatedUser.setEmail("vv@gmail.com");
		updatedUser.setId(15);
		updatedUser.setPassword("Vv@2412");
		updatedUser.setActive(true);
		
		UserDAO userDao = new UserDAO();
		userDao.update(updatedUser);
		
	}
	
	public void delete(int userId) {
		UserDAO userDao = new UserDAO();
		userDao.delete(userId);
	}
	
	public User findById(int userId) {
		UserDAO userDao = new UserDAO();
		return userDao.findById(userId);
		
	}
//	
//	public User findByEmail(String userEmail) {
//		UserDAO userDao = new UserDAO();
//		userDao.findByEmail(userEmail);
//	}
}
