package in.vigneshvijay.globalfuncity.service;

import in.vigneshvijay.globalfuncity.dao.TaskDAO;
import in.vigneshvijay.globalfuncity.model.Task;
import in.vigneshvijay.globalfuncity.validation.TaskValidator;


public class TaskService {

	//get All
    public Task[] getAll() {
   	 TaskDAO taskDao = new TaskDAO();
   	 Task[] taskList = taskDao.findAll();
		for (int i = 0; i < taskList.length; i++){
			System.out.println(taskList[i]);
		}
		return taskList;
    }

    //create
    public void create(Task newTask) throws Exception{
   	 TaskValidator.Validate(newTask);
   	 TaskDAO taskDao = new TaskDAO();
   	 taskDao.create(newTask);
    }

    //update
    public void update(Task updateTask) throws Exception {
   	TaskValidator.Validate(updateTask);
		TaskDAO taskDao = new TaskDAO();
		taskDao.update(2, updateTask);
	}

    //delete
	public void delete(int taskId) {
		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(1);
	}

	//findByID
	public Task findById(int taskId) {
		TaskDAO taskDao = new TaskDAO();
		Task task = taskDao.findById(1);
		return task;
	}

}
