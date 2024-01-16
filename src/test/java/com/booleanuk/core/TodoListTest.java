package com.booleanuk.core;

import com.sun.tools.javac.Main;
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
    public void testAddTaskToList() {
        TodoList list = new TodoList();
        list.addTask("clean");
        Assertions.assertTrue(list.toDoList.containsKey("clean"));

    }
}
