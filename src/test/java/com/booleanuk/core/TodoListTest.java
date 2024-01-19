package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
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
    @Test
    public void removingTaskReturnTrue(){
        TodoList todoList = new TodoList();
        todoList.addTask("Task1", "incomplete");
        todoList.addTask("Task2", "incomplete");
        Assertions.assertTrue(todoList.removeTask("Task1"));
    }
    @Test
    public void removingTaskReturnFalse(){
        TodoList todoList = new TodoList();
        todoList.addTask("Task2", "incomplete");
        Assertions.assertFalse(todoList.removeTask("Task1"));
    }
    @Test
    public void searchTask(){
        TodoList todoList = new TodoList();
        todoList.addTask("Task1", "incomplete");
        Assertions.assertEquals("incomplete", todoList.searchTask("Task1"));

    }
    @Test
    public void getTaskAscendingOrder(){
        TodoList todoList = new TodoList();
        todoList.addTask("Fork daily assignment", "incomplete");
        todoList.addTask("Create a todo app", "incomplete");
        todoList.addTask("Watch video on JUnit", "incomplete");
        ArrayList<String> todoToday = todoList.getTaskAscending();
        Assertions.assertEquals("Create a todo app", todoToday.get(0));
        Assertions.assertEquals("Fork daily assignment", todoToday.get(1));
        Assertions.assertEquals("Watch video on JUnit", todoToday.get(2));


    }
    @Test
    public void getTaskDescendingOrder(){
        TodoList todoList = new TodoList();
        todoList.addTask("Fork daily assignment", "incomplete");
        todoList.addTask("Create a todo app", "incomplete");
        todoList.addTask("Watch video on JUnit", "incomplete");
        ArrayList<String> todoToday = todoList.getTaskDescending();
        Assertions.assertEquals("Watch video on JUnit", todoToday.get(0));
        Assertions.assertEquals("Fork daily assignment", todoToday.get(1));
        Assertions.assertEquals("Create a todo app", todoToday.get(2));

    }
    @Test
    public void getCompleteTask(){
        TodoList todoList = new TodoList();
        todoList.addTask("Fork daily assignment", "complete");
        todoList.addTask("Create a todo app", "complete");
        todoList.addTask("Watch video on JUnit", "incomplete");
        ArrayList<String> completeTask = todoList.getCompleteTask();
        Assertions.assertTrue(completeTask.contains("Fork daily assignment"));
        Assertions.assertTrue(completeTask.contains("Create a todo app"));
        Assertions.assertFalse(completeTask.contains("Watch video on JUnit"));
    }
    @Test
    public void getInCompleteTask(){
        TodoList todoList = new TodoList();
        todoList.addTask("Fork daily assignment", "complete");
        todoList.addTask("Create a todo app", "incomplete");
        todoList.addTask("Watch video on JUnit", "incomplete");
        ArrayList<String> completeTask = todoList.getInCompleteTask();
        Assertions.assertFalse(completeTask.contains("Fork daily assignment"));
        Assertions.assertTrue(completeTask.contains("Create a todo app"));
        Assertions.assertTrue(completeTask.contains("Watch video on JUnit"));
    }



}
