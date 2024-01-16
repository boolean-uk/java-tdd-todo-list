package com.booleanuk.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

class TodoListTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    private String getOutput() {
        return outputStreamCaptor.toString().trim();
    }

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }


    @Test
    public void testAddTaskToTodolist() {
        TodoList todoList = new TodoList();

        todoList.addTaskToTodolist("Task1");

        Map<String, Boolean> todolistMap = todoList.getTodolist();

        Assertions.assertTrue(todolistMap.containsKey("Task1"));
        Assertions.assertFalse(todolistMap.get("Task1"));

        todoList.addTaskToTodolist(null);

        Assertions.assertFalse(todolistMap.containsKey(null));

    }

    @Test
    public void testPrintTasksFromTodolist() {
        TodoList todoList = new TodoList();

        todoList.addTaskToTodolist("Task1");
        todoList.addTaskToTodolist("Task2");
        todoList.addTaskToTodolist("Task3");
        todoList.addTaskToTodolist("Task4");


        todoList.printTasksFromTodolist();
        Assertions.assertTrue(getOutput().contains("Task1"));
        Assertions.assertTrue(getOutput().contains("Task1"));
        Assertions.assertTrue(getOutput().contains("Task1"));
        Assertions.assertTrue(getOutput().contains("Task1"));
        Assertions.assertFalse(getOutput().contains("Task5"));

    }

    @Test
    public void testChangeTaskToCompleteOrIncomplete() {
        TodoList todoList = new TodoList();

        todoList.changeTaskToCompleteOrIncomplete("Task1");

        Map<String, Boolean> todolistMap = todoList.getTodolist();

        Assertions.assertTrue(todolistMap.containsKey("Task1"));

    }
}
