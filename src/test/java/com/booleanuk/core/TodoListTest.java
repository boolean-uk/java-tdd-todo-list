package com.booleanuk.core;

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
    public void addTaskToTodoList() {
        TodoList todoList = new TodoList();

        String result = todoList.add("Do homework");

        Assertions.assertEquals("Task added to todo list.", result);
    }

    @Test
    public void showTasksInTodoList() {
        TodoList todoList = new TodoList();

        todoList.add("Alice");
        todoList.add("Bob");
        todoList.add("Charlie");

        String result = todoList.showTasks();

        Assertions.assertEquals("[Alice, Bob, Charlie]", result);
    }

}
