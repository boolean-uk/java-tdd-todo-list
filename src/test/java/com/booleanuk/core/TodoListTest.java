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

        boolean result = task1.addTask(2, "Football");
        Assertions.assertTrue(result);
    }

    @Test
    public void isTaskAlreadyAdded() {
        TodoList task1 = new TodoList();

        boolean result = task1.addTask(1, "Fiske");
        Assertions.assertFalse(result);

    }

    @Test
    public void testPrintTasks() {
        TodoList task1 = new TodoList();

        String result = task1.allTasks();

        task1.addTask(2, "Football");
        Assertions.assertEquals("1, Fiske, 2, Football", result);


    }


}
