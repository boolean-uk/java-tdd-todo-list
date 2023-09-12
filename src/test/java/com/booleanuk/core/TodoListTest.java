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
    public void sizeShouldChangeWhenAddingTasks() {
        TodoList tdl = new TodoList();
        Assertions.assertEquals(0, tdl.tasks.size());
        tdl.add("Super Market");
        tdl.add("Get Haircut");
        Assertions.assertEquals(2, tdl.tasks.size());
    }

    @Test
    public void tasksShouldBeRetrievedSuccessfully() {
        TodoList tdl = new TodoList();
        Assertions.assertEquals("", tdl.getTasks());
        tdl.add("Super Market");
        tdl.add("Get Haircut");

        String expectedOutput = "Super Market\nGet Haircut";
        Assertions.assertEquals(expectedOutput, tdl.getTasks());
    }
}
