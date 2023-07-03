package in.vigneshvijay.globalfuncity.validation;

import in.vigneshvijay.globalfuncity.exception.ValidationException;
import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws Exception{
		if(user == null) {
			throw new ValidationException("User Invalid");
		}
		
//		if(user.getEmail() == null || ("").equals(user.getEmail().trim())) {
//			throw new ValidationException("Email cannot be null or empty");
//		}
		
		StringUtil.RejectIfInvalidString(user.getEmail(),"Email");

		StringUtil.RejectIfInvalidString(user.getPassword(), "Password");
	
		StringUtil.RejectIfInvalidString(user.getFirstName(), "FirstName");
//		
	}
	
	
	
//		if(user.getPassword() == null || ("").equals(user.getPassword().trim())) {
//			throw new ValidationException("Password cannot be null or empty");
//		
//	    }
		

		
//		if(user.getFirstName() == null || ("").equals(user.getFirstName().trim())) {
//			throw new ValidationException("FirstName cannot be null or empty");
//		
//	    }
		

		
	

}

