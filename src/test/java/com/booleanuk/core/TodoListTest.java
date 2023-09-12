package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void addTaskSuccessful() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.tasks.containsKey("Feed the cat"));
        Assertions.assertFalse(todoList.tasks.get("Feed the cat"));
    }
    @Test
    public void addTaskFailed() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.tasks.containsKey("Feed the cat"));
        Assertions.assertFalse(todoList.addTask("Feed the cat"));
    }
    @Test
    public void addTaskFailsBecauseEmptyString() {
        TodoList todoList = new TodoList();
        Assertions.assertFalse(todoList.addTask("\n\r\t"));
        Assertions.assertEquals(0, todoList.tasks.size());
    }

}
