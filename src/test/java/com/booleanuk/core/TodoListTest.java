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
    public void addTaskToTodoList() {
        TodoList todoList = new TodoList();

        String result = todoList.add("Do homework");

        Assertions.assertEquals("Task added to todo list", result);


    }
}
