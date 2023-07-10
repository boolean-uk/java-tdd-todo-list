package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        testResult = "Do the laundry, incomplete\nDo the grocery shopping, complete\n";
        Assertions.assertEquals(testResult, list.displayAllTasks());
    }


    @Test
    public void testUpdateTask() {
        TodoList list = new TodoList();
        Assertions.assertFalse(list.updateTask("Clean the window"));

        Task task1 = new Task("Do the homework", false);
        list.tasks.add(task1);
        list.updateTask(task1.getName());
        Assertions.assertTrue(list.tasks.get(list.tasks.indexOf(task1)).isCompleted());
    }
    @Test
    public void testSetTaskStatus() {
        TodoList list = new TodoList();
        Task task = new Task("Do the laundry", false);
        list.addTask(task);
        list.setTaskStatus(0, true);
        Assertions.assertTrue(list.tasks.get(0).isCompleted());
    }
    @Test
    public void testGetCompleteTasks() {
        TodoList list = new TodoList();
        Task task1 = new Task("Do the laundry", true);
        Task task2 = new Task("Do the dishes", false);
        list.addTask(task1);
        list.addTask(task2);
        List<Task> completeTasks = list.getCompleteTasks();
        Assertions.assertEquals(1, completeTasks.size());
        Assertions.assertEquals(task1, completeTasks.get(0));
    }
    @Test
    public void testGetIncompleteTasks() {
        TodoList list = new TodoList();
        Task task1 = new Task("Do the laundry", true);
        Task task2 = new Task("Do the dishes", false);
        list.addTask(task1);
        list.addTask(task2);
        List<Task> incompleteTasks = list.getIncompleteTasks();
        Assertions.assertEquals(1, incompleteTasks.size());
        Assertions.assertEquals(task2, incompleteTasks.get(0));
    }
    @Test
    public void testRemoveTask() {
        TodoList list = new TodoList();
        Task task1 = new Task("Do the laundry", false);
        Task task2 = new Task("Do the dishes", false);
        list.addTask(task1);
        list.addTask(task2);
        list.removeTask(0);
        Assertions.assertEquals(1, list.tasks.size());
        Assertions.assertEquals(task2, list.tasks.get(0));
    }
    @Test
    public void testGetAllTasksOrderedAscending() {
        TodoList list = new TodoList();
        Task task1 = new Task("Do the dishes", false);
        Task task2 = new Task("Do the laundry", true);
        Task task3 = new Task("Do the grocery shopping", false);
        list.addTask(task1);
        list.addTask(task2);
        list.addTask(task3);
        List<Task> sortedTasks = list.getAllTasksOrderedAscending();
        List<Task> expectedOrder = List.of(task2, task1, task3);

        Set<Task> sortedSet = new HashSet<>(sortedTasks);
        Set<Task> expectedSet = new HashSet<>(expectedOrder);

        Assertions.assertEquals(expectedSet, sortedSet);
    }




    @Test
    public void testGetAllTasksOrderedDescending() {
        TodoList list = new TodoList();
        Task task1 = new Task("Do the dishes", false);
        Task task2 = new Task("Do the laundry", true);
        Task task3 = new Task("Do the grocery shopping", false);
        list.addTask(task1);
        list.addTask(task2);
        list.addTask(task3);
        List<Task> sortedTasks = list.getAllTasksOrderedDescending();
        List<Task> expectedOrder = List.of(task3, task1, task2);

        Set<Task> sortedSet = new HashSet<>(sortedTasks);
        Set<Task> expectedSet = new HashSet<>(expectedOrder);

        Assertions.assertEquals(expectedSet, sortedSet);
    }


}
