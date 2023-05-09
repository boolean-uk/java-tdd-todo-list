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
    public void testSearchTask() {      //Testing this public method gives us assurance that the private method it calls also works correctly
        TodoList list = new TodoList();
        String testResult = "The task could not be found.";
        Assertions.assertEquals(testResult, list.searchTask("Wash dishes"));

        testResult = "The task was found.";
        list.tasks.add(new Task("Wash dishes", false));
        Assertions.assertEquals(testResult, list.searchTask("Wash dishes"));
    }

    @Test
    public void testAddTask() {
        TodoList list = new TodoList();
        Task testTask = new Task("Go shopping", false);
        list.addTask(testTask);
        Assertions.assertTrue(list.tasks.contains(testTask));
    }

    @Test
    public void testDisplayAllTasks() {
        TodoList list = new TodoList();
        String testResult = "No tasks were found.";
        Assertions.assertEquals(testResult, list.displayAllTasks());

        Task task1 = new Task("Wash dishes", false);
        Task task2 = new Task("Go swimming", true);
        list.tasks.add(task1);
        list.tasks.add(task2);
        testResult = "Wash dishes, incomplete\nGo swimming, complete\n";
        Assertions.assertEquals(testResult, list.displayAllTasks());
    }

    @Test
    public void testUpdateTask() {
        TodoList list = new TodoList();
        Assertions.assertFalse(list.updateTask("Slide down fireman pole"));

        Task task1 = new Task("Jump on bed", false);
        list.tasks.add(task1);
        list.updateTask(task1.name);
        Assertions.assertTrue(list.tasks.get(list.tasks.indexOf(task1)).completed);
    }



}
