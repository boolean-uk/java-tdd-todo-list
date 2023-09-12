package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAddTaskWorks() {
        TodoList todoList = new TodoList();

        assertTrue(todoList.addToTodoList("Walk the dog", true));
        Assertions.assertTrue(todoList.tasks.containsKey("Walk the dog"));
        Assertions.assertEquals(true, todoList.tasks.get("Walk the dog"));
    }
}
