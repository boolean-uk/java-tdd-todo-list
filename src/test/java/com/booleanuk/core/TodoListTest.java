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
    public void isTaskNew() {
        TodoList task1 = new TodoList();

        boolean result = task1.addTask("Football", true);
        Assertions.assertTrue(result);
    }

    @Test
    public void isTaskAlreadyAdded() {
        TodoList task1 = new TodoList();

        boolean result = task1.addTask("Fiske", true);
        Assertions.assertFalse(result);

    }

    @Test
    public void testPrintTasks() {
        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        String result = task1.allTasks();


        Assertions.assertEquals("{Fiske=true, Sloss=false}", result);


    }

    @Test
    public void testSetStatus() {
        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        boolean result = task1.setStatus("Sloss", true);


        Assertions.assertTrue(result);


    }
    @Test
    public void testSetStatusUnvalid() {
        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        boolean result = task1.setStatus("Nei", true);


        Assertions.assertFalse(result);


    }

    @Test
    public void testGetAllComplete() {

        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        task1.addTask("Sloss2", true);
        task1.addTask("Sloss3", false);
        task1.addTask("Sloss4", true);
        task1.addTask("Sloss5", false);

        String result = task1.getComplete();

        Assertions.assertEquals("{Fiske=true, Sloss=false}", result);


    }

    @Test
    public void testGetAllInComplete() {

        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        task1.addTask("Sloss2", true);
        task1.addTask("Sloss3", false);
        task1.addTask("Sloss4", true);
        task1.addTask("Sloss5", false);

        String result = task1.getComplete();

        Assertions.assertEquals("{Fiske=true, Sloss=false}", result);


    }


}
