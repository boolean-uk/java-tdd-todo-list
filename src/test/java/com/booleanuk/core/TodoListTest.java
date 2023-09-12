package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    @Test
    public void tasksShouldChangeStatus() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");

        Assertions.assertFalse(tdl.tasks.get(0).getStatus());
        tdl.setStatus("Laundry");
        Assertions.assertTrue(tdl.tasks.get(0).getStatus());
    }

    @Test
    public void shouldGetCompleteTasks() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Super Market");
        tdl.add("Get Haircut");
        tdl.setStatus("Laundry");

        Task task1 = new Task("Super Market");
        Task task2 = new Task("Get Haircut");
        ArrayList<Task> expected = new ArrayList<>() {
            {
                add(task1);
                add(task2);
            }
        };
        Assertions.assertEquals(expected, tdl.getComplete());
    }

    @Test
    public void shouldGetIncompleteTasks() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Super Market");
        tdl.add("Get Haircut");
        tdl.setStatus("Laundry");
        tdl.setStatus("Get Haircut");

        Task task1 = new Task("Laundry");
        Task task2 = new Task("Get Haircut");
        ArrayList<Task> expected = new ArrayList<>() {
            {
                add(task1);
                add(task2);
            }
        };
        Assertions.assertEquals(expected, tdl.getComplete());
    }
}
