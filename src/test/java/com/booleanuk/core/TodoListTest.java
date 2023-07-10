package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    TodoList todoList;

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void test() {
        todoList = new TodoList();
        todoList.add(new Task("Task no. 1"));

        Assertions.assertEquals(1, todoList.tasks.size());
    }
}
