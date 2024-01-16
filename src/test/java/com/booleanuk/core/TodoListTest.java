package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
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
	public void setCompleteTest(){
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
	public void printListCompletedTest(){
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		Task task3 = new Task("Code a bit less");
		todo.addTask(task1);
		todo.addTask(task2);
		todo.addTask(task3);
		Assertions.assertEquals("",todo.printListCompleted());
		task1.setCompleted(true);
		Assertions.assertEquals("0: Code more,\tComplete",todo.printListCompleted());
	}
	@Test
	public void printListInompletedTest(){
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		Task task3 = new Task("Code a bit less");
		todo.addTask(task1);
		todo.addTask(task2);
		todo.addTask(task3);
		Assertions.assertEquals("0: Code more,\tIncomplete\n1: Code even more,\tIncomplete\n2: Code a bit less,\tIncomplete",todo.printListIncompleted());
		task1.setCompleted(true);
		Assertions.assertEquals("1: Code even more,\tIncomplete\n2: Code a bit less,\tIncomplete",todo.printListIncompleted());
	}

	@Test
	public void getTaskTest(){
		TodoList todo = new TodoList();
		Task task1 = new Task("Code more");
		Task task2 = new Task("Code even more");
		todo.addTask(task1);
		todo.addTask(task2);
		try {
			Task task = todo.getTask(4);
		}catch (Exception e){
			Assertions.assertEquals("com.booleanuk.core.NotInListException: No task with id 4 in list",e.toString());
		}
		try {
			Task task = todo.getTask(0);
			Assertions.assertEquals("Code more",task.description);
			task = todo.getTask(1);
			Assertions.assertEquals("Code even more",task.description);
		}catch (Exception e){
		}
	}
}
