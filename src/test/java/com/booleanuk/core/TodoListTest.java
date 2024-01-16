package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

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

    @Test
    public void testRemovingTask(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        Assertions.assertTrue(todoList.list.containsKey("Wash clothes"));
        Assertions.assertEquals(todoList.remove("Wash clothes"),"Wash clothes removed from TodoList");
        todoList.remove("Wash clothes");
        Assertions.assertFalse(todoList.list.containsKey("Wash clothes"));
    }

    @Test
    public void testShowAllTasks(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.add("Wash");
        String expected="Wash : Incomplete\nWash clothes : Incomplete\n";


        Assertions.assertEquals(expected,todoList.show());

    }
}
