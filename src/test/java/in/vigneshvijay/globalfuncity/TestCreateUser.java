package in.vigneshvijay.globalfuncity;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.service.UserService;



public class TestCreateUser {
    private Object exceptedMessage;
@Test
    public void testCreateUserWithValidInput() {
        UserService userService = new UserService();
        
   		User newUser = new User();
   		
   		newUser.setId(1234);
   		newUser.setFirstName("Vignesh");
   		newUser.setLastName("V");
   		newUser.setEmail("vv@gmail.com");
   		newUser.setPassword("vv1234");
   		newUser.setActive(true);
   		
   		assertDoesNotThrow(() ->{
   			userService.create(newUser);
   		});
   		
   		
        
    }
    @Test
    public void testCreateUserWithInValidInput() {
    	UserService userService = new UserService();
    	Exception exception = assertThrows(Exception.class,() -> ){
    		userService.create(null);
    	});
    	String expectedMessage = "User Invalid";
    	String actualMessage = exception.getMessage();
    	
    	assertTrue(exceptedMessage.equals(actualMessage));
    }
}
