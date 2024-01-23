package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    //User story 1
    @Test
    public void returnTrueIfTaskIsAdded() {
        Task task = new Task("Buy groceries");
        TodoList todoList = new TodoList();
        boolean added = todoList.addTask(task);
        Assertions.assertTrue(added);
    }
}
