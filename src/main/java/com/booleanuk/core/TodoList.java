package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
	HashMap<Integer, Task> list;
	int currId =0;

	public TodoList() {
	list = new HashMap<>();
	}
	public void addTask(Task task){
		list.put(currId,task);
		currId++;
	}
}
