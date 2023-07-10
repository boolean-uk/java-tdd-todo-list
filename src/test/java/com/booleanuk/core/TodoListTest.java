package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    TodoList todoList;

    public TodoListTest() {
        this.todoList = new TodoList();
    }
    @Test
    public void addTest() {
        todoList.add("Running for 5km");

        Assertions.assertTrue(todoList.getToDoList().containsKey("Running for 5km"));
    }
}
