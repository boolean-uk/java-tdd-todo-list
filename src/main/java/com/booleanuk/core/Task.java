package com.booleanuk.core;

public class Task {
	String description;
	boolean completed = false;

	public Task(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		String s = description + ",\t";
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

}
