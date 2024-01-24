package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    //User story 1
    @Test
    public void checkIfTaskIsAdded() {
        Task task = new Task("Buy groceries");
        TodoList todoList = new TodoList();
        todoList.addTask(task);
        boolean taskFound = todoList.getTask(task);
        Assertions.assertTrue(taskFound);
    }

}
