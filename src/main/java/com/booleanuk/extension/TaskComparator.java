package com.booleanuk.extension;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {
	@Override
	public int compare(Task task1, Task task2) {
	return task1.description.compareTo(task2.description);
	}
}
