package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {

    Task task0 = new Task("AEat lunch.");
    Task task1 = new Task("BWash hands.");
    Task task2 = new Task("CWash hands.");


    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    void testAdd() {
        TodoList todoList = new TodoList();
        //Some changes
        Assertions.assertFalse(todoList.todos.contains(task0));
        todoList.add(task0);
        Assertions.assertTrue(todoList.todos.contains(task0));
    }

    @Test
    void testView() {
        TodoList todoList = new TodoList();
        List<Task> array = new ArrayList<>();
        //Before adding tasks
        Assertions.assertIterableEquals(todoList.view(), array);
        todoList.add(task0);
        todoList.add(task1);
        array.add(task0);
        array.add(task1);
        // After adding tasks
        Assertions.assertIterableEquals(todoList.view(), array);

    }

    @Test
    void testChangeStatus() {
        TodoList todoList = new TodoList();
        todoList.add(task0);
        todoList.add(task1);
        todoList.changeStatus(task0);
        Assertions.assertTrue(todoList.todos.get(0).isCompleted());
        Assertions.assertFalse(todoList.todos.get(1).isCompleted());
    }

    @Test
    void testGetCompletedTasks() {
        TodoList todoList = new TodoList();
        List<Task> array = new ArrayList<>();
        task0.toggleCompleted();
        todoList.add(task0);
        todoList.add(task1);
        array.add(task0);
        Assertions.assertIterableEquals(todoList.getCompletedTasks(), array);
    }

    @Test
    void testGetIncompletedTasks() {
        TodoList todoList = new TodoList();
        List<Task> array = new ArrayList<>();
        task0.toggleCompleted();
        todoList.add(task0);
        todoList.add(task1);
        array.add(task1);
        Assertions.assertIterableEquals(todoList.getIncompletedTasks(), array);
    }

    @Test
    void testSearch() {
        TodoList todoList = new TodoList();
        todoList.add(task0);
        Assertions.assertEquals(todoList.search(task0), "it was found");
        Assertions.assertEquals(todoList.search(task1), "it wasn't found");

    }

    @Test
    void testRemove() {
        TodoList todoList = new TodoList();
        List<Task> arrayToRemove = new ArrayList<>();
        List<Task> expetedArray = new ArrayList<>();
        expetedArray.add(task0);
        arrayToRemove.add(task1);
        todoList.add(task0);
        todoList.add(task1);
        todoList.remove(arrayToRemove);
        Assertions.assertIterableEquals(todoList.todos, expetedArray);
    }

    @Test
    void testAscOrder() {
        TodoList todoList = new TodoList();
        todoList.add(task0);
        todoList.add(task2);
        todoList.add(task1);
        List<Task> expetedArray = new ArrayList<>();
        expetedArray.add(task0);
        expetedArray.add(task1);
        expetedArray.add(task2);
        Assertions.assertIterableEquals(todoList.ascOrder(),expetedArray);
    }

    @Test
    void testDscOrder() {
        TodoList todoList = new TodoList();
        todoList.add(task0);
        todoList.add(task2);
        todoList.add(task1);
        List<Task> expetedArray = new ArrayList<>();
        expetedArray.add(task2);
        expetedArray.add(task1);
        expetedArray.add(task0);
        Assertions.assertIterableEquals(todoList.dscOrder(),expetedArray);
    }
}
