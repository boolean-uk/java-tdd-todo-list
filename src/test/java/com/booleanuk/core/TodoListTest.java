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

    @Test
    public void tasksShouldChangeStatusIfExists() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");

        Assertions.assertFalse(tdl.tasks.get(0).getStatus());
        tdl.setStatus("Laundry");
        Assertions.assertTrue(tdl.tasks.get(0).getStatus());
        Assertions.assertFalse(tdl.setStatus("Walk Dog"));
    }

    @Test
    public void shouldGetCompleteTasks() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Super Market");
        tdl.add("Get Haircut");
        tdl.setStatus("Laundry");
        tdl.setStatus("Get Haircut");

        String expected = "Laundry\nGet Haircut";
        Assertions.assertEquals(expected, tdl.getComplete());
    }

    @Test
    public void shouldGetIncompleteTasks() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Super Market");
        tdl.add("Get Haircut");
        tdl.setStatus("Laundry");

        String expected = "Super Market\nGet Haircut";
        Assertions.assertEquals(expected, tdl.getIncomplete());
    }

    @Test
    public void shouldGetEmptyString() {
        TodoList tdl = new TodoList();
        String expected = "";
        Assertions.assertEquals(expected, tdl.getComplete());
        Assertions.assertEquals(expected, tdl.getIncomplete());
        tdl.add("Laundry");
        tdl.setStatus("Laundry");
        Assertions.assertEquals(expected, tdl.getIncomplete());
    }

    @Test
    public void shouldFindExistingTask() {
        TodoList tdl = new TodoList();
        tdl.add("Iron Clothes");
        tdl.add("Laundry");
        tdl.add("Walk Dog");
        String expected = "Laundry";
        Task task = tdl.search("Laundry");
        Assertions.assertEquals(expected, task == null? null: task.getName());
    }

    @Test
    public void shouldNotFindFakeTask() {
        TodoList tdl = new TodoList();
        tdl.add("Iron Clothes");
        tdl.add("Laundry");
        Assertions.assertNull(tdl.search("Walk Dog"));
    }

    @Test
    public void shouldRemoveExistingTask(){
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Walk Dog");
        tdl.add("Iron Clothes");
        Assertions.assertTrue(tdl.remove("Iron Clothes"));
        String expected = "Laundry\nWalk Dog";
        Assertions.assertEquals(expected, tdl.getTasks());
    }

    @Test
    public void shouldNotRemoveFakeTask() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Walk Dog");
        Assertions.assertFalse(tdl.remove("Iron Clothes"));
    }
}
