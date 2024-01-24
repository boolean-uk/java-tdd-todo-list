package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    //User story 2
    @Test
    public void checkIfAllTasksAreShown() {
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Clean apartment");
        ArrayList<String> expectedTasksNames = new ArrayList<>();
        expectedTasksNames.add(task1.getName());
        expectedTasksNames.add(task2.getName());
        TodoList todoList = new TodoList();
        todoList.addTask(task1);
        todoList.addTask(task2);
        ArrayList<String> actualTasksNames = todoList.getTasks();
        Assertions.assertEquals(actualTasksNames, expectedTasksNames);
    }

}
