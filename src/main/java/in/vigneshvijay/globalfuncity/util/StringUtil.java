package in.vigneshvijay.globalfuncity.util;

import in.vigneshvijay.globalfuncity.exception.ValidationException;

public class StringUtil {
	
   public static void RejectIfInvalidString(String input, String inputName) throws ValidationException {
	    if(input == null || "".equals(input.trim())) {
	    	throw new ValidationException(inputName.concat(" cannot be null or empty"));
	    }
   }
   
   
   public static boolean IsValidString(String input, String inputName)  {
	    if(input == null || "".equals(input.trim())) {
	    	return false;
	    }
		return true;
  }
   
   public static boolean IsInvalidString(String input, String inputName)  {
	    if(input == null || "".equals(input.trim())) {
           return false;
	    }
	    return true;
  }
   
  }
   

