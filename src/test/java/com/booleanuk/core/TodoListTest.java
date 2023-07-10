package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoListTest {
    TodoList todoList;
    Task task;

    @BeforeEach
    public void setup() {
        todoList = new TodoList();
        task = new Task();
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
}
