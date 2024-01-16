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

        task1.addTask("Sloss", true);
        boolean result = task1.setStatus("Sloss", false);


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

        Assertions.assertEquals("{Fiske=true, Sloss2=true, Sloss4=true}", result);


    }

    @Test
    public void testGetAllInComplete() {

        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        task1.addTask("Sloss2", true);
        task1.addTask("Sloss3", false);
        task1.addTask("Sloss4", true);
        task1.addTask("Sloss5", false);

        String result = task1.getInComplete();

        Assertions.assertEquals("{Fiske=false, Sloss2=false, Sloss4=false}", result);


    }

    @Test
    public void testGetKeyBySearch() {

        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        task1.addTask("Sloss2", true);
        task1.addTask("Sloss3", false);
        task1.addTask("Sloss4", true);
        task1.addTask("Sloss5", false);

        String result = task1.getTask("Sloss2");

        Assertions.assertEquals("This was your task: Sloss2 status: true", result);


    }

    @Test
    public void testGetKeyByWrongSearch() {

        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        task1.addTask("Sloss2", true);
        task1.addTask("Sloss3", false);
        task1.addTask("Sloss4", true);
        task1.addTask("Sloss5", false);

        String result = task1.getTask("Sloss111");

        Assertions.assertEquals("The task wasnt found!", result);


    }

    @Test
    public void testRemoveKeyRight() {

        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        task1.addTask("Sloss2", true);
        task1.addTask("Sloss3", false);
        task1.addTask("Sloss4", true);
        task1.addTask("Sloss5", false);

        boolean result = task1.removeTask("Sloss");

        Assertions.assertTrue(result);


    }
    @Test
    public void testRemoveKeyWrong() {

        TodoList task1 = new TodoList();

        task1.addTask("Sloss", false);
        task1.addTask("Sloss2", true);
        task1.addTask("Sloss3", false);
        task1.addTask("Sloss4", true);
        task1.addTask("Sloss5", false);

        boolean result = task1.removeTask("Slossgehewt");

        Assertions.assertFalse(result);


    }

    @Test
    public void testAscending() {

        TodoList task1 = new TodoList();

        task1.addTask("Ape", false);
        task1.addTask("Bil", true);
        task1.addTask("Ceer", false);
        task1.addTask("Der", true);
        task1.addTask("Ert", false);

        String result = task1.ascending();

        Assertions.assertEquals("[Ape, Bil, Ceer, Der, Ert, Fiske]", result);


    }
    @Test
    public void testDescending() {

        TodoList task1 = new TodoList();

        task1.addTask("Ape", false);
        task1.addTask("Bil", true);
        task1.addTask("Ceer", false);
        task1.addTask("Der", true);
        task1.addTask("Ert", false);

        String result = task1.descending();

        Assertions.assertEquals("[Ape, Ert, Bil, Fiske, Der, Ceer]", result);


    }




}
