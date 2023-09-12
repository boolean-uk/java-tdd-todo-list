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
}
