package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.*;
import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        assertEquals("Hello", hello);
        assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testIfAddsTask(){
        TodoList todoList = new TodoList();

        int id = todoList.add(new Task("Clean room",false, now()));
        assertEquals(1,id);

    }

    @Test
    public void testIfReturnsAllTasks(){
        TodoList todoList = new TodoList();

        todoList.add(new Task("bla bla",false, now()));
        todoList.add(new Task("clean",true, now()));
        assertEquals(2,todoList.getAll().size());
    }
}
