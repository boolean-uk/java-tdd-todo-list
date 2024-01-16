package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

class TodoListTest {
    @Test
    public void addingTaskShouldReturnTrue() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Task1", "incomplete"));
    }
    @Test
    public void addingTaskShouldReturnFalse() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task1", "incomplete");
        Assertions.assertFalse(todoList.addTask("Task1", "incomplete"));
    }
    @Test
    public void shouldChangeStatusToComplete(){
        TodoList todoList = new TodoList();
        todoList.addTask("Task1", "incomplete");
        todoList.changeStatus("Task1", "complete");
        Assertions.assertEquals("complete", todoList.taskList.get("Task1"));
    }
    @Test
    public void shouldChangeStatusToIncomplete(){
        TodoList todoList = new TodoList();
        todoList.addTask("Task1", "complete");
        todoList.changeStatus("Task1", "incomplete");
        Assertions.assertEquals("incomplete", todoList.taskList.get("Task1"));
    }




}
