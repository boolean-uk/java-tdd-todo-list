package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    Task task1 = new Task("A. Todo 1", true);
    Task task2 = new Task("B. Todo 2", false);
    Task task3 = new Task("C. Todo 3", true );


    @Test
    public void testReturnTrueIfTaskIsAddedToList() {
        TodoList todoList = new TodoList();
        Task task4 = new Task("Todo 4");
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        Assertions.assertEquals(3, todoList.tasks.size());
    }

    @Test
    public void testGetAllTasks() {
        TodoList todoList = new TodoList();
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        Assertions.assertEquals(task1, todoList.getTasks().get(0));
        Assertions.assertEquals(task2, todoList.getTasks().get(1));
        Assertions.assertEquals(task3, todoList.getTasks().get(2));
        Assertions.assertEquals(3, todoList.getTasks().size());
    }

    @Test
    public void testChangeCompleteValue() {
        TodoList todoList = new TodoList();
        todoList.tasks.add(task1);
        todoList.tasks.add(task2);
        todoList.changeCompleteValue(task1);
        todoList.changeCompleteValue(task2);
        Assertions.assertFalse(task1.complete);
        Assertions.assertTrue(task2.complete);
    }

    @Test
    public void testTrueIfGetOnlyCompletedTasks() {
        TodoList todoList = new TodoList();
        todoList.tasks.add(task1);
        todoList.tasks.add(task2);
        todoList.tasks.add(task3);
        todoList.getCompletedTasks();
        Assertions.assertTrue(todoList.getCompletedTasks().contains(task1));
        Assertions.assertTrue(todoList.getCompletedTasks().contains(task3));
    }

    @Test
    public void testFalseIfCompletedTasksIncludeIncomplete() {
        TodoList todoList = new TodoList();
        todoList.tasks.add(task2);
        Assertions.assertFalse(todoList.getCompletedTasks().contains(task2));
    }

    @Test
    public void testTrueIfGetOnlyIncompleteTasks() {
        TodoList todoList = new TodoList();
        todoList.tasks.add(task1);
        todoList.tasks.add(task2);
        todoList.tasks.add(task3);
        todoList.getCompletedTasks();
        Assertions.assertTrue(todoList.getIncompleteTasks().contains(task2));
    }

    @Test
    public void testSearchByName() {
        TodoList todoList = new TodoList();
        todoList.tasks.add(task1);
        todoList.tasks.add(task2);
        Assertions.assertEquals("Task was not found!", todoList.searchTaskByName(task3));
        Assertions.assertEquals("Task found!", todoList.searchTaskByName(task1));
    }

    @Test
    public void testReturnFalseIfListDoesNotContainTaskAfterRemoval() {
        TodoList todoList = new TodoList();
        todoList.tasks.add(task1);
        todoList.tasks.add(task2);
        todoList.removeTask(task1);
        Assertions.assertFalse(todoList.tasks.contains(task1));
    }

    @Test
    public void testSortInDescendingOrder() {
        TodoList todoList = new TodoList();
        todoList.tasks.add(task3);
        todoList.tasks.add(task1);
        todoList.tasks.add(task2);
        Assertions.assertEquals(task1.name, todoList.sortTasksAscending().get(0));
        Assertions.assertEquals(task2.name, todoList.sortTasksAscending().get(1));
        Assertions.assertEquals(task3.name, todoList.sortTasksAscending().get(2));
    }

    @Test
    public void testDescendingOrder() {
        TodoList todoList = new TodoList();
        todoList.tasks.add(task3);
        todoList.tasks.add(task1);
        todoList.tasks.add(task2);
        Assertions.assertEquals(task1.name, todoList.sortTasksDescending().get(2));
        Assertions.assertEquals(task2.name, todoList.sortTasksDescending().get(1));
        Assertions.assertEquals(task3.name, todoList.sortTasksDescending().get(0));
    }























}
