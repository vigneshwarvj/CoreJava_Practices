package in.vigneshvijay.globalfuncity;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.vigneshvijay.globalfuncity.exception.ValidationException;
import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.service.UserService;



public class TestCreateUser {
	@Test
	public void testCreateUserWithValidataInput(){
    	UserService userService = new UserService();
 		User newUser = new User();
 		newUser.setFirstName("Karan");
 		newUser.setLastName("Raja");
 		newUser.setEmail("karan@gmail.com");
 		newUser.setPassword("karan@1234");
        assertDoesNotThrow(()->{
    	   userService.create(newUser);
        });	
     }
	@Test
	public void testCreateUserWithInvalidataInput() {

		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class,()->{
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
		newUser.setEmail(null);
		newUser.setPassword("vv1234");
		newUser.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class,()->{
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
		newUser.setEmail("");
		newUser.setPassword("vv1234");
		newUser.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	
	// Password test case
		@Test
    public void testCreateUserWithPasswordNull() {
			UserService userservice = new UserService();
			
			// user 1
			User newUser = new User();
			
			newUser.setId(1234);
			newUser.setFirstName("Vignesh");
			newUser.setLastName("V");
			newUser.setEmail("vv@gmail.com");
			newUser.setPassword(null);
			newUser.setActive(true);
			newUser.toString();
			
			Exception exception = assertThrows(ValidationException.class, () -> {
				userservice.create(newUser);
			});
			String expectedMessage = "Password cannot be null or empty";
			String actualMessage = exception.getMessage();
			assertTrue(expectedMessage.equals(actualMessage));
		}
		
		@Test
	public void testCreateUserWithPasswordEmpty() {
			UserService userservice = new UserService();
			
			// user 1
			User newUser = new User();
			
			newUser.setId(1234);
			newUser.setFirstName("Vignesh");
			newUser.setLastName("V");
			newUser.setEmail("vv@gmail.com");
			newUser.setPassword("");
			newUser.setActive(true);
			newUser.toString();
			
			Exception exception = assertThrows(ValidationException.class, () -> {
				userservice.create(newUser);
			});
			String expectedMessage = "Password cannot be null or empty";
			String actualMessage = exception.getMessage();
			assertTrue(expectedMessage.equals(actualMessage));
		}
		
		
	// firstName test case
		@Test
	public void testCreateUserWithFirstNameNull() {
			UserService userservice = new UserService();
			
			// user 1
			User newUser = new User();
			
			newUser.setId(1234);
			newUser.setFirstName(null);
			newUser.setLastName("V");
			newUser.setEmail("vv@gmail.com");
			newUser.setPassword("vv1234");
			newUser.setActive(true);
			newUser.toString();
			
			Exception exception = assertThrows(ValidationException.class, () -> {
				userservice.create(newUser);
			});
			String expectedMessage = "FirstName cannot be null or empty";
			String actualMessage = exception.getMessage();
			assertTrue(expectedMessage.equals(actualMessage));
		}
		
		@Test
	public void testCreateUserWithFirstNameEmpty() {
			UserService userservice = new UserService();
			
			// user 1
			User newUser = new User();
			
			newUser.setId(1234);
			newUser.setFirstName("");
			newUser.setLastName("V");
			newUser.setEmail("vv@gmail.com");
			newUser.setPassword("vv1234");
			newUser.setActive(true);
			newUser.toString();
			
			Exception exception = assertThrows(ValidationException.class, () -> {
				userservice.create(newUser);
			});
			String expectedMessage = "FirstName cannot be null or empty";
			String actualMessage = exception.getMessage();
			assertTrue(expectedMessage.equals(actualMessage));
		}
}
