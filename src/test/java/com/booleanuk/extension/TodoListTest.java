package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoListTest {
    TodoList todoList = new TodoList();

    Task task1 = new Task("Go shopping");
    Task task2 = new Task("Make dinner");
    Task task3 = new Task("Prepare for meeting");

    @BeforeEach
    public void setupTestEnvironment() {
        todoList.clear();
    }

    @Test
    public void canInitializeTodoList() {

    }
}
