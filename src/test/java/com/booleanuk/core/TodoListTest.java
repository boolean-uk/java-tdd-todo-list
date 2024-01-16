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
        Assertions.assertTrue(TodoList.tasks.contains(new Task("Do laundry")));
        Assertions.assertTrue(TodoList.tasks.contains(new Task("Walk dog", true)));
    }
}
