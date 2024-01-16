package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    TodoList todoList = new TodoList();

    Task task1 = new Task("Go shopping");
    Task task2 = new Task("Make dinner");

    @BeforeEach
    public void setupTestEnvironment() {
        todoList.clear();
    }

    @Test
    public void canInitializeTodoList() {
        Assertions.assertEquals(new ArrayList<Task>(), todoList.getTasks());
    }

    @Test
    public void canAddTaskToList() {
        Assertions.assertTrue(todoList.add(task1));
    }

}
