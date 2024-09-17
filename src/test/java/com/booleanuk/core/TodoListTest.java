package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class TodoListTest {

    TodoList todoList = new TodoList();

    @Test
    public void testAddTask() {
        Assertions.assertInstanceOf(Task.class, todoList.addTask("Dishes"));
        Task task = todoList.addTask("Vacuum");
        Assertions.assertEquals(todoList.tasks.get(1), task);
    }

    @Test
    public void testShowTasks() {
        Task[] array = new Task[] { new Task("Dishes"), new Task("Vacuum") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String tasksString = todoList.showTasks(todoList.tasks);
        Assertions.assertTrue(tasksString.contains("Dishes"));
        Assertions.assertTrue(tasksString.contains("Incomplete"));
    }

    @Test
    public void testSetStatus() {
        Task task = new Task("Dishes");
        Assertions.assertFalse(task.getStatus());
        task.setStatus(true);
        Assertions.assertTrue(task.getStatus());
    }

    @Test
    public void testShowCompleteTasks() {
        Task[] array = new Task[] { new Task("Dishes", false), new Task("Vacuum", true), new Task("Empty Trash", false), new Task("Walk the dog", true) };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String completedTasksString = todoList.showCompleteTasks();
        Assertions.assertTrue(completedTasksString.contains("Vacuum"));
        Assertions.assertTrue(completedTasksString.contains("Walk the dog"));
        Assertions.assertFalse(completedTasksString.contains("Dishes"));
        Assertions.assertFalse(completedTasksString.contains("Empty Trash"));
    }

    @Test
    public void testShowIncompleteTasks() {
        Task[] array = new Task[] { new Task("Dishes", false), new Task("Vacuum", true), new Task("Empty trash", false), new Task("Walk the dog", true) };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String completedTasksString = todoList.showIncompleteTasks();
        Assertions.assertTrue(completedTasksString.contains("Empty trash"));
        Assertions.assertTrue(completedTasksString.contains("Dishes"));
        Assertions.assertFalse(completedTasksString.contains("Vacuum"));
        Assertions.assertFalse(completedTasksString.contains("Walk the dog"));
    }

    @Test
    public void testSearchForNameFound() {
        Task[] array = new Task[] { new Task("Dishes"), new Task("Vacuum"), new Task("Empty Trash"), new Task("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String foundMessage = todoList.search("Dishes");
        Assertions.assertEquals("Dishes was found", foundMessage);
    }

    @Test
    public void testSearchForNameNotFound() {
        Task[] array = new Task[] { new Task("Dishes"), new Task("Vacuum"), new Task("Empty Trash"), new Task("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String notFoundMessage = todoList.search("Wash floor");
        Assertions.assertEquals("Wash floor was not found", notFoundMessage);
    }

    @Test
    public void testDeleteExistingTask() {
        Task[] array = new Task[] { new Task("Dishes"), new Task("Vacuum"), new Task("Empty Trash"), new Task("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        boolean deleted = todoList.delete("Dishes");
        Assertions.assertTrue(deleted);
    }

    @Test
    public void testOrderTasksAsc() {
        Task[] array = new Task[] { new Task("Dishes"), new Task("Vacuum"), new Task("Empty trash"), new Task("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        ArrayList<Task> sortedAsc = todoList.orderTasksAsc();
        Assertions.assertEquals("Dishes", sortedAsc.get(0).getName());
        Assertions.assertEquals("Empty trash", sortedAsc.get(1).getName());
    }

    @Test
    public void testOrderTasksDesc() {
        Task[] array = new Task[] { new Task("Dishes"), new Task("Vacuum"), new Task("Empty Trash"), new Task("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        ArrayList<Task> sortedAsc = todoList.orderTasksDesc();
        Assertions.assertEquals("Walk the dog", sortedAsc.get(0).getName());
        Assertions.assertEquals("Vacuum", sortedAsc.get(1).getName());
    }

}
