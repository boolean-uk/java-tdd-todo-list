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
    public void testAddingTask(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        Assertions.assertTrue(todoList.list.containsKey("Wash clothes"));

    }
}
