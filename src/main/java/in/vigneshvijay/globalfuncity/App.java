package in.vigneshvijay.globalfuncity;

import in.vigneshvijay.globalfuncity.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     UserService userService = new UserService();
     
     userService.create();
     userService.getAll();
     
	}

}
