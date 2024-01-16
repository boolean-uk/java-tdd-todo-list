package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addOneNewTask() {
        TodoList result = new TodoList();

        HashMap<String, Boolean> expected = new HashMap<>();
        expected.put("Do the dishes", false);

        Assertions.assertEquals(expected, result.addTask());
    }
}
