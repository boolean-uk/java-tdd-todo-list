package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {

    TodoList todoList;

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testTask1() {
        todoList = new TodoList();
        todoList.add(new Task("Task no. 1"));

        Assertions.assertEquals(1, todoList.tasks.size());
    }
    @Test
    public void testTask2() {
        todoList = new TodoList();
        todoList.add(new Task("Task no. 1"));
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task no. 1"));

        Assertions.assertEquals(tasks, todoList.getTasks());
    }
}
