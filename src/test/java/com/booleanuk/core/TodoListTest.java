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

        String expected = "Clean the bathroom\n";
        expected += "Train for 60 minutes\n";
        expected += "Do the dishes\n";
        expected += "Cook dinner\n";

        result.addTask("Do the dishes");
        result.addTask("Clean the bathroom");
        result.addTask("Train for 60 minutes");
        result.addTask("Cook dinner");

        result.showAllTasks();
        Assertions.assertEquals(expected, outContent.toString());
    }

    @Test
    public void markTestAsComplete() {
        TodoList result = new TodoList();

        result.addTask("Train for 60 minutes");

        Assertions.assertEquals("Task has been marked as completed.", result.changeTaskStatus("Train for 60 minutes"));

        Assertions.assertTrue(result.todoList.get("Train for 60 minutes"));
    }
}
