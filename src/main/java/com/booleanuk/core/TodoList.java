package com.booleanuk.core;

import java.util.List;

import com.booleanuk.core.pojo.Task;

import java.util.ArrayList;
import java.util.Comparator;

public class TodoList {

	private List<Task> tdList;

	public TodoList(){
		this.tdList = new ArrayList<Task>();
	}

	public void add(Task task){
		this.tdList.add(task);
	}

	public List<Task> retList(){
		return this.tdList;
	}

	public void changeStatus(String task, boolean status){
		for(Task t : this.tdList){
			if(task == t.getTask())
				t.setComplet(status);
		}
	} 

	public List<Task> getComp(){
		List<Task> tmp = new ArrayList<Task>();
		for(Task t: this.tdList){
			if(t.getComplet() == true)
				tmp.add(t);
		}
		return tmp;
	}

	public List<Task> getInComp(){
		List<Task> tmp = new ArrayList<Task>();
		for(Task t: this.tdList){
			if(t.getComplet() == false)
				tmp.add(t);
		}
		return tmp;
	}

	public String search(String task){
		for(Task t: this.tdList){
			if(t.getTask().contains(task))
				return "Found/Exists!";
		}
		return "Does not exist!";	
	}

	public void delete(String task){
		int i = 0;
		for(Task t: this.tdList){
			if(t.getTask() == task){
				this.tdList.remove(i);
				break;
			}
			i++;
		}	
	}

	public String orderAscend(){
		String tmpStr = "";
		List<Task> tmpList = this.tdList;
		tmpList.sort(Comparator.comparing(Task::getTask, String.CASE_INSENSITIVE_ORDER));
		for (Task t : tmpList){
			tmpStr += t.getTask() + "\n";
		}
		return tmpStr.trim();
	}

	public String orderDescend(){
		String tmpStr = "";
		List<Task> tmpList = this.tdList;
		tmpList.sort(Comparator.comparing(Task::getTask, String.CASE_INSENSITIVE_ORDER).reversed());
		for (Task t : tmpList){
			tmpStr += t.getTask() + "\n";
		}
		return tmpStr.trim();
	}

}
