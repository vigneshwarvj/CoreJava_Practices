package in.vigneshvijay.globalfuncity;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.service.UserService;



public class TestCreateUser {
	@Test
    public void testCreateUserWithValidataInput(){
   	UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("V");
		newUser.setEmail("vv@gmail.com");
		newUser.setPassword("vv1234");
		newUser.setActive(true);
       assertDoesNotThrow(()->{
   	   userService.create(newUser);
       });
		
		
    }
	@Test
	public void testCreateUserWithInvalidataInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(null);
		});
		String expectedMessage = "User Invalid";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithEmailNull() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("V");
		newUser.setEmail("vv@gmail.com");
		newUser.setPassword("vv1234");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserEmailWithEmailEmpty() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Vignesh");
		newUser.setLastName("V");
		newUser.setEmail("vv@gmail.com");
		newUser.setPassword("vv1234");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
}
