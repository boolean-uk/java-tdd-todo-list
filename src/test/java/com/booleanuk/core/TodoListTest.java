package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void returnTrueIfTaskIsAddedToList() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        todoList.tasks.add(newTask);
        Assertions.assertTrue(todoList.tasks.contains(newTask));
    }
}
