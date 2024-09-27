package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void testAddedToList() {
        // Test for successfully added todolist
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        todoList.addTask(newTask);
        Assertions.assertTrue(todoList.tasks.contains(newTask));
    }

    @Test
    public void testReturnAllTasks() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        Task newTask2 = new Task("Cleaning");
        Task newTask3 = new Task("Reading");
        todoList.addTask(newTask);
        todoList.addTask(newTask2);
        todoList.addTask(newTask3);

        Assertions.assertEquals("Laundry", todoList.tasks.get(0).name);
        Assertions.assertEquals("Cleaning", todoList.tasks.get(1).name);
        Assertions.assertEquals("Reading", todoList.tasks.get(2).name);
//        System.out.println(todoList);
    }

    @Test
    public void testChangeCompleteValue() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Laundry");
        Task task2 = new Task("Cleaning");
        todoList.tasks.add(task1);
        todoList.tasks.add(task2);
        todoList.changeCompleteValue(task1);
        todoList.changeCompleteValue(task2);
        Assertions.assertTrue(task1.isComplete);
        Assertions.assertTrue(task2.isComplete);
    }

    @Test
    public void testOnlyCompletedTasksTrue() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Laundry");
        Task task2 = new Task("Cleaning", true);
        Task task3 = new Task("Reading", true);

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        todoList.getCompletedTasks();
        Assertions.assertTrue(todoList.getCompletedTasks().contains(task3));
        Assertions.assertTrue(todoList.getCompletedTasks().contains(task2));
    }
    @Test
    public void testOnlyNotCompletedTasksTrue() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Laundry", true);
        Task task2 = new Task("Cleaning");
        Task task3 = new Task("Reading");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        todoList.getNotCompletedTasks();
        Assertions.assertTrue(todoList.getNotCompletedTasks().contains(task3));
        Assertions.assertTrue(todoList.getNotCompletedTasks().contains(task2));
    }

    @Test
    public void testGetCompleteTasks() {
        // test for successfully get complete tasks
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        Task newTask2 = new Task("Cleaning");
        Task newTask3 = new Task("Reading");
        todoList.tasks.add(newTask);
        todoList.tasks.add(newTask2);
        todoList.tasks.add(newTask3);
//        todoList.addTask(newTask2);
//        todoList.addTask(newTask3);

        todoList.getCompletedTasks();

        Assertions.assertFalse(todoList.getCompletedTasks().contains(newTask2));
        Assertions.assertFalse(todoList.getCompletedTasks().contains(newTask));
    }

    @Test
    public void testGetNotCompletedTasks() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        Task newTask2 = new Task("Cleaning");
        Task newTask3 = new Task("Reading");
        todoList.tasks.add(newTask);
        todoList.tasks.add(newTask2);
        todoList.tasks.add(newTask3);
//        todoList.addTask(newTask2);
//        todoList.addTask(newTask3);

        todoList.getNotCompletedTasks();

        Assertions.assertTrue(todoList.getNotCompletedTasks().contains(newTask2));
        Assertions.assertTrue(todoList.getNotCompletedTasks().contains(newTask));

    }

    @Test
    public void testSearchTaskDoesNotExist() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        Task newTask2 = new Task("Cleaning");
        Task newTask3 = new Task("Reading");
        todoList.tasks.add(newTask);
        todoList.tasks.add(newTask2);
        Assertions.assertEquals("Task is found in your list!", todoList.searchTaskDoesNotExist(newTask));
        Assertions.assertEquals("Task is not found in your list!", todoList.searchTaskDoesNotExist(newTask3));
    }

    @Test
    public void testRemoveTaskFromTodoList() {
        // Test for successfully added todoList
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        Task newTask2 = new Task("Reading");
        todoList.removeTask(newTask2);
        Assertions.assertFalse(todoList.tasks.contains(newTask2));
    }

    @Test
    public void testSortInAscendingOrder() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Back-up computer");
        Task task2 = new Task("Cleaning");
        Task task3 = new Task("Reading");
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        Assertions.assertEquals(task1.name, todoList.sortTasksInAscendingOrder().get(0));
        Assertions.assertEquals(task2.name, todoList.sortTasksInAscendingOrder().get(1));
        Assertions.assertEquals(task3.name, todoList.sortTasksInAscendingOrder().get(2));
    }

    @Test
    public void testSortInDescendingOrder() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Back-up computer");
        Task task2 = new Task("Cleaning");
        Task task3 = new Task("Reading");
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        Assertions.assertEquals(task1.name, todoList.sortTasksInDescendingOrder().get(2));
        Assertions.assertEquals(task2.name, todoList.sortTasksInDescendingOrder().get(1));
        Assertions.assertEquals(task3.name, todoList.sortTasksInDescendingOrder().get(0));
    }

}



