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

}
