package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
	int id;
	String description;
	boolean completed = false;
	String date;

	public Task(String description) {
		this.description = description;
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		date = currentDateTime.format(formatter);

	}

	@Override
	public String toString() {
		String s = id + ": " + description + ",\t";
		if (completed) {
			s = s + "Complete";
		} else {
			s = s + "Incomplete";
		}
		return s;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;

	}

	public void setId(int id) {
		this.id = id;

	}
	public void setDescription(String description){
		this.description=description;
	}

	public String getDate() {
		return this.date;
	}
}
