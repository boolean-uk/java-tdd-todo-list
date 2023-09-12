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
    public void addTask() {
        TodoList todoList = new TodoList();
        String task = "Wash the car";
        Assertions.assertTrue(todoList.addTask(task));

        String task2 = task;
        Assertions.assertFalse(todoList.addTask(task2));

        String task3 = "Do the dishes";
        Assertions.assertTrue(todoList.addTask(task3));
    }

    @Test
    public void showToDoList() {
        TodoList todoList = new TodoList();

        ArrayList<String> thisList = todoList.showToDoList();
        Assertions.assertEquals(0, thisList.size());

        String task1 = "Do the dishes";
        String task2 = "Wash the car";
        todoList.addTask(task1);
        todoList.addTask(task2);

        ArrayList<String> thisList2 = todoList.showToDoList();

        Assertions.assertEquals(task1, thisList2.get(0));
        Assertions.assertEquals(task2, thisList2.get(1));
    }

    @Test
    public void changeStatus() {
        TodoList todoList = new TodoList();

        String task1 = "Do the dishes";
        String task2 = "Wash the car";
        todoList.addTask(task1);
        todoList.addTask(task2);

        String complete = "complete";
        String incomplete = "incomplete";

        Assertions.assertFalse(todoList.changeStatus("Read a book", complete));
        Assertions.assertFalse(todoList.changeStatus("Read a book", incomplete));

        Assertions.assertFalse(todoList.changeStatus(task1, incomplete));
        Assertions.assertTrue(todoList.changeStatus(task1, complete));
    }

    @Test
    public void getCategoryTasks() {
        TodoList todoList = new TodoList();

        String task1 = "Do the dishes";
        String task2 = "Wash the car";
        todoList.addTask(task1);
        todoList.addTask(task2);

        String complete = "complete";
        String incomplete = "incomplete";

        ArrayList<String> completedTasks = todoList.getCategoryTasks(complete);
        ArrayList<String> incompletedTasks = todoList.getCategoryTasks(incomplete);

        Assertions.assertEquals(0, completedTasks.size());
        Assertions.assertNotEquals(0, incompletedTasks.size());
        Assertions.assertEquals(2, incompletedTasks.size());

        todoList.changeStatus(task1, complete);
        completedTasks = todoList.getCategoryTasks(complete);
        incompletedTasks = todoList.getCategoryTasks(incomplete);

        Assertions.assertEquals(1, completedTasks.size());
        Assertions.assertEquals(1, incompletedTasks.size());

        todoList.changeStatus(task2, complete);
        completedTasks = todoList.getCategoryTasks(complete);
        incompletedTasks = todoList.getCategoryTasks(incomplete);

        Assertions.assertEquals(2, completedTasks.size());
        Assertions.assertEquals(0, incompletedTasks.size());

        todoList.changeStatus(task1, incomplete);
        completedTasks = todoList.getCategoryTasks(complete);
        incompletedTasks = todoList.getCategoryTasks(incomplete);

        Assertions.assertEquals(1, completedTasks.size());
        Assertions.assertEquals(1, incompletedTasks.size());
    }
}
