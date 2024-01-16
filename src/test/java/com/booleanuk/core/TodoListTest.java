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

        boolean result = task1.addTask(1, "Fiske");
        Assertions.assertTrue(result);
    }

    @Test
    public void isItemAlreadyAdded() {
        TodoList task1 = new TodoList();

        boolean result = task1.addTask(2, "Football");
        Assertions.assertFalse(result);

    }


}
