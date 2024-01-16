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

    @Test
    public void testPrintTasksInAscOrder() {
        TodoList list = new TodoList();
        list.addTask("vacuum");
        list.addTask("paint");
        list.addTask("groceries");
        System.setOut(new PrintStream(outContent));
        list.printTasksInAscOrder();
        String expectedOutput = String.join(System.lineSeparator(), "groceries", "paint", "vacuum");
        assertEquals(expectedOutput, outContent.toString().trim());
    }





}
