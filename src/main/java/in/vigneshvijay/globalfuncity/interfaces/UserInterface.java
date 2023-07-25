package in.vigneshvijay.globalfuncity.interfaces;

import java.util.Set;

import in.vigneshvijay.globalfuncity.model.User;

public interface UserInterface extends Base<User>{
	
	public abstract	Set<User> findAll();
	public abstract User findById(int id);
	public abstract User findByEmail(String email);

}