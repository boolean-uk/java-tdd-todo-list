package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListExtensionExtensionTest {
    @Test
    public void testCreatingTodoListExtension() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertNotNull(todoList, "The TodoListExtension object should not be null after creation");
    }

    @Test
    public void testAddTask() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task = new TaskExtension("task name", "task description");
        Assertions.assertTrue(todoList.addTask(task, false), "The task should be added to the TodoListExtension");

        Assertions.assertFalse(todoList.addTask(null, false), "The task should not be added to the TodoListExtension");
    }

    @Test
    public void testRemoveTask() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task = new TaskExtension("task name", "task description");
        todoList.addTask(task, false);
        Assertions.assertTrue(todoList.removeTask(task), "The task should be removed from the TodoListExtension");

        Assertions.assertFalse(todoList.removeTask(null), "The task should be removed from the TodoListExtension");

        Assertions.assertFalse(todoList.removeTask(task), "The task should not be in the list anymore");
    }

    @Test
    public void testGetAllTasks() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task1 = new TaskExtension("task name 1", "task description 1");
        TaskExtension task2 = new TaskExtension("task name 2", "task description 2");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);
        Assertions.assertEquals(2, todoList.getAllTasks(true).size(), "The number of tasks should be 2");

        todoList.removeTask(task1);
        Assertions.assertEquals(1, todoList.getAllTasks(true).size(), "The number of tasks should be 1");

        todoList.removeTask(task2);
        Assertions.assertEquals(0, todoList.getAllTasks(true).size(), "The number of tasks should be 0");

        TaskExtension task3 = new TaskExtension("task name 3", "task description 3");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);
        todoList.addTask(task3, false);

        List <TaskExtension> allTasks = todoList.getAllTasks(true);
        Assertions.assertEquals("task name 1", allTasks.get(0).getName(), "The first task name should be 'task name 1'");
        Assertions.assertEquals("task name 2", allTasks.get(1).getName(), "The Second task name should be 'task name 2'");
        Assertions.assertEquals("task name 3", allTasks.get(2).getName(), "The Second task name should be 'task name 3'");

        List <TaskExtension> allTasksDesc = todoList.getAllTasks(false);
        Assertions.assertEquals("task name 3", allTasksDesc.get(0).getName(), "The first task name should be 'task name 3'");
        Assertions.assertEquals("task name 2", allTasksDesc.get(1).getName(), "The Second task name should be 'task name 2'");
        Assertions.assertEquals("task name 1", allTasksDesc.get(2).getName(), "The Second task name should be 'task name 1'");


    }

    @Test
    public void testChangeTaskStatus() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task1 = new TaskExtension("task name 1", "task description 1");
        TaskExtension task2 = new TaskExtension("task name 2", "task description 2");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);

        Assertions.assertTrue(todoList.changeTaskStatus(task1.getId(), true), "The task status should be changed to true");
        Assertions.assertFalse(todoList.changeTaskStatus(null, true), "The task status should be changed to true");

        TaskExtension task3 = new TaskExtension("task name 3", "task description 3");
        Assertions.assertFalse(todoList.changeTaskStatus(task3.getId(), true), "Should return false if the task is not in the list");
    }

    @Test
    public void testGetCompleteTasks() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task1 = new TaskExtension("task name 1", "task description 1");
        TaskExtension task2 = new TaskExtension("task name 2", "task description 2");
        todoList.addTask(task1, true);
        todoList.addTask(task2, false);
        Assertions.assertEquals(1, todoList.getCompleteTasks().size(), "The number of complete tasks should be 1");
    }

    @Test
    public void testGetIncompleteTasks() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task1 = new TaskExtension("task name 1", "task description 1");
        TaskExtension task2 = new TaskExtension("task name 2", "task description 2");
        todoList.addTask(task1, true);
        todoList.addTask(task2, false);
        Assertions.assertEquals(1, todoList.getIncompleteTasks().size(), "The number of complete tasks should be 1");
    }

    @Test
    public void testSearchTask() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task1 = new TaskExtension("task name 1", "task description 1");
        TaskExtension task2 = new TaskExtension("task name 2", "task description 2");
        todoList.addTask(task1, false);
        Assertions.assertTrue(todoList.searchTask(task1), "The task should be found in the list");

        Assertions.assertFalse(todoList.searchTask(null), "The task should not be found in the list");
        Assertions.assertFalse(todoList.searchTask(task2), "The task should not be found in the list");

    }

    @Test
    public void testGetTask() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task1 = new TaskExtension("task name 1", "task description 1");
        TaskExtension task2 = new TaskExtension("task name 2", "task description 2");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);
        Assertions.assertTrue(todoList.getTask(task1.getId()), "The task should be found in the list");

        Assertions.assertFalse(todoList.getTask(null), "The task should not be found in the list");
        Assertions.assertFalse(todoList.getTask("123"), "The task should not be found in the list");
    }

    // I want to update the name of a task by providing its ID and a new name.

    @Test
    public void testUpdateTaskName() {
        TodoListExtension todoList = new TodoListExtension();
        TaskExtension task1 = new TaskExtension("task name 1", "task description 1");
        todoList.addTask(task1, false);
        Assertions.assertTrue(todoList.updateTaskName(task1.getId(), "new task name"), "The task name should be updated");
        Assertions.assertEquals("new task name", task1.getName(), "The task name should be 'new task name'");

    }
}

