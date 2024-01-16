package com.booleanuk.extension;

import java.util.*;

public class TodoList {
	HashMap<Integer, Task> list;
	int currId = 0;

	public TodoList() {
		list = new HashMap<>();
	}

	public void addTask(Task task) {
		list.put(currId, task);
		task.setId(currId);
		currId++;
	}

	public String printList() {
		StringBuilder sb = new StringBuilder();
		list.forEach((key, value) -> {
			sb.append(value + "\n");
		});
		if (sb.length() != 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

	public String printListCompleted() {
		StringBuilder sb = new StringBuilder();
		list.forEach((key, value) -> {
			if (value.completed) {
				sb.append(value + "\n");
			}
		});
		if (!sb.isEmpty()) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

	public String printListIncompleted() {
		StringBuilder sb = new StringBuilder();
		list.forEach((key, value) -> {
			if (!value.completed) {
				sb.append(value + "\n");
			}
		});
		if (!sb.isEmpty()) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

	public Task getTask(int id) throws NotInListException {
		if (list.containsKey(id)) {
			return list.get(id);
		} else {
			throw new NotInListException(id);
		}
	}

	public void removeTask(int id) throws NotInListException {
		if (list.containsKey(id)) {
			list.remove(id);
		} else {
			throw new NotInListException(id);
		}
	}
	public String printListAsc(){
		TaskComparator taskComp = new TaskComparator();
		StringBuilder sb = new StringBuilder();
		Collection<Task> values = list.values();
		List<Task> valueList = new ArrayList<>(values);
		valueList.sort(taskComp);
		for(Task task :valueList){
			sb.append(task+"\n");
		}
		if (!sb.isEmpty()) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
	public String printListDesc(){
		TaskComparator taskComp = new TaskComparator();
		StringBuilder sb = new StringBuilder();
		Collection<Task> values = list.values();
		List<Task> valueList = new ArrayList<>(values);
		valueList.sort(taskComp);
		Collections.reverse(valueList);
		for(Task task :valueList){
			sb.append(task+"\n");
		}
		if (!sb.isEmpty()) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
}
