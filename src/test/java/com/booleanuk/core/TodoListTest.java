package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TodoListTest {

    Task task0 = new Task("Eat lunch.");
    Task task1 = new Task("Wash hands.");


    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    void testAdd() {
        TodoList todoList = new TodoList();
        Assertions.assertFalse(todoList.todos.contains(task0));
        todoList.add(task0);
        Assertions.assertTrue(todoList.todos.contains(task0));
    }

    @Test
    void testView() {

    }

    @Test
    void testChangeStatus(){

    }
    @Test
    void testGetCompletedTasks(){

    }
    @Test
    void testGetIncompletedTasks(){

    }
    @Test
    void testSearch(){

    }
    @Test
    void testRemove(){

    }
    @Test
    void testAscOrder(){

    }
    @Test
    void testDscOrder(){

    }
}
