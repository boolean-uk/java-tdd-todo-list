package com.booleanuk.extension;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class TodoListExtensionTest {
	@Test
	public void exampleTest() {
		String hello = "Hello";
		Assertions.assertEquals("Hello", hello);
		Assertions.assertNotEquals("Goodbye", hello);
	}

	@Test
	public void addTaskTest() {
		TodoList todo = new TodoList();
		Task task = new Task("Code more");
		Assertions.assertEquals(0, todo.list.size());
		todo.addTask(task);
		Assertions.assertEquals("Code more", todo.list.get(0).description);
		Assertions.assertEquals(1, todo.list.size());
	}

	@Test
	public void printListTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		todo.addTask(task1);
		todo.addTask(task2);
		Assertions.assertEquals("0: Code more,\tIncomplete\n1: Code even more,\tIncomplete", todo.printList());
	}

	@Test
	public void setCompleteTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");

		Assertions.assertFalse(task1.completed);
		Assertions.assertFalse(task2.completed);
		task1.setCompleted(true);
		Assertions.assertTrue(task1.completed);
		Assertions.assertFalse(task2.completed);

	}

	@Test
	public void printListCompletedTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		Task task3 = new Task("Code a bit less");
		todo.addTask(task1);
		todo.addTask(task2);
		todo.addTask(task3);
		Assertions.assertEquals("", todo.printListCompleted());
		task1.setCompleted(true);
		Assertions.assertEquals("0: Code more,\tComplete", todo.printListCompleted());
	}

	@Test
	public void printListInompletedTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		Task task3 = new Task("Code a bit less");
		todo.addTask(task1);
		todo.addTask(task2);
		todo.addTask(task3);
		Assertions.assertEquals("0: Code more,\tIncomplete\n1: Code even more,\tIncomplete\n2: Code a bit less,\tIncomplete", todo.printListIncompleted());
		task1.setCompleted(true);
		Assertions.assertEquals("1: Code even more,\tIncomplete\n2: Code a bit less,\tIncomplete", todo.printListIncompleted());
	}

	@Test
	public void getTaskTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		todo.addTask(task1);
		todo.addTask(task2);
		try {
			Task task = todo.getTask(4);
		} catch (Exception e) {
			Assertions.assertEquals("com.booleanuk.extension.NotInListException: No task with id 4 in list", e.toString());
		}
		try {
			Task task = todo.getTask(0);
			Assertions.assertEquals("Code more", task.description);
			task = todo.getTask(1);
			Assertions.assertEquals("Code even more", task.description);
		} catch (Exception e) {
		}
	}

	@Test
	public void removeTaskTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		todo.addTask(task1);
		todo.addTask(task2);
		Assertions.assertEquals(2, todo.list.size());
		Assertions.assertTrue(todo.list.containsKey(1));
		try {
			todo.removeTask(1);
		} catch (Exception e) {
		}
		Assertions.assertEquals(1, todo.list.size());
		Assertions.assertFalse(todo.list.containsKey(1));
		try {
			todo.removeTask(3);
		} catch (Exception e) {
			Assertions.assertEquals("com.booleanuk.extension.NotInListException: No task with id 3 in list", e.toString());
		}
	}

	@Test
	public void printListAscTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		Task task3 = new Task("Code a bit less");
		Task task4 = new Task("Take a break");
		todo.addTask(task1);
		todo.addTask(task2);
		todo.addTask(task3);
		todo.addTask(task4);
		Assertions.assertEquals("2: Code a bit less,\tIncomplete\n1: Code even more,\tIncomplete\n0: Code more,\tIncomplete\n3: Take a break,\tIncomplete", todo.printListAsc());
	}

	@Test
	public void printListDescTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		Task task3 = new Task("Code a bit less");
		Task task4 = new Task("Take a break");
		todo.addTask(task1);
		todo.addTask(task2);
		todo.addTask(task3);
		todo.addTask(task4);
		Assertions.assertEquals("3: Take a break,\tIncomplete\n0: Code more,\tIncomplete\n1: Code even more,\tIncomplete\n2: Code a bit less,\tIncomplete", todo.printListDesc());
	}

	@Test
	public void setDescriptionTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		todo.addTask(task1);
		Assertions.assertEquals("Code more", task1.description);
		try {
			todo.setDescription(0, "Stop coding");
		} catch (NotInListException e) {
			throw new RuntimeException(e);
		}
		Assertions.assertEquals("Stop coding", task1.description);
		try {
			todo.setDescription(1, "Stop coding");
		} catch (NotInListException e) {
			Assertions.assertEquals("com.booleanuk.extension.NotInListException: No task with id 1 in list", e.toString());
		}

	}

	@Test
	public void getTimeTest() {
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		todo.addTask(task1);
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String date = currentDateTime.format(formatter);
		Assertions.assertEquals(date, task1.getDate());
	}
}
