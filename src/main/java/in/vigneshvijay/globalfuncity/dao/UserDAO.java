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
		
		User[] arr = UserList.listOfUser; 
		
		for(int i = 0; i < arr.length; i++) {
			User user = arr[i];
			
			if(user == null) {
				arr[i] = newUser;
				break;
			}
		}
	}
		//UserList.listOfUser[0] = newUser;
		
		
	//Update
	public void update(int id, User updateUser) {
		User[] arr = UserList.listOfUser;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == id) {
				arr[i].setFirstName(updateUser.getFirstName());
				arr[i].setLastName(updateUser.getLastName());
				arr[i].setPassword(updateUser.getPassword());
				break;
			}

		}
	}
	
/** Enter
 * 
 * @param newUser1
 */

	public void update(User newUser1) {
		User[] arr = UserList.listOfUser;
		
		for(int i = 0; i < arr.length; i++) {
			User user = arr[i];
			
			if(user == null) {
				continue;
			}
			if(user.getId() == newUser1.getId()) {
				user.setFirstName(newUser1.getFirstName());
				user.setLastName(newUser1.getLastName());
				user.setPassword(newUser1.getPassword());
			}
		
	}
}
	
	//Delete
	public void delete(int id) {
		User[] arr = UserList.listOfUser;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == id) {
				arr[i].setActive(false);
				break;
			}

		}
	}
}
