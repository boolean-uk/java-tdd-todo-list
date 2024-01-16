package com.booleanuk.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TodoListTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown()  {
        System.setOut(standardOut);
    }

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAddTaskNotInList()   {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("Eat yoghurt"));
    }

    @Test
    public void testAddTaskAlreadyInList()  {
        TodoList todoList = new TodoList();

        todoList.addTask("Eat yoghurt");
        Assertions.assertFalse(todoList.addTask("Eat yoghurt"));
    }

    @Test
    public void testAddMultipleTasks()  {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("Eat yoghurt"));
        Assertions.assertTrue(todoList.addTask("Paint the Mona Lisa"));
        Assertions.assertTrue(todoList.addTask("Do laundry"));
        Assertions.assertTrue(todoList.addTask("Talk to janitor"));
        Assertions.assertFalse(todoList.addTask("Eat yoghurt"));
        Assertions.assertTrue(todoList.addTask("Sing a song"));
    }

    @Test
    public void testShowAllTasks()  {
        TodoList todoList = new TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        String expectedString = """
                Your tasks are:
                [ ] Eat yoghurt
                [ ] Paint the Mona Lisa
                [ ] Do laundry
                [ ] Talk to janitor
                """;
        todoList.showAllTasks();

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }
}
