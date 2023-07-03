package in.vigneshvijay.globalfuncity.service;

import in.vigneshvijay.globalfuncity.dao.UserDAO;

import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.validation.UserValidator;

public class UserService {

	public User[] getAll() {
		UserDAO userDao = new UserDAO();
		
		User[]  userList = userDao.findAll(); 
		
		//System.out.println();
				
	     for(int i = 0; i < userList.length; i++) {
	    	 System.out.println(userList[i]);
	     }
	     return userList;
	}
	
	public void create(User newUser) throws Exception {
		UserValidator.validate(newUser);
		
		UserDAO userDao = new UserDAO(); 
		userDao.create(newUser);

		
	}
	
	public void update() {
		UserDAO userDao = new UserDAO();
		
		User newUser2 = new User();
		
		newUser2.setFirstName("G");
		newUser2.setLastName("W");
		newUser2.setPassword("g123");
		
		userDao.update(newUser2);
	}
	
}
