package in.vigneshvijay.globalfuncity.service;

import java.time.format.DateTimeParseException;

import in.vigneshvijay.globalfuncity.dao.TaskDAO;
import in.vigneshvijay.globalfuncity.exception.ValidationException;
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
	public void create(Task newTask) throws Exception {
		try {
			TaskValidator.Validate(newTask);
		} catch (DateTimeParseException e) {
			throw new ValidationException("Invalid date format or Invalid Date");
		}
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
