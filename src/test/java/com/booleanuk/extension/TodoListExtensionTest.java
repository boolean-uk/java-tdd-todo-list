package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;

class TodoListTest {

    TodoListExtension todoList = new TodoListExtension();

    @Test
    public void testAddTask() {
        Assertions.assertInstanceOf(TaskExtension.class, todoList.addTask("Dishes"));
        TaskExtension task = todoList.addTask("Vacuum");
        Assertions.assertEquals(todoList.tasks.get(1), task);
    }

    @Test
    public void testShowTasks() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String tasksString = todoList.showTasks(todoList.tasks);
        Assertions.assertTrue(tasksString.contains("Dishes"));
        Assertions.assertTrue(tasksString.contains("Incomplete"));
    }

    @Test
    public void testSetStatus() {
        TaskExtension task = new TaskExtension("Dishes");
        Assertions.assertFalse(task.getStatus());
        task.setStatus(true);
        Assertions.assertTrue(task.getStatus());
    }

    @Test
    public void testShowCompleteTasks() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes", false), new TaskExtension("Vacuum", true), new TaskExtension("Empty Trash", false), new TaskExtension("Walk the dog", true) };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String completedTasksString = todoList.showCompleteTasks();
        Assertions.assertTrue(completedTasksString.contains("Vacuum"));
        Assertions.assertTrue(completedTasksString.contains("Walk the dog"));
        Assertions.assertFalse(completedTasksString.contains("Dishes"));
        Assertions.assertFalse(completedTasksString.contains("Empty Trash"));
    }

    @Test
    public void testShowIncompleteTasks() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes", false), new TaskExtension("Vacuum", true), new TaskExtension("Empty trash", false), new TaskExtension("Walk the dog", true) };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String completedTasksString = todoList.showIncompleteTasks();
        Assertions.assertTrue(completedTasksString.contains("Empty trash"));
        Assertions.assertTrue(completedTasksString.contains("Dishes"));
        Assertions.assertFalse(completedTasksString.contains("Vacuum"));
        Assertions.assertFalse(completedTasksString.contains("Walk the dog"));
    }

    @Test
    public void testSearchForNameFound() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String foundMessage = todoList.search("Dishes");
        Assertions.assertEquals("Dishes was found", foundMessage);
    }

    @Test
    public void testSearchForNameNotFound() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String notFoundMessage = todoList.search("Wash floor");
        Assertions.assertEquals("Wash floor was not found", notFoundMessage);
    }

    @Test
    public void testDeleteExistingTask() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        boolean deleted = todoList.delete("Dishes");
        Assertions.assertTrue(deleted);
    }

    @Test
    public void testOrderTasksAsc() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        ArrayList<TaskExtension> sortedAsc = todoList.orderTasksAsc();
        Assertions.assertEquals("Dishes", sortedAsc.get(0).getName());
        Assertions.assertEquals("Empty trash", sortedAsc.get(1).getName());
    }

    @Test
    public void testOrderTasksDesc() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        ArrayList<TaskExtension> sortedAsc = todoList.orderTasksDesc();
        Assertions.assertEquals("Walk the dog", sortedAsc.get(0).getName());
        Assertions.assertEquals("Vacuum", sortedAsc.get(1).getName());
    }

    @Test
    public void testSearchById() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String searchString = searchById(1);
        Assertions.assertEquals("Task with id 1 is Dishes", searchString);
    }

    @Test
    public void testSetNameById() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        Assertions.assertTrue(setNameById(1, "Make Dinner"));
        Assertions.assertFalse(setNameById(3, "Make Dinner"));
    }

    @Test
    public void testSetStatusById() {
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        Assertions.assertTrue(setStatusById(1, true));
        Assertions.assertFalse(SetStatusById(3, true));
    }

    @Test
    public void testTimeStamp() {
        TaskExtension task = new TaskExtension("Dishes");
        Assertions.assertInstanceOf(Timestamp.class, task.getCreatedAt());
    }

}
