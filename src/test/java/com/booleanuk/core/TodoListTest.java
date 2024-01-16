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
    public void addTaskTest() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask(new Task("Do laundry", false)));
        Assertions.assertTrue(todoList.addTask(new Task("Walk dog", true)));
        Assertions.assertTrue(todoList.addTask(new Task("Clean Kitchen")));

        Assertions.assertEquals("Do laundry", todoList.tasks.get(0).name);
        Assertions.assertFalse(todoList.tasks.get(0).complete);
        Assertions.assertEquals("Walk dog", todoList.tasks.get(1).name);
        Assertions.assertTrue(todoList.tasks.get(1).complete);
        Assertions.assertEquals("Clean Kitchen", todoList.tasks.get(2).name);
        Assertions.assertFalse(todoList.tasks.get(2).complete);

    }

    @Test
    public void showTasksTest() {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task("Do laundry", false));
        todoList.addTask(new Task("Walk dog", true));

        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(new Task("Do laundry", false));
        listOfTasks.add(new Task("Do laundry", true));
        Assertions.assertEquals(listOfTasks, todoList.showTasks());

    }
}
