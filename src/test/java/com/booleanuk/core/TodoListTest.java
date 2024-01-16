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
    public void addTaskTest() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask(new Task("Do laundry", false)));
        Assertions.assertTrue(todoList.addTask(new Task("Walk dog", true)));
        Assertions.assertEquals("Do laundry", todoList.tasks.get(0).name);
        Assertions.assertFalse(todoList.tasks.get(0).complete);
        Assertions.assertEquals("Walk dog", todoList.tasks.get(1).name);
        Assertions.assertTrue(todoList.tasks.get(1).complete);

    }

    @Test
    public void showTasksTest() {

    }
}
