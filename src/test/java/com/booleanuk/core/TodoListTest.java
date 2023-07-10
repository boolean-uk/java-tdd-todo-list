package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {

    TodoList todoList;

    @BeforeEach
    public void setUp() {
        todoList = new TodoList();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("first task", false);
        todoList.addTask(task);
        List<Task> tasks = todoList.tasks;
        Assertions.assertEquals(1, tasks.size());
    }

    @Test
    public void testAddAnotherTask() {
        Task task = new Task("first task", false);
        todoList.addTask(task);
        List<Task> tasks = todoList.tasks;
        Assertions.assertEquals(tasks.get(0).content, task.getContent());
    }

    @Test
    public void testAddTwoTasks() {
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", false);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        List<Task> tasks = todoList.tasks;
        Assertions.assertEquals(2, tasks.size());
    }

    @Test
    public void testAddBooleanTest() {
        Task task = new Task("first task", false);
        todoList.addTask(task);
        List<Task> tasks = todoList.tasks;
        Assertions.assertFalse(tasks.isEmpty());
    }

    @Test
    public void testGetAllTasks() {
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", false);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        List<Task> expectedTasks = new ArrayList<>();
        List<Task> tasks = todoList.getAllTasks();
        expectedTasks.add(task);
        expectedTasks.add(secondTask);
        Assertions.assertEquals(expectedTasks, tasks);
    }

    @Test
    public void testchangeStatusOfTask() {
        Task task = new Task("first task", false);
        todoList.addTask(task);
        todoList.changeStatusOfTask("first task");
        Assertions.assertTrue(task.isComplete());
    }

    @Test
    public void testChangeStatusOfSecondTask() {
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", true);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        todoList.changeStatusOfTask("second task");
        Assertions.assertFalse(task.isComplete());
    }

    @Test
    public void testGetAllCompletedTasks() {
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", true);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        List<Task> completedTasks = todoList.getAllCompletedTasks();
        Assertions.assertEquals(1, completedTasks.size());
    }

    @Test
    public void testGetAllUncompletedTasks() {
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", false);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        List<Task> uncompletedTasks = todoList.getAllUncompletedTasks();
        Assertions.assertEquals(2, uncompletedTasks.size());
    }

    @Test
    public void testSearchForATask() {
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", false);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        Assertions.assertEquals("", todoList.searchForATask("first task"));
        Assertions.assertEquals("It wasn't found", todoList.searchForATask("task"));
    }

    @Test
    public void testRemoveTask(){
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", false);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        todoList.removeTask("first task");
        Assertions.assertEquals(1, todoList.tasks.size());
    }

    @Test
    public void testAllTasksOrderedAsc(){
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", false);
        Task thirdTask = new Task("one task", false);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        todoList.addTask(thirdTask);
        List<Task> orderedTasksAsc = todoList.allTasksOrderedAsc();
        Assertions.assertEquals("first task", orderedTasksAsc.get(0).getContent());
        Assertions.assertEquals("one task", orderedTasksAsc.get(1).getContent());
        Assertions.assertEquals("second task", orderedTasksAsc.get(2).getContent());
    }

    @Test
    public void testAllTasksOrderedDesc(){
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", false);
        Task thirdTask = new Task("one task", false);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        todoList.addTask(thirdTask);
        List<Task> orderedTasksDesc = todoList.allTasksOrderedDesc();
        Assertions.assertEquals("second task", orderedTasksDesc.get(0).getContent());
        Assertions.assertEquals("one task", orderedTasksDesc.get(1).getContent());
        Assertions.assertEquals("first task", orderedTasksDesc.get(2).getContent());
    }

}
