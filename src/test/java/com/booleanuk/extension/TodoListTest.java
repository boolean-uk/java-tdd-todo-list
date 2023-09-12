package com.booleanuk.extension;

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
    public void getExistingTaskById() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Walk Dog");
        tdl.add("Wash Clothes");

        Assertions.assertEquals("Laundry", tdl.getTaskById(0).getName());
        Assertions.assertEquals("Wash Clothes", tdl.getTaskById(2).getName());
        Assertions.assertFalse(tdl.getTaskById(0).getStatus());
        Assertions.assertEquals(0, tdl.getTaskById(0).getId());
    }

    @Test
    public void shouldGetNullForNonExistingId() {
        TodoList tdl = new TodoList();
        Assertions.assertNull(tdl.getTaskById(0));

        tdl.add("Walk Dog");
        tdl.add("Wash Clothes");
        Assertions.assertNull(tdl.getTaskById(2));
        Assertions.assertNull(tdl.getTaskById(-1));
    }

    @Test
    public void shouldUpdateNameWithId() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Walk Dog");
        tdl.add("Wash Clothes");
        Assertions.assertTrue(tdl.updateTask(0, "Super Market"));
        Assertions.assertTrue(tdl.updateTask(2, "Meet Friends"));

        String expected = "Super Market\nWalk Dog\nMeet Friends";
        Assertions.assertEquals(expected, tdl.getTasks());
    }

    @Test
    public void shouldNotUpdateWhenNonExistingId() {
        TodoList tdl = new TodoList();
        Assertions.assertFalse(tdl.updateTask(0, "Laundry"));
        Assertions.assertFalse(tdl.updateTask(-1, "Laundry"));

        tdl.add("Walk Dog");
        tdl.add("Wash Clothes");
        Assertions.assertFalse(tdl.updateTask(2, "Laundry"));
        String expected = "Walk Dog\nWash Clothes";
        Assertions.assertEquals(expected, tdl.getTasks());
    }

    @Test
    public void shouldChangeStatusById() {
        TodoList tdl = new TodoList();
        tdl.add("Laundry");
        tdl.add("Walk Dog");
        Assertions.assertFalse(tdl.getTaskById(0).getStatus());
        Assertions.assertTrue(tdl.setStatus(0));
        Assertions.assertTrue(tdl.getTaskById(0).getStatus());
    }

    @Test
    public void shouldNotChangeStatusWhenNonExistingId() {
        TodoList tdl = new TodoList();
        Assertions.assertFalse(tdl.setStatus(0));
        tdl.add("Laundry");
        Assertions.assertFalse(tdl.getTaskById(0).getStatus());
        Assertions.assertFalse(tdl.setStatus(1));
        Assertions.assertFalse(tdl.setStatus(-1));
        Assertions.assertFalse(tdl.getTaskById(0).getStatus());
    }
}
