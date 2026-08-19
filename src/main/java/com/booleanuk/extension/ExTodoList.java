package com.booleanuk.extension;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import java.time.format.DateTimeFormatter;

public class ExTodoList {

	private List<ExTask> tdList;
	private int incrementID;

	public ExTodoList(){
		this.tdList = new ArrayList<ExTask>();
		this.incrementID = 1;
	}

	public void add(ExTask task){
		task.id = incrementID;
		this.tdList.add(task);
	}

	public List<ExTask> retList(){
		return this.tdList;
	}

	public void changeStatus(String task, boolean status){
		for(ExTask t : this.tdList){
			if(task == t.getTask())
				t.setComplet(status);
		}
	} 

	public List<ExTask> getComp(){
		List<ExTask> tmp = new ArrayList<ExTask>();
		for(ExTask t: this.tdList){
			if(t.getComplet() == true)
				tmp.add(t);
		}
		return tmp;
	}

	public List<ExTask> getInComp(){
		List<ExTask> tmp = new ArrayList<ExTask>();
		for(ExTask t: this.tdList){
			if(t.getComplet() == false)
				tmp.add(t);
		}
		return tmp;
	}

	public String search(String task){
		for(ExTask t: this.tdList){
			if(t.getTask().contains(task))
				return "Found/Exists!";
		}
		return "Does not exist!";	
	}

	public void delete(String task){
		int i = 0;
		for(ExTask t: this.tdList){
			if(t.getTask() == task){
				this.tdList.remove(i);
				break;
			}
			i++;
		}	
	}

	public String orderAscend(){
		String tmpStr = "";
		List<ExTask> tmpList = this.tdList;
		tmpList.sort(Comparator.comparing(ExTask::getTask, String.CASE_INSENSITIVE_ORDER));
		for (ExTask t : tmpList){
			tmpStr += t.getTask() + "\n";
		}
		return tmpStr.trim();
	}

	public String orderDescend(){
		String tmpStr = "";
		List<ExTask> tmpList = this.tdList;
		tmpList.sort(Comparator.comparing(ExTask::getTask, String.CASE_INSENSITIVE_ORDER).reversed());
		for (ExTask t : tmpList){
			tmpStr += t.getTask() + "\n";
		}
		return tmpStr.trim();

	}

	public String getExTaskByID(int id){
		for (ExTask t : tdList){
			if(t.id == id)
				return t.getTask();
		}
		return "";
	}

	public void updateNameExTask(int id, String newTask){
		for (ExTask t : tdList){
			if(t.id == id)
				t.setTask(newTask);
		}
	}

	public void changeStatus(int id, boolean status){
		for (ExTask t : tdList){
			if(t.id == id)
				t.setComplet(status);
		}
	}

	public String dateTime(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String tmp = "";
		for(ExTask t : tdList){
			String tmpStr = t.getDate().format(formatter);
			tmp += t.getTask() + " " + tmpStr + "\n";
		}
		return tmp.trim();
	}

}
