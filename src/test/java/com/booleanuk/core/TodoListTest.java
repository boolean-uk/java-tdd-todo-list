package com.booleanuk.core;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }
    @Test
    public void testAddTaskToList() {
        TodoList list = new TodoList();
        list.addTask("clean");
        assertTrue(list.toDoList.containsKey("clean"));

    }
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Test
    public void seeAllTaskTest() {
        TodoList list = new TodoList();
        list.addTask("paint");
        list.addTask("groceries");
        list.addTask("vacuum");
        assertEquals(3,list.toDoList.size());
        System.setOut(new PrintStream(outContent));
        list.seeAllTasks();
        assertEquals("{vacuum=incomplete, paint=incomplete, groceries=incomplete}", outContent.toString().trim());

    }

    @Test
    public void testChangeStatus(){
        TodoList list = new TodoList();
        list.addTask("paint");
        Assertions.assertEquals("complete", list.changeStatus("paint"));
    }

    @Test
    public void testGetCompletedTask() {
        TodoList list = new TodoList();
        list.addTask("paint");
        list.addTask("groceries");
        list.addTask("vacuum");


        list.changeStatus("paint");
        list.changeStatus("groceries");
        System.setOut(new PrintStream(outContent));

        list.getCompleteTask();

        assertEquals("paint, groceries", outContent.toString().trim());
    }
    @Test
    public void testGetIncompleteTask() {
        TodoList list = new TodoList();

        list.addTask("paint");
        list.addTask("groceries");
        list.addTask("vacuum");


        list.changeStatus("paint");
        list.changeStatus("groceries");
        System.setOut(new PrintStream(outContent));
        list.getIncompleteTask();

        assertEquals("vacuum", outContent.toString().trim());
    }
    @Test
    public void testSearchTask() {
        TodoList list = new TodoList();
        list.addTask("paint");
        list.addTask("groceries");

        // Test for an existing task
        String result1 = list.searchTask("paint");
        assertEquals("Task found: paint", result1);

        // Test for a non-existing task
        String result2 = list.searchTask("clean");
        assertEquals("Task not found", result2);
    }

    Certainly! To create a method for removing tasks from your list and a corresponding unit test, you will first need a method in your TodoList class that handles task removal. Then, you can write a test to ensure this method works as expected.

            1. removeTask Method in TodoList Class
    This method will remove a task from your toDoList. I'm assuming toDoList is a Map<String, String> where the key is the task name.

    java
    Copy code
    public boolean removeTask(String task) {
        if (toDoList.containsKey(task)) {
            toDoList.remove(task);
            return true; // Task was found and removed
        }
        return false; // Task was not found
    }
    This method checks if the task exists in the list. If it does, it removes the task and returns true. If the task is not found, it returns false.

            2. Corresponding Test Method for removeTask
    The test will check whether the removeTask method correctly removes a specified task from the toDoList.

    java
    Copy code
    @Test
    public void testRemoveTask() {
        TodoList list = new TodoList();
        // Add tasks
        list.addTask("paint");
        list.addTask("groceries");
        list.addTask("vacuum");
        assertTrue(list.removeTask("groceries"));
        assertFalse(list.removeTask("shopping"));
        list.getIncompleteTask(); // Assuming this method prints all tasks
        assertFalse(outContent.toString().trim().contains("groceries"));
    }






}
