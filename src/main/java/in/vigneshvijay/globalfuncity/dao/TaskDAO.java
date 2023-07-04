package in.vigneshvijay.globalfuncity.dao;

import in.vigneshvijay.globalfuncity.model.Task;

public class TaskDAO {

	//Find All
    public Task[] findAll() {
  	  Task[] newTask = TaskList.listOfTasks;
  	  return newTask;
    }

    //Create
    public void create(Task newTask) {
  	  Task[] arr = TaskList.listOfTasks;
  	  for(int i=0; i<arr.length; i++) {
  		  Task task = arr[i];
  		  if(task == null) {
  			  arr[i] = newTask;
  			  break;
  		  }
  	  }
    }

    //Update
    public void update(int id, Task updateTask) {
  	  Task[] arr = TaskList.listOfTasks;
  	  for(int i=0; i<arr.length; i++) {
  		  Task task = arr[i];
  		  if(task == null) {
  			  continue;
  		  }
  		  if(task.getId() == id) {
  			  arr[i].setName(updateTask.getName());
  			  arr[i].setDueDate(updateTask.getDueDate());
  			  break;
  		  }
  	  }
    }

    //Delete
    public void delete(int id) {
  	  Task[] arr = TaskList.listOfTasks;
  	  for(int i=0; i<arr.length; i++) {
  		  Task task = arr[i];
  		  if(task == null) {
  			  continue;
  		  }
  		  if(task.getId() == id) {
  			arr[i].setActive(false);
  			  break;
  		  }
  	  }
    }

    //Find By ID
    public Task findById(int id) {
  	  Task[] arr = TaskList.listOfTasks;
  	  Task taskMatch = null;
  	  for(int i=0; i<arr.length; i++) {
  		  Task task = arr[i];
  		  if(task == null) {
  			  continue;
  		  }
  		  if(task.getId() == id) {
  			 taskMatch = task;
  			  break;
  		  }
  	  }
  	  return taskMatch;
    }
}
