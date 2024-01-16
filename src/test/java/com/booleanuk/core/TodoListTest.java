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

    // Add Task
    @Test
    public void addTaskTestReturnTrue() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        Assertions.assertTrue(result);
    }

    @Test
    public void addTaskTestReturnFalse() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Clean");
        Assertions.assertFalse(result);
    }

    // See Tasks
    @Test
    public void displayTasksTestReturnTrue() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.displayTasks();
        Assertions.assertTrue(result);
    }

    @Test
    public void displayTasksTestReturnFalse() {
        TodoList toDo = new TodoList();
        boolean result = toDo.displayTasks();
        Assertions.assertFalse(result);
    }

    // update task status
    @Test
    public void taskStatusTest() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.taskStatus("Clean", true);
        Assertions.assertTrue(result);
        result = toDo.taskStatus("Clean", false);
        Assertions.assertFalse(result);
    }

    // Print Completed Tasks
    @Test
    public void displayCompletedTasksTestClean() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.taskStatus("Clean", true);
        ArrayList<String> completedTasks = toDo.displayCompletedTasks();
        Assertions.assertEquals("Clean", completedTasks.get(0));
    }

    @Test
    public void displayCompletedTasksTestDryClean() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Dry");
        result = toDo.addTask("Clean");
        result = toDo.taskStatus("Clean", true);
        ArrayList<String> completedTasks = toDo.displayCompletedTasks();
        Assertions.assertEquals("Clean", completedTasks.get(0));
    }

    // Display incomplete tasks
    @Test
    public void displayIncompletedTasksTestClean() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Dry");
        result = toDo.taskStatus("Clean", true);
        ArrayList<String> completedTasks = toDo.displayIncompletedTasks();
        Assertions.assertEquals("Dry", completedTasks.get(0));
    }

    @Test
    public void displayIncompletedTasksTestCleanDry() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Dry");
        ArrayList<String> completedTasks = toDo.displayIncompletedTasks();
        Assertions.assertEquals("Clean", completedTasks.get(0));
        Assertions.assertEquals("Dry", completedTasks.get(1));
    }

    // Search
    @Test
    public void searchTasksTestReturnFound() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Dry");
        String foundStatus = toDo.searchTasks("Dry");
        Assertions.assertEquals("Found", foundStatus);
        foundStatus = toDo.searchTasks("Clean");
        Assertions.assertEquals("Found", foundStatus);
    }

    public void searchTasksTestReturnNotFound() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        String foundStatus = toDo.searchTasks("Dry");
        Assertions.assertEquals("Not Found", foundStatus);
    }

    // Remove
    @Test
    public void removeTaskTestReturnTrue() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Dry");
        result = toDo.removeTask("Dry");
        Assertions.assertTrue(result);
    }

    @Test
    public void removeTaskTestReturnFalse() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Dry");
        result = toDo.removeTask("Dust");
        Assertions.assertFalse(result);
    }

    // Alphabetize
    @Test
    public void alphabetizeUpTest() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Dry");
        result = toDo.addTask("Zap");
        result = toDo.addTask("Tilt");
        result = toDo.addTask("Work");
        result = toDo.addTask("Bath");
        ArrayList<String> alphabetizedList = toDo.alphabetizeUp();
        Assertions.assertEquals("Bath", alphabetizedList.get(0));
        Assertions.assertEquals("Clean", alphabetizedList.get(1));
        Assertions.assertEquals("Work", alphabetizedList.get(4));
        Assertions.assertEquals("Zap", alphabetizedList.get(5));
    }

    @Test
    public void reverseAlphabetizeUpTest() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Dry");
        result = toDo.addTask("Zap");
        result = toDo.addTask("Tilt");
        result = toDo.addTask("Work");
        result = toDo.addTask("Bath");
        ArrayList<String> alphabetizedList = toDo.alphabetizeDown();
        Assertions.assertEquals("Bath", alphabetizedList.get(5));
        Assertions.assertEquals("Clean", alphabetizedList.get(4));
        Assertions.assertEquals("Work", alphabetizedList.get(1));
        Assertions.assertEquals("Zap", alphabetizedList.get(0));
    }




}
