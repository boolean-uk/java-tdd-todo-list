package com.booleanuk.extension;

import java.time.LocalDateTime;

public class ExTask {
	private String task;
	private boolean complet;
	protected int id;
	private LocalDateTime date;

	public ExTask(String task){
		this.task = task;
		this.complet = false;
		this.date = LocalDateTime.now();

	}

	public ExTask(String task, boolean complet){
		this.task = task;
		this.complet = complet;
		this.date = LocalDateTime.now();

	}

	public void setComplet(boolean complet){
		this.complet = complet;
	}

	public void setTask(String task){
		this.task = task;
	}

	public boolean getComplet(){
		return this.complet;
	}

	public String getTask(){
		return this.task;
	}

	public int getID(){
		return this.id;
	}

	public LocalDateTime getDate(){
		return this.date;
	}
}
