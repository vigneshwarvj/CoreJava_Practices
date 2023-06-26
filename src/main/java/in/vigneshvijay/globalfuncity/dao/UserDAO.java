package in.vigneshvijay.globalfuncity.dao;

import in.vigneshvijay.globalfuncity.model.User;

public class UserDAO {

	//FindAll
	public User[] findAll(){
		User[] userList = UserList.listOfUser;
		return userList;
	}
	
	//Create
	public void create(User newUser) {	
		UserList.listOfUser[0] = newUser;
	}
	
}
