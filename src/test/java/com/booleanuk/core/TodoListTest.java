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
    public void addTest(){
        TodoList todo = new TodoList("First task", false);
        Assertions.assertEquals("Task added to to-do list", todo.add("Second task", false) );
    }
}
