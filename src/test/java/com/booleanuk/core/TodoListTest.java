package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {

    TodoList todoList;

    @BeforeEach
    public void setUp(){
        todoList = new TodoList();
    }

    @Test
    public void testAddTask(){
        Task task = new Task("first task", false);
        todoList.addTask(task);
        List<Task> tasks = todoList.getAllTasks();
        Assertions.assertEquals(1, tasks.size());
    }

    @Test
    public void testAddAnotherTask(){
        Task task = new Task("first task", false);
        todoList.addTask(task);
        List<Task> tasks = todoList.getAllTasks();
        Assertions.assertEquals(tasks.get(0).content, task.getContent());
    }

    @Test
    public void testAddTwoTasks(){
        Task task = new Task("first task", false);
        Task secondTask = new Task("second task", false);
        todoList.addTask(task);
        todoList.addTask(secondTask);
        List<Task> tasks = todoList.getAllTasks();
        Assertions.assertEquals(2, tasks.size());
    }
    @Test
    public void testAddBooleanTest(){
        Task task = new Task("first task", false);
        todoList.addTask(task);
        List<Task> tasks = todoList.getAllTasks();
        Assertions.assertFalse(tasks.isEmpty());
    }

    @Test
    public void testGetAllTasks(){
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
}
