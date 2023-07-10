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

        int id = todoList.add(new Task("Clean room",false,LocalDateTime.now()));
        Assertions.assertEquals(1,id);

    }
}
