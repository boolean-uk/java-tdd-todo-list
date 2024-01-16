package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }


    @Test
    public void TestAddTaskToTodolist() {
        TodoList todoList = new TodoList();

        todoList.addTaskToTodolist("Task1");

        Map<String, Boolean> todolistMap = todoList.getTodolist();

        Assertions.assertTrue(todolistMap.containsKey("Task1"));
        Assertions.assertFalse(todolistMap.get("Task1"));

        todoList.addTaskToTodolist(null);

        Assertions.assertFalse(todolistMap.containsKey(null));

    }

}
