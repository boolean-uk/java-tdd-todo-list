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
    public void shouldAddTaskToTheListAndReturnMessageConfirmingTheTaskExist() {
        TodoList todoList = new TodoList();
        String task = "grocery shopping";
        todoList.add(task);

        String message = todoList.taskSearch(task);

        Assertions.assertEquals("Task is on your list", message);
    }

    @Test
    public void shouldReturnMessageSayingTheTaskDoesntExist() {
        TodoList todoList = new TodoList();
        String task = "grocery shopping";

        String message = todoList.taskSearch(task);

        Assertions.assertEquals("Task is not on your list", message);
    }

    @Test
    public void shouldReturnTheWholeTodoList() {
        TodoList todoList = new TodoList();
        todoList.add("cook dinner");
        todoList.add("laundry");
        todoList.add("grocery shopping");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("cook dinner");
        expected.add("laundry");
        expected.add("grocery shopping");

        ArrayList<String> actual = todoList.taskList();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldChangeTheStatusToCompleted() {
        TodoList todoList = new TodoList();
        String task = "grocery shopping";
        todoList.statusChange(task);

        ArrayList<String> incompletedTasks = todoList.incompletedTasks();

        Assertions.assertTrue(incompletedTasks.contains(task));
    }

    @Test
    public void shouldReturnIncompletedTasks() {
        TodoList todoList = new TodoList();
        todoList.add("cook dinner");
        todoList.add("laundry");
        todoList.add("grocery shopping");
        todoList.statusChange("laundry");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("cook dinner");
        expected.add("grocery shopping");

        ArrayList<String> actual = todoList.incompletedTasks();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnCompletedTasks() {
        TodoList todoList = new TodoList();
        todoList.add("cook dinner");
        todoList.add("laundry");
        todoList.add("grocery shopping");
        todoList.statusChange("cook dinner");
        todoList.statusChange("laundry");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("cook dinner");
        expected.add("laundry");

        ArrayList<String> actual = todoList.completedTasks();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldRemoveTaskFromTheListAndReturnMessageSayingTheTaskDoesntExist() {
        TodoList todoList = new TodoList();
        todoList.add("cook dinner");
        todoList.add("laundry");
        todoList.add("grocery shopping");
        todoList.taskRemove("laundry");

        String message = todoList.taskSearch("laundry");

        Assertions.assertEquals("Task is not on your list", message);
    }

    @Test
    public void shouldReturnTheWholeTodoListAlphabeticallyAscending() {
        TodoList todoList = new TodoList();
        todoList.add("cook dinner");
        todoList.add("laundry");
        todoList.add("grocery shopping");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("cook dinner");
        expected.add("grocery shopping");
        expected.add("laundry");

        ArrayList<String> actual = todoList.taskList();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnTheWholeTodoListAlphabeticallyDescending() {
        TodoList todoList = new TodoList();
        todoList.add("cook dinner");
        todoList.add("laundry");
        todoList.add("grocery shopping");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("laundry");
        expected.add("grocery shopping");
        expected.add("cook dinner");

        ArrayList<String> actual = todoList.taskList();

        Assertions.assertEquals(expected,actual);
    }
}
