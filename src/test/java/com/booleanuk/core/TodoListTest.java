package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

class TodoListTest {

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

        Assertions.assertEquals("Task has been marked as complete.", result.changeTaskStatus("Train for 60 minutes"));

        Assertions.assertTrue(result.todoList.get("Train for 60 minutes"));
    }

    @Test
    public void markTestAsIncomplete() {
        TodoList result = new TodoList();

        result.addTask("Train for 60 minutes");
        result.changeTaskStatus("Train for 60 minutes");

        Assertions.assertEquals("Task has been marked as incomplete.", result.changeTaskStatus("Train for 60 minutes"));

        Assertions.assertFalse(result.todoList.get("Train for 60 minutes"));
    }

    @Test
    public void getAllCompletedTasks() {
        TodoList result = new TodoList();

        result.addTask("Do the dishes");
        result.addTask("Clean the bathroom");
        result.addTask("Train for 60 minutes");
        result.addTask("Cook dinner");

        result.changeTaskStatus("Train for 60 minutes");
        result.changeTaskStatus("Do the dishes");

        ArrayList<String> expected= new ArrayList<>();
        expected.add("Train for 60 minutes");
        expected.add("Do the dishes");

        Assertions.assertEquals(expected, result.getCompletedTasks());
    }

    @Test
    public void getAllIncompleteTasks() {
        TodoList result = new TodoList();

        result.addTask("Do the dishes");
        result.addTask("Clean the bathroom");
        result.addTask("Train for 60 minutes");
        result.addTask("Cook dinner");

        result.changeTaskStatus("Train for 60 minutes");
        result.changeTaskStatus("Do the dishes");

        ArrayList<String> expected= new ArrayList<>();
        expected.add("Clean the bathroom");
        expected.add("Cook dinner");

        Assertions.assertEquals(expected, result.getIncompleteTasks());
    }

    @Test
    public void doesTaskExistReturnTrue() {
        TodoList result = new TodoList();

        result.addTask("Do the dishes");
        result.addTask("Clean the bathroom");
        result.addTask("Train for 60 minutes");
        result.addTask("Cook dinner");

        Assertions.assertTrue(result.doesTaskExist("Train for 60 minutes"));
    }

    @Test
    public void doesTaskExistReturnFalse() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TodoList result = new TodoList();

        result.addTask("Do the dishes");
        result.addTask("Clean the bathroom");
        result.addTask("Cook dinner");

        boolean expected = result.doesTaskExist("Train for 60 minutes");

        Assertions.assertEquals("Task does not exist!\n", outContent.toString());

        Assertions.assertFalse(expected);
    }

    @Test
    public void removeTaskReturnTrue() {
        TodoList result = new TodoList();

        result.addTask("Do the dishes");
        result.addTask("Clean the bathroom");
        result.addTask("Train for 60 minutes");
        result.addTask("Cook dinner");

        Assertions.assertTrue(result.removeTask("Clean the bathroom"));
    }
}
