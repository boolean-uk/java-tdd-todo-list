package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListTest {
    @Test
    public void testCreatingTodoList() {
        TodoList todoList = new TodoList();
        Assertions.assertNotNull(todoList, "The TodoList object should not be null after creation");
    }

    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("task name", "task description");
        Assertions.assertTrue(todoList.addTask(task, false), "The task should be added to the TodoList");

        Assertions.assertFalse(todoList.addTask(null, false), "The task should not be added to the TodoList");
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("task name", "task description");
        todoList.addTask(task, false);
        Assertions.assertTrue(todoList.removeTask(task), "The task should be removed from the TodoList");

        Assertions.assertFalse(todoList.removeTask(null), "The task should be removed from the TodoList");

        Assertions.assertFalse(todoList.removeTask(task), "The task should not be in the list anymore");
    }

    @Test
    public void testGetAllTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("task name 1", "task description 1");
        Task task2 = new Task("task name 2", "task description 2");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);
        Assertions.assertEquals(2, todoList.getAllTasks(true).size(), "The number of tasks should be 2");

        todoList.removeTask(task1);
        Assertions.assertEquals(1, todoList.getAllTasks(true).size(), "The number of tasks should be 1");

        todoList.removeTask(task2);
        Assertions.assertEquals(0, todoList.getAllTasks(true).size(), "The number of tasks should be 0");

        Task task3 = new Task("task name 3", "task description 3");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);
        todoList.addTask(task3, false);

        List <Task> allTasks = todoList.getAllTasks(true);
        Assertions.assertEquals("task name 1", allTasks.get(0).getName(), "The first task name should be 'task name 1'");
        Assertions.assertEquals("task name 2", allTasks.get(1).getName(), "The Second task name should be 'task name 2'");
        Assertions.assertEquals("task name 3", allTasks.get(2).getName(), "The Second task name should be 'task name 3'");

        List <Task> allTasksDesc = todoList.getAllTasks(false);
        Assertions.assertEquals("task name 3", allTasksDesc.get(0).getName(), "The first task name should be 'task name 3'");
        Assertions.assertEquals("task name 2", allTasksDesc.get(1).getName(), "The Second task name should be 'task name 2'");
        Assertions.assertEquals("task name 1", allTasksDesc.get(2).getName(), "The Second task name should be 'task name 1'");


    }

    @Test
    public void testChangeTaskStatus() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("task name 1", "task description 1");
        Task task2 = new Task("task name 2", "task description 2");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);

        Assertions.assertTrue(todoList.changeTaskStatus(task1, true), "The task status should be changed to true");
        Assertions.assertFalse(todoList.changeTaskStatus(null, true), "The task status should be changed to true");

        Task task3 = new Task("task name 3", "task description 3");
        Assertions.assertFalse(todoList.changeTaskStatus(task3, true), "Should return false if the task is not in the list");
    }

    @Test
    public void testGetCompleteTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("task name 1", "task description 1");
        Task task2 = new Task("task name 2", "task description 2");
        todoList.addTask(task1, true);
        todoList.addTask(task2, false);
        Assertions.assertEquals(1, todoList.getCompleteTasks().size(), "The number of complete tasks should be 1");
    }

    @Test
    public void testGetIncompleteTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("task name 1", "task description 1");
        Task task2 = new Task("task name 2", "task description 2");
        todoList.addTask(task1, true);
        todoList.addTask(task2, false);
        Assertions.assertEquals(1, todoList.getIncompleteTasks().size(), "The number of complete tasks should be 1");
    }

    @Test
    public void testSearchTask() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("task name 1", "task description 1");
        Task task2 = new Task("task name 2", "task description 2");
        todoList.addTask(task1, false);
        Assertions.assertTrue(todoList.searchTask(task1), "The task should be found in the list");

        Assertions.assertFalse(todoList.searchTask(null), "The task should not be found in the list");
        Assertions.assertFalse(todoList.searchTask(task2), "The task should not be found in the list");

    }

}

