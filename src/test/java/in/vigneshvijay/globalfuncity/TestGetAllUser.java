package in.vigneshvijay.globalfuncity;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.service.UserService;

public class TestGetAllUser {
    @Test
	public void getAllUser() {
		UserService userService = new UserService();
		Set<User> arr = userService.getAll();
		System.out.println(arr);
	}
    
    @Test
	public void getFindAll() {
		UserService userService = new UserService();
		User arr =  userService.findById(1);
	    System.out.println(arr);
	}
    
	@Test
	public void testUpdateUser() {
		UserService userService = new UserService();
	    User newUser = new User();
		newUser.setFirstName("Vicky");
		newUser.setLastName("V");
		userService.update(1, newUser);
	}	
	
    @Test
   	public void testDeleteUser() {
   		UserService userService = new UserService();
        User newUser = new User();
   		userService.delete(1);
   	}
	
    @Test
	public void getFindByEmailId() {
		UserService userService = new UserService();
		User arr =  userService.findByEmail("vv@gmail.com");
	    System.out.println(arr);
	}
    }