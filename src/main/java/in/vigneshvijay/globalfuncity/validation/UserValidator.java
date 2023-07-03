package in.vigneshvijay.globalfuncity.validation;

import in.vigneshvijay.globalfuncity.model.User;

public class UserValidator {

	public static void validate(User user) throws Exception{
		if(user == null) {
			throw new Exception("User Invalid");
		}
		if(user.getEmail() == null || ("").equals(user.getEmail().trim())) {
			throw new Exception("Email cannot be null or empty");
		}
		
		
		if(user.getPassword() == null || ("").equals(user.getPassword().trim())) {
			throw new Exception("Password cannot be null or empty");
		
	    }
		
		if(user.getFirstName() == null || ("").equals(user.getFirstName().trim())) {
			throw new Exception("FirstName cannot be null or empty");
		
	    }
		
	

}
}
