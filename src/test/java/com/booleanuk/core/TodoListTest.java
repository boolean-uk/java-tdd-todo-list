package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testSearchTask() {
        TodoList list = new TodoList();
        String testResult = "The task could not be found.";
        Assertions.assertEquals(testResult, list.searchTask("Do the laundry"));

        testResult = "The task was found.";
        list.tasks.add(new Task("Do the laundry", false));
        Assertions.assertEquals(testResult, list.searchTask("Do the laundry"));
    }

    @Test
    public void testAddTask() {
        TodoList list = new TodoList();
        Task testTask = new Task("Do the dishes", false);
        list.addTask(testTask);
        Assertions.assertTrue(list.tasks.contains(testTask));
    }

    @Test
    public void testDisplayAllTasks() {
        TodoList list = new TodoList();
        String testResult = "No tasks were found.";
        Assertions.assertEquals(testResult, list.displayAllTasks());

        Task task1 = new Task("Do the laundry", false);
        Task task2 = new Task("Do the grocery shopping", true);
        list.tasks.add(task1);
        list.tasks.add(task2);
        testResult = "Do the laundry, incomplete\n Do the grocery shopping, complete\n";
        Assertions.assertEquals(testResult, list.displayAllTasks());
    }

    @Test
    public void testUpdateTask() {
        TodoList list = new TodoList();
        Assertions.assertFalse(list.updateTask("Clean the window"));

        Task task1 = new Task("Do the homework", false);
        list.tasks.add(task1);
        list.updateTask(task1.name);
        Assertions.assertTrue(list.tasks.get(list.tasks.indexOf(task1)).completed);
    }

}
