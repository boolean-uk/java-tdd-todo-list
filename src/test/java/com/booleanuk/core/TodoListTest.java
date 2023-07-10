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

    @Test
    public void testGetCompleteTasks(){

        TodoList list = new TodoList();

        Assertions.assertArrayEquals(new ArrayList<Task>().toArray(), list.getCompletedTasks().toArray());

        Task task1 = new Task("Go swimming", true);
        Task task2 = new Task("Go for a walk", false);
        Task task3 = new Task("Wash dishes", true);

        list.tasks.add(task1);
        list.tasks.add(task2);
        list.tasks.add(task3);

        ArrayList<Task> completedTasks = new ArrayList<>();
        completedTasks.add(task1);
        completedTasks.add(task3);

        Assertions.assertArrayEquals(completedTasks.toArray(), list.getCompletedTasks().toArray());
    }

    @Test
    public void testGetIncompleteTasks(){

        TodoList list = new TodoList();

        Assertions.assertArrayEquals(new ArrayList<Task>().toArray(), list.getIncompleteTasks().toArray());

        Task task1 = new Task("Go swimming", true);
        Task task2 = new Task("Go for a walk", false);
        Task task3 = new Task("Wash dishes", true);

        list.tasks.add(task1);
        list.tasks.add(task2);
        list.tasks.add(task3);

        ArrayList<Task> incompleteTasks = new ArrayList<>();
        incompleteTasks.add(task2);

        Assertions.assertArrayEquals(incompleteTasks.toArray(), list.getIncompleteTasks().toArray());
    }

    @Test
    public void testRemoveTask(){
        TodoList list = new TodoList();

        Task task1 = new Task("Go swimming", true);
        Task task2 = new Task("Go for a walk", false);
        Task task3 = new Task("Wash dishes", true);

        list.tasks.add(task1);
        list.tasks.add(task2);
        list.tasks.add(task3);

        list.removeTask("Go for a walk");
        Assertions.assertFalse(list.tasks.contains(task2));


        Assertions.assertFalse(list.removeTask("A task that does not exist"));
    }

    @Test
    public void testDisplayTasksAlphabeticallyAscending() {
        TodoList list = new TodoList();


        Assertions.assertEquals("No tasks to be sorted", list.displayTasksAlphabeticallyAscending());


        Task task1 = new Task("Go swimming", true);
        Task task2 = new Task("Go for a walk", false);
        Task task3 = new Task("Wash dishes", true);

        list.tasks.add(task1);
        list.tasks.add(task2);
        list.tasks.add(task3);

        String testResult = "Go for a walk, incomplete\nGo swimming, complete\nWash dishes, complete\n";
        Assertions.assertEquals(testResult, list.displayTasksAlphabeticallyAscending());
    }

    @Test
    public void testDisplayTasksAlphabeticallyDescending() {
        TodoList list = new TodoList();


        Assertions.assertEquals("No tasks to be sorted", list.displayTasksAlphabeticallyDescending());


        Task task1 = new Task("Go swimming", true);
        Task task2 = new Task("Go for a walk", false);
        Task task3 = new Task("Wash dishes", true);

        list.tasks.add(task1);
        list.tasks.add(task2);
        list.tasks.add(task3);

        String testResult = "Wash dishes, complete\nGo swimming, complete\nGo for a walk, incomplete\n";
        Assertions.assertEquals(testResult, list.displayTasksAlphabeticallyDescending());
    }
}
