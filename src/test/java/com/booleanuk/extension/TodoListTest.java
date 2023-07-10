package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TodoListTest {

    TodoList todoList;

    @BeforeEach
    public void setUp() {
        todoList = new TodoList();
    }

    @Test
    public void testGetTask(){
        Task task = new Task("first task", false, 1);
        Task secondTask = new Task("second task", false, 2);
        Task thirdTask = new Task("third task", false, 3);
        todoList.tasks.add(task);
        todoList.tasks.add(secondTask);
        todoList.tasks.add(thirdTask);
        Assertions.assertEquals(secondTask, todoList.getTask(2));
    }

    @Test
    public void testUpdateTask(){
        Task task = new Task("first task", false, 1);
        Task secondTask = new Task("second task", false, 2);
        Task thirdTask = new Task("third task", false, 3);
        todoList.tasks.add(task);
        todoList.tasks.add(secondTask);
        todoList.tasks.add(thirdTask);
        todoList.updateTask("new second task", 2);
        Assertions.assertEquals(secondTask.getContent(), "new second task");
    }

    @Test
    public void testChangeStatusOfTask(){
        Task task = new Task("first task", false, 1);
        Task secondTask = new Task("second task", false, 2);
        Task thirdTask = new Task("third task", false, 3);
        todoList.tasks.add(task);
        todoList.tasks.add(secondTask);
        todoList.tasks.add(thirdTask);
        todoList.changeStatusOfTask(3);
        Assertions.assertTrue(thirdTask.isComplete());
    }

    @Test
    public void testGetDateAndTimeTask(){
        Task task = new Task("first task", false, 1);
        Task secondTask = new Task("second task", false, 2);
        Task thirdTask = new Task("third task", false, 3);
        todoList.tasks.add(task);
        todoList.tasks.add(secondTask);
        todoList.tasks.add(thirdTask);
        Assertions.assertEquals(secondTask.getDateTime(),todoList.getDateAndTimeTask(2));
    }
}
