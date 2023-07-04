package in.vigneshvijay.globalfuncity.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.lang.Exception;

import in.vigneshvijay.globalfuncity.exception.ValidationException;
import in.vigneshvijay.globalfuncity.model.Task;
import in.vigneshvijay.globalfuncity.util.StringUtil;


public class TaskValidator {

		
	    public static void Validate(Task task) throws Exception {
	        if (task == null) {
	            throw new ValidationException("Invalid Task Input");
	        }

	        StringUtil.RejectIfInvalidString(task.getName(), "Name");
	        
	        StringUtil.RejectIfInvalidString(task.getDueDate(), "DueDate");

	        String date = task.getDueDate();
	        
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
	        LocalDate dueDate = LocalDate.parse(date, formatter);
	        
	        LocalDate currentDate = LocalDate.now();
	        
			if(dueDate.equals(currentDate) || dueDate.isBefore(currentDate)) {
				throw new ValidationException("Due date should be in future");
				
			}
	    }
		
}

