package in.vigneshvijay.globalfuncity.service;

import in.vigneshvijay.globalfuncity.dao.UserDAO;
import in.vigneshvijay.globalfuncity.model.User;

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
	
	public void create() {
		
		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("V");
		newUser.setEmail("vv@gmail.com");
		newUser.setPassword("vv1234");
		newUser.setActive(true);
		
		UserDAO userDao = new UserDAO(); 
		userDao.create(newUser); 
	}
	
}
