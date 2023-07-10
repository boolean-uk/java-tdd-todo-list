package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

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

        assertTrue(todoList.add(new Task(1,"Clean bedroom",false, LocalDateTime.now())));
        assertFalse(todoList.add(new Task(1,"Cook dinner", false, LocalDateTime.now())));
    }
}
