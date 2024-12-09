package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAddToList() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals("Done", todoList.addTask("Task 1", "Uncompleted"));
    }

    @Test
    public void testAddDuplicate() {
        TodoList todoList = new TodoList();

        todoList.addTask("Task 1", "Completed");
        Assertions.assertEquals("Task already exists", todoList.addTask("Task 1", "Completed"));
    }

    @Test
    public void testChangeStatus() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task 3", "Uncompleted");
        todoList.changeStatus("Task 3", "Completed");
        Assertions.assertEquals("Completed", todoList.toDoList.get("Task 3"));
    }

    @Test
    public void testChangeStatus2() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task 3", "Uncompleted");
        todoList.changeStatus("Task 3", "Completed");
        Assertions.assertEquals("Status changed", todoList.changeStatus("Task 3", "Completed"));
    }

    @Test
    public void testChangeStatusTaskNotFound() {
        TodoList todoList = new TodoList();
        todoList.changeStatus("Task 3", "Completed");
        Assertions.assertEquals("Non-existent task", todoList.changeStatus("Task 3", "Completed"));
    }

    @Test
    public void testGetCompletedTasks() {
        TodoList todoList = new TodoList();
        ArrayList<String> completedTasks;
        todoList.addTask("Task 4", "Completed");
        completedTasks = todoList.getCompletedTasks();
        Assertions.assertTrue(completedTasks.contains("Task 4"));
    }

    @Test
    public void testGetCompletedTasks2() {
        TodoList todoList = new TodoList();
        ArrayList<String> completedTasks;
        todoList.addTask("Task 4", "Uncompleted");
        completedTasks = todoList.getCompletedTasks();
        Assertions.assertFalse(completedTasks.contains("Task 4"));
    }

    @Test
    public void testGetUncompletedTasks() {
        TodoList todoList = new TodoList();
        ArrayList<String> completedTasks;
        todoList.addTask("Task 5", "Completed");
        completedTasks = todoList.getUncompletedTasks();
        Assertions.assertFalse(completedTasks.contains("Task 5"));
    }

    @Test
    public void testGetUncompletedTasks2() {
        TodoList todoList = new TodoList();
        ArrayList<String> completedTasks;
        todoList.addTask("Task 5", "Uncompleted");
        completedTasks = todoList.getUncompletedTasks();
        Assertions.assertTrue(completedTasks.contains("Task 5"));
    }

    @Test
    public void testSearchTask() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task 6", "Completed");
        Assertions.assertEquals("Completed", todoList.searchTasks("Task 6"));
    }

    @Test
    public void testSearchTaskNotFound() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("The task was not found", todoList.searchTasks("Task 6"));
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task 7", "Uncompleted");
        Assertions.assertEquals("Done", todoList.removeTask("Task 7"));
        Assertions.assertFalse(todoList.toDoList.containsKey("Task 7"));
    }

    @Test
    public void testRemoveTaskNotFound() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("The task does not exist", todoList.removeTask("Task 7"));
    }

    @Test
    public void testAscendingSort() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task C", "Uncompleted");
        todoList.addTask("Task B", "Completed");
        todoList.addTask("Task A", "Uncompleted");
        ArrayList<String> task = todoList.ascendingSort();
        Assertions.assertEquals("Task A", task.get(0));
        Assertions.assertEquals("Task B", task.get(1));
        Assertions.assertEquals("Task C", task.get(2));
    }

    @Test
    public void testDescendingSort() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task A", "Uncompleted");
        todoList.addTask("Task B", "Completed");
        todoList.addTask("Task C", "Uncompleted");
        ArrayList<String> task = todoList.descendingSort();
        Assertions.assertEquals("Task C", task.get(0));
        Assertions.assertEquals("Task B", task.get(1));
        Assertions.assertEquals("Task A", task.get(2));
    }

}