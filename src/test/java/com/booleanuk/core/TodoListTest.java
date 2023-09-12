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
    public void addTask() {
        TodoList todoList = new TodoList();
        String task = "Wash the car";
        Assertions.assertTrue(todoList.addTask(task));

        String task2 = task;
        Assertions.assertFalse(todoList.addTask(task2));

        String task3 = "Do the dishes";
        Assertions.assertTrue(todoList.addTask(task3));
    }
}
