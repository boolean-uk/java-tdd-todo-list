package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;

class TodoListTest {

    @Test
    public void testAddTask() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertInstanceOf(TaskExtension.class, todoList.addTask("Dishes"));
        TaskExtension task = todoList.addTask("Vacuum");
        Assertions.assertEquals(todoList.tasks.get(1), task);
    }

    @Test
    public void testShowTasks() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String tasksString = todoList.showTasks(todoList.tasks);
        Assertions.assertTrue(tasksString.contains("Dishes"));
        Assertions.assertTrue(tasksString.contains("Incomplete"));
    }

    @Test
    public void testSetStatus() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task = new TaskExtension("Dishes");
        Assertions.assertFalse(task.getStatus());
        task.setStatus(true);
        Assertions.assertTrue(task.getStatus());
    }

    @Test
    public void testShowCompleteTasks() {
        TodoListExtension todoList = new TodoListExtension();
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
        TodoListExtension todoList = new TodoListExtension();
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
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String foundMessage = todoList.search("Dishes");
        Assertions.assertEquals("Dishes was found", foundMessage);
    }

    @Test
    public void testSearchForNameNotFound() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        String notFoundMessage = todoList.search("Wash floor");
        Assertions.assertEquals("Wash floor was not found", notFoundMessage);
    }

    @Test
    public void testDeleteExistingTask() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        boolean deleted = todoList.delete("Dishes");
        Assertions.assertTrue(deleted);
    }

    @Test
    public void testOrderTasksAsc() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        ArrayList<TaskExtension> sortedAsc = todoList.orderTasksAsc();
        Assertions.assertEquals("Dishes", sortedAsc.get(0).getName());
        Assertions.assertEquals("Empty trash", sortedAsc.get(1).getName());
    }

    @Test
    public void testOrderTasksDesc() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        ArrayList<TaskExtension> sortedAsc = todoList.orderTasksDesc();
        Assertions.assertEquals("Walk the dog", sortedAsc.get(0).getName());
        Assertions.assertEquals("Vacuum", sortedAsc.get(1).getName());
    }

    @Test
    public void testSearchById() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes"), new TaskExtension("Vacuum"), new TaskExtension("Empty Trash"), new TaskExtension("Walk the dog") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        TaskExtension task = todoList.searchById(1);
        Assertions.assertEquals("Dishes", task.getName());
    }

    @Test
    public void testSetNameById() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        System.out.println(todoList.tasks.get(0).getName());
        Assertions.assertTrue(todoList.setNameById(1, "Make Dinner"));
        Assertions.assertFalse(todoList.setNameById(3, "Make Dinner"));
    }

    @Test
    public void testSetStatusById() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension[] array = new TaskExtension[] { new TaskExtension("Dishes") };
        todoList.tasks = new ArrayList<>(Arrays.asList(array));
        Assertions.assertTrue(todoList.setStatusById(1, true));
        Assertions.assertFalse(todoList.setStatusById(3, true));
    }

    @Test
    public void testTimeStamp() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task = new TaskExtension("Dishes");
        Assertions.assertInstanceOf(Timestamp.class, task.getCreatedAt());
    }

}
