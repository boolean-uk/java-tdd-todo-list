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
    public void addTaskTest(){
        TodoList todo = new TodoList();
        Task task = new Task("Code more");
        Assertions.assertEquals(0,todo.list.size());
        todo.addTask(task);
        Assertions.assertEquals("Code more",todo.list.get(0));
        Assertions.assertEquals(1,todo.list.size());

    }
}
