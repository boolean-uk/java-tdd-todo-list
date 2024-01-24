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
        ArrayList<Task> expectedTasks = new ArrayList<>();
        expectedTasks.add(task1);
        expectedTasks.add(task2);
        TodoList todoList = new TodoList();
        todoList.addTask(task1);
        todoList.addTask(task2);
        ArrayList<Task> actualTasks = todoList.getTasks();
        Assertions.assertEquals(actualTasks, expectedTasks);
    }

    //User story 3 is in TaskTest

    //User story 4
    @Test
    public void shouldReturnTrueIfAllTasksAreCompleted() {
        TodoList todoList = new TodoList();
        Task completedTask = new Task("Buy groceries");
        completedTask.setCompleted(true);
        Task uncompletedTask = new Task("Clean apartment");

        ArrayList<Task> expectedCompletedTasks = new ArrayList<>();
        expectedCompletedTasks.add(completedTask);

        todoList.addTask(completedTask);
        todoList.addTask(uncompletedTask);

        ArrayList<Task> actualCompletedTasks = todoList.getCompletedTasks();

        Assertions.assertEquals(actualCompletedTasks, expectedCompletedTasks);
    }

    //User story 5
    @Test
    public void shouldReturnTrueIfAllTasksAreUncompleted() {
        TodoList todoList = new TodoList();
        Task completedTask = new Task("Buy groceries");
        completedTask.setCompleted(true);
        Task uncompletedTask = new Task("Clean apartment");

        ArrayList<Task> expectedUncompletedTasks = new ArrayList<>();
        expectedUncompletedTasks.add(uncompletedTask);

        todoList.addTask(completedTask);
        todoList.addTask(uncompletedTask);

        ArrayList<Task> actualUncompletedTasks = todoList.getUncompletedTasks();

        Assertions.assertEquals(actualUncompletedTasks, expectedUncompletedTasks);
    }

    //User story 6
    @Test
    public void checkIfTaskIsNotFound() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy groceries");
        String found = todoList.searchForTask(task);
        Assertions.assertEquals("Buy groceries wasn't found", found);
    }

    //User story 7
    @Test
    public void assertThatTaskIsRemoved() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy groceries");
        todoList.addTask(task);
        todoList.removeTask(task);
        String found = todoList.searchForTask(task);
        Assertions.assertEquals("Buy groceries wasn't found", found);
    }

}
