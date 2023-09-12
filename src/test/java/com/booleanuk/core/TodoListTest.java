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
        String task = "Walk the dog";
        boolean taskFinished = true;

        assertTrue(todoList.addToTodoList(task, taskFinished));
        Assertions.assertTrue(todoList.taskList.containsKey(task));
        Assertions.assertEquals(true, todoList.taskList.get(task));
    }
}
