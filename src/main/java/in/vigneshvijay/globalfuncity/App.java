package in.vigneshvijay.globalfuncity;

import in.vigneshvijay.globalfuncity.model.Task;
//import in.vigneshvijay.globalfuncity.dao.UserDAO;
import in.vigneshvijay.globalfuncity.model.User;
import in.vigneshvijay.globalfuncity.service.TaskService;
import in.vigneshvijay.globalfuncity.service.UserService;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		try {
//			UserService userService = new UserService();
//
//			User newUser = new User();
//			newUser.setId(1234);
//			newUser.setFirstName("Vignesh");
//			newUser.setLastName("V");
//			newUser.setEmail("vv@gmail.com");
//			newUser.setPassword("vv1234");
//			newUser.setActive(true);
//
//			userService.create(newUser);
//			userService.getAll();
//			
//		} catch (Exception e) {
//		
//			e.printStackTrace();
//		}

     

		
		//User2
//		User newUser2 = new User();
//		newUser2.setId(1235);
//		newUser2.setFirstName("Hello");
//		newUser2.setLastName("W");
//		newUser2.setEmail("hello@gmail.com");
//		newUser2.setPassword("hello1234");
//		newUser2.setActive(true);
		
//		userDao.create(newUser2);
		
		
		
		//Task
		try {
			TaskService taskService = new TaskService();
	 		Task newTask = new Task();
	 		newTask.setId(123);
	 		newTask.setDueDate("2023-12-24");
	 		newTask.setName("Task Management");
	 		newTask.setActive(true);

			taskService.create(newTask);
			taskService.getAll();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
     
	}

}

