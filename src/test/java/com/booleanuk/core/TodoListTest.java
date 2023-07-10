package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void searchTaskByNameTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        todoList.addTask(task1);
        Assertions.assertEquals(task1.toString(), todoList.searchTaskByName("Make dinner"));
        Assertions.assertEquals("Task not found", todoList.searchTaskByName("Buy bread"));
    }

    @Test
    public void removeTaskTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        todoList.addTask(task1);
        Assertions.assertEquals("Task removed", todoList.removeTask("Make dinner"));
        Assertions.assertEquals("Task not found", todoList.removeTask("Buy bread"));
    }

    @Test
    public void displayInAlphabeticalOrderTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        Task task2 = new Task("Buy bread");
        Task task3 = new Task("Go to the doctor");
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        ArrayList<Task> orderedTasks = new ArrayList<>();
        orderedTasks.add(task2);
        orderedTasks.add(task3);
        orderedTasks.add(task1);
        Assertions.assertEquals(orderedTasks, todoList.displayInAlphabeticalOrder());
    }

    @Test
    public void displayInReverseAlphabeticalOrderTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        Task task2 = new Task("Buy bread");
        Task task3 = new Task("Go to the doctor");
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        ArrayList<Task> orderedTasks = new ArrayList<>();
        orderedTasks.add(task1);
        orderedTasks.add(task3);
        orderedTasks.add(task2);
        Assertions.assertEquals(orderedTasks, todoList.displayInReverseAlphabeticalOrder());
    }
}
