package in.vigneshvijay.globalfuncity.interfaces;

import java.util.Set;

import in.vigneshvijay.globalfuncity.model.Task;

public interface TaskInterface extends Base<Task>{
	public abstract	Set<Task> findAll();
	public abstract Task findById(int id);
}
