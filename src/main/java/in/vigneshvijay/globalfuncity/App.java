package in.vigneshvijay.globalfuncity;

import in.vigneshvijay.globalfuncity.dao.UserDAO;
import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     UserService userService = new UserService();
     
		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("V");
		newUser.setEmail("vv@gmail.com");
		newUser.setPassword("vv1234");
		newUser.setActive(true);
		
		//User2
//		User newUser2 = new User();
//		newUser2.setId(1235);
//		newUser2.setFirstName("Hello");
//		newUser2.setLastName("W");
//		newUser2.setEmail("hello@gmail.com");
//		newUser2.setPassword("hello1234");
//		newUser2.setActive(true);
		
//		userDao.create(newUser2);
		
		
     userService.create(newUser);
     userService.getAll();
     
	}

}

