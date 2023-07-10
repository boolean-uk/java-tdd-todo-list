package com.booleanuk.core;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    TodoList todoList;
    Task task;

    @BeforeEach
    public void setup() {
        todoList = new TodoList();
        task = new Task();
    }

    @AfterEach
    public void empty() {
        todoList.tasks.clear();
    }

    @Test
    public void addTaskReturnTrue() {
        Assertions.assertTrue(todoList.add(task));
    }

    @Test
    public void addTaskReturnFalse() {
        todoList.add(task);
        Assertions.assertFalse(todoList.add(task));
    }

    @Test
    public void getTaskReturnEmptyList() {
        List<Task> result = todoList.getTasks() ;

        Assertions.assertEquals(0, result.size());
    }

    @Test
    public void getCompleteTaskReturnEmptyList() {
        List<Task> result = todoList.getCompleteTasks();

        Assertions.assertEquals(0, result.size());
    }

}
