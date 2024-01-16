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
    public void testAdd() {
        TodoList todo = new TodoList();
        Assertions.assertEquals(true, todo.add("Need to wash my hands"));
    }

    @Test
    public void testListAllTasks(){
        TodoList todo = new TodoList();
        todo.add("Need to wash my hands");
        todo.add("Wash car");
        todo.listTasks();
        Assertions.assertEquals(2, todo.listTasks());
        todo.add("Trim beard");
        todo.listTasks();
        Assertions.assertEquals(3, todo.listTasks());
    }
}
