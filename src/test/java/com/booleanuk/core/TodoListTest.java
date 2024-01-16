package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addNewTaskTest() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("clean"));
    }

    @Test
    public void addAlreadyExistingTaskTest() {
        TodoList todoList = new TodoList();
        todoList.addTask("clean");
        Assertions.assertFalse(todoList.addTask("clean"));
    }

    @Test
    public void seeListTest() {
        TodoList todoList = new TodoList();
        todoList.addTask("book dentist appointment");
        todoList.addTask("clean");
        todoList.addTask("bake");
        String list = todoList.seeList();
        Assertions.assertTrue(list.contains("clean") && list.contains("bake") && list.contains("book dentist appointment"));
    }

    @Test
    public void updateExistingTaskStatusTest() {
        TodoList todoList = new TodoList();
        todoList.addTask("clean");
        Assertions.assertTrue(todoList.updateTaskStatus("clean", true));
    }

    @Test
    public void updateNonExistingTaskStatusTest() {
        TodoList todoList = new TodoList();
        todoList.addTask("clean");
        Assertions.assertFalse(todoList.updateTaskStatus("bake", true));
    }

    @Test
    public void getCompletedTasksEmptyList() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals(new ArrayList<>(), todoList.getCompletedTasks());
    }

    @Test
    public void getCompletedTasksNotEmptyList() {
        TodoList todoList = new TodoList();
        todoList.addTask("clean");
        todoList.addTask("book dentist");
        todoList.updateTaskStatus("clean", true);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList("clean")), todoList.getCompletedTasks());
    }

    @Test
    public void getUncompletedTasksEmptyList() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals(new ArrayList<>(), todoList.getUncompletedTasks());
    }

    @Test
    public void getUncompletedTasksNotEmptyList() {
        TodoList todoList = new TodoList();
        todoList.addTask("clean");
        todoList.addTask("book dentist");
        todoList.updateTaskStatus("clean", true);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList("book dentist")), todoList.getUncompletedTasks());
    }
}
