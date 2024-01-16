package com.booleanuk.core;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;

public class TodoList {
	HashMap<Integer, Task> list;
	int currId = 0;

	public TodoList() {
		list = new HashMap<>();
	}

	public void addTask(Task task) {
		list.put(currId, task);
		currId++;
	}

	public String printList() {
		StringBuilder sb = new StringBuilder();
		list.forEach((key, value) -> {
			sb.append(key + ": " + value + "\n");
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
				sb.append(key + ": " + value + "\n");
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
				sb.append(key + ": " + value + "\n");
			}
		});
		if (!sb.isEmpty()) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
}
