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

        Map<String, Boolean> todolist = todoList.getTodolist();



    }
}
