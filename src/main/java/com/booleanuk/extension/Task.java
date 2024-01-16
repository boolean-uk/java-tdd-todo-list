package com.booleanuk.extension;

public class Task {
	int id;
	String description;
	boolean completed = false;

	public Task(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		String s = id+": "+description + ",\t";
		if (completed) {
			s = s + "Complete";
		} else {
			s = s + "Incomplete";
		}
		return s;
	}
	public void setCompleted(boolean completed){
		this.completed=completed;
	}
	public void setId(int id){
		this.id=id;
	}

}
