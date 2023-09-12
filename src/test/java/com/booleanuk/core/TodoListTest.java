package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void sizeShouldChangeWhenAddingTasks() {
        TodoList tdl = new TodoList();
        Assertions.assertEquals(0, tdl.tasks.size());
        tdl.add("Super Market");
        tdl.add("Get Haircut");
        Assertions.assertEquals(2, tdl.tasks.size());
    }

    @Test
    public void tasksShouldBePrintedSuccessfully() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TodoList tdl = new TodoList();
        tdl.add("Super Market");
        tdl.add("Get Haircut");
        tdl.viewTasks();

        String expectedOutput = "Super Market\nGet Haircut";
        Assertions.assertEquals(expectedOutput, outContent.toString());
    }
}
