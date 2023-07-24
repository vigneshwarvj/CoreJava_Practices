package in.vigneshvijay.globalfuncity.interfaces;

import java.util.Set;

import in.vigneshvijay.globalfuncity.model.User;

public interface UserInterface extends Base{
	
	public abstract	Set<User> findAll();
	public abstract User findById(int id);

}