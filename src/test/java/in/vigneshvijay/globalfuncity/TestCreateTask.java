package in.vigneshvijay.globalfuncity;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.vigneshvijay.globalfuncity.exception.ValidationException;
import in.vigneshvijay.globalfuncity.model.Task;
import in.vigneshvijay.globalfuncity.service.TaskService;

public class TestCreateTask{

	@Test
    public void testCreateTaskWithValidataInput() {
        TaskService taskService = new TaskService();
        Task newTask = new Task();
        newTask.setId(123);
        newTask.setDueDate("2023-12-24");
        newTask.setName("Task Management");
        newTask.setActive(true);

        assertDoesNotThrow(() -> {
            taskService.create(newTask);
        });
    }
	
	@Test
	public void testCreateTaskWithInvalidataInput() {
		TaskService taskService = new TaskService();
		Exception exception = assertThrows(ValidationException.class,()->{
			taskService.create(null);
		});
		String expectedMessage = "Invalid Task Input";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	
	 @Test
		public void testCreateTaskWithNameNull() {
		 TaskService taskService = new TaskService();
		    Task newTask = new Task();
	 		newTask.setId(123);
	 		newTask.setDueDate("2023-12-24");
	 		newTask.setName(null);
	 		newTask.setActive(true);

			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "Name cannot be null or empty";
			String actualMessage = exception.getMessage();

			assertTrue(expectedMessage.equals(actualMessage));
		}	
	 
	    @Test
		public void testCreateTaskWithNameEmpty() {
	    	TaskService taskService = new TaskService();
	    	Task newTask = new Task();
	 		newTask.setId(123);
	 		newTask.setDueDate("2023-12-24");
	 		newTask.setName("");
	 		newTask.setActive(true);

			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "Name cannot be null or empty";
			String actualMessage = exception.getMessage();

			assertTrue(expectedMessage.equals(actualMessage));
		}
	    
	    
	    @Test
		public void testCreateTaskWithDueDateNull() {
		 TaskService taskService = new TaskService();
		    Task newTask = new Task();
	 		newTask.setId(123);
	 		newTask.setDueDate(null);
	 		newTask.setName("Task Management");
	 		newTask.setActive(true);

			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "DueDate cannot be null or empty";
			String actualMessage = exception.getMessage();

			assertTrue(expectedMessage.equals(actualMessage));
		}	
	    
	    
	    @Test
		public void testCreateTaskWithDueDateEmpty() {
	    	TaskService taskService = new TaskService();
	    	Task newTask = new Task();
	 		newTask.setId(123);
	 		newTask.setDueDate("");
	 		newTask.setName("Task Management");
	 		newTask.setActive(true);

			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "DueDate cannot be null or empty";
			String actualMessage = exception.getMessage();

			assertTrue(expectedMessage.equals(actualMessage));
		}
	    
	    
	    
	    @Test
		public void testCreateTaskWithDueDatePassedDate() {
	    	TaskService taskService = new TaskService();
	    	Task newTask = new Task();
	 		newTask.setId(123);
	 		newTask.setDueDate("2023-05-26");
	 		newTask.setName("Task Management");
	 		newTask.setActive(true);
			
			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "Due date should be in the future";
			String actualMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(actualMessage));
		}
	    
	    
	    @Test
		public void testCreateTaskWithDueDateParseDate() {
	    	TaskService taskService = new TaskService();
	    	Task newTask = new Task();
	 		newTask.setId(123);
	 		newTask.setDueDate("2022-08-19");
	 		newTask.setName("Task Management");
	 		newTask.setActive(true);
			
			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "Due date should be in the future";
			String actualMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(actualMessage));
		}
	    
	    @Test
	    public void testCreateTaskWithDueDateInvalidDate() {
	    	TaskService taskService = new TaskService();
	    	Task newTask = new Task();
	 		newTask.setId(123);
	 		newTask.setDueDate("2023-09-31");
	 		newTask.setName("Task Management");
	 		newTask.setActive(true);
			
			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "Invalid date format or Invalid Date";
			String actualMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(actualMessage));
		}
}
