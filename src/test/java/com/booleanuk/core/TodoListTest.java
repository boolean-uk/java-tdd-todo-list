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
    public void testAddTaskNotInList()   {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("Eat yoghurt"));
    }

    @Test
    public void testAddTaskAlreadyInList()  {
        TodoList todoList = new TodoList();

        todoList.addTask("Eat yoghurt");
        Assertions.assertFalse(todoList.addTask("Eat yoghurt"));
    }
}
