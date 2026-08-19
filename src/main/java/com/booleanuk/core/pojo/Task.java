package com.booleanuk.core.pojo;

public class Task {
	private String task;
	private boolean complet;

	public Task(String task){
		this.task = task;
		this.complet = false;

	}

	public Task(String task, boolean complet){
		this.task = task;
		this.complet = complet;

	}

	public void setComplet(boolean complet){
		this.complet = complet;
	}

	public boolean getComplet(){
		return this.complet;
	}

	public String getTask(){
		return this.task;
	}
}
