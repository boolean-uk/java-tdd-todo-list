package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

        Assertions.assertEquals(expected, result.addTask("Do the dishes"));
    }

    @Test
    public void showAllTasks() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TodoList result = new TodoList();

        HashMap<String, Boolean> expected = new HashMap<>();
        expected.put("Do the dishes", false);
        expected.put("Clean the bathroom", false);
        expected.put("Train for 60 minutes", false);
        expected.put("Cook dinner", false);

        result.addTask("Do the dishes");
        result.addTask("Clean the bathroom");
        result.addTask("Train for 60 minutes");
        result.addTask("Cook dinner");

        result.showAllTasks();
        Assertions.assertEquals(expected, outContent.toString());
    }
}
